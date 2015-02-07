package com.usergravity.bo;

import com.usergravity.data.Movie;
import org.apache.commons.vfs.FileObject;
import org.apache.commons.vfs.FileSystemManager;
import org.apache.commons.vfs.VFS;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * User: Brent Baker
 * Date: 10/30/13
 * Time: 10:32 AM
 */
public class ReadMediaFiles {

    private static final Logger log = LoggerFactory.getLogger(ReadMediaFiles.class);
    private FileSystemManager manager = null;
    private List<Movie> movies;

    public ReadMediaFiles() {
        movies = new ArrayList<Movie>();
    }

    public List<Movie> getMovies() {
        return movies;
    }

    public void processFolder(String searchDirectory) throws Exception{
        FileObject dir = null;
        try {
            if (manager == null) {
                manager = VFS.getManager();
            }
             dir = manager.resolveFile(searchDirectory);

            FileObject[] dirList= dir.getChildren();


            for (FileObject file : dirList) {
                if (file.getName().getBaseName().endsWith(".txt") && file.getName().getBaseName().contains("MO")) {
                    log.info("Processing File: {}", file.getURL());
                    loadMovies(file);
                    file.close();
                    break;
                }
                file.close();
            }
        } catch (Exception ex) {
            throw ex;
        } finally {
            if (dir != null) {
                dir.close();
            }
        }

    }


    private void loadMovies(FileObject file) throws Exception{
        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new InputStreamReader(file.getContent().getInputStream()));
            String record = reader.readLine();
            while((record = reader.readLine()) != null) {
                if (!record.isEmpty()) {
                    addMovieToList(record);
                }


            }
        } catch (Exception ex) {
            throw ex;
        } finally {
            reader.close();
        }

    }

    private boolean isItemEmpty(String[] array, int i) {
        boolean status = true;
        if (array.length >= i && !array[i].isEmpty()) {
            status = false;
        }
        return status;
    }

    private void addMovieToList(String record) throws Exception{
        try {
            Movie movie = new Movie();
            String[] sep = record.split("\\|");
            if (!isItemEmpty(sep, 1)) {
                movie.setTitle(sep[1]);

                if (!isItemEmpty(sep, 2)) {
                    movie.setRunTime(sep[2]);
                }
                addToList(movie.getGenre(), sep[3]);
                addToList(movie.getGenre(), sep[4]);
                if (!isItemEmpty(sep, 5)) {
                    movie.setRating(sep[5]);
                }
                if (!isItemEmpty(sep, 7)) {
                    movie.setUrl(sep[7]);
                }
                addToList(movie.getActors(), sep[8]);
                addToList(movie.getActors(), sep[9]);
                addToList(movie.getActors(), sep[10]);
                addToList(movie.getActors(), sep[11]);
                addToList(movie.getActors(), sep[12]);
                addToList(movie.getActors(), sep[13]);
                addToList(movie.getActors(), sep[14]);
                addToList(movie.getActors(), sep[15]);
                addToList(movie.getActors(), sep[16]);
                addToList(movie.getActors(), sep[17]);
                addCommaDelimitedToList(movie.getDirectors(), sep[18]);
                addCommaDelimitedToList(movie.getWriters(), sep[19]);
                addCommaDelimitedToList(movie.getProducers(), sep[20]);
                if (!isItemEmpty(sep, 22)) {
                    movie.setRelease(stringToDate(sep[22].toString()));
                }
                if (!isItemEmpty(sep, 29)) {
                    movie.setSynopsis(sep[29]);
                }
                movies.add(movie);
            }
        } catch (Exception ex) {
            throw ex;
        }


    }

    private void addToList(List<String> list, String item) {
        if (item != null && !item.isEmpty()) {
          list.add(item);
        }
    }


    private void addCommaDelimitedToList(List<String> list, String item) {
        if (item != null && !item.isEmpty()) {
            String[] subItems = item.split(",");
            for (String element : subItems) {
                list.add(element);
            }
        }
    }

    private Date stringToDate(String dateString) throws Exception {
        Pattern p = Pattern.compile("^(0[1-9]|1[0-2])[/](0[1-9]|2[0-9]|3[0-1])[/]?(19|20\\d\\d$)");
        Matcher m = p.matcher(dateString);
        Calendar c = Calendar.getInstance();

        if (m.matches()) {
            c.setTime(new SimpleDateFormat("MM/dd/yyyy", Locale.ENGLISH).parse(dateString));
            c.add(Calendar.DATE, 90);

        } else {
            int maximum = 365;
            int minimum = 1;

            Random rn = new Random();
            int range = maximum - minimum + 1;
            int randomNum =  rn.nextInt(range) + minimum;

            c.setTime(new Date()); // Now use today date.
            c.add(Calendar.DATE, randomNum);
        }
        return  c.getTime();
    }
}

