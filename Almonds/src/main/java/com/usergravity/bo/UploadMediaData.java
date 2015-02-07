package com.usergravity.bo;

import com.jskrepnek.almonds.ParseObject;
import com.usergravity.data.Movie;

import java.util.Date;
import java.util.List;

/**
 * User: Brent Baker
 * Date: 11/12/13
 * Time: 4:53 PM
 */
public class UploadMediaData {

    public void loadMediaData(List<Movie> movies) throws Exception {
        for(Movie movie: movies) {
            if(movie.getTitle() != null) {
                ParseObject events = new ParseObject("Events");
                addList(events, "actor", movie.getActors());
                addList(events, "directors", movie.getDirectors());
                addList(events, "genre", movie.getGenre());
                addList(events, "producers", movie.getProducers());
                addList(events, "writers", movie.getWriters());

                addEventString(events, "rating", movie.getRating());
                addEventDate(events, "release_date", movie.getRelease());
                addEventString(events, "run_time", movie.getRunTime());
                addEventString(events, "synopsis", movie.getSynopsis());
                addEventString(events, "title", movie.getTitle());
                addEventString(events, "url", movie.getUrl());
                events.saveInBackground();
            }
        }
    }

    private void addEventString(ParseObject events, String key, String item) {
        if(item != null) {
            events.put(key, item);
        }
    }

    private void addEventDate(ParseObject events, String key, Date item) {
        if(item != null) {
            events.put(key, item);
        }
    }

    private void addList(ParseObject events, String key, List<String> list) {
        StringBuilder data = new StringBuilder();

        for(String item : list) {
            if(data.length() > 0) {
                data.append(",");
                data.append(item);
            } else {
                data.append(item);
            }
        }
        events.put(key, data.toString());
    }
}
