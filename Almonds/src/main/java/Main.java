import com.jskrepnek.almonds.ParseObject;
import com.usergravity.bo.ReadMediaFiles;
import com.jskrepnek.almonds.Parse;
import com.usergravity.bo.UploadMediaData;
import com.usergravity.data.Movie;
import com.usergravity.utility.PropertyUtility;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Properties;

/**
 * User: Brent Baker
 * Date: 10/25/13
 * Time: 1:56 PM
 */
public class Main {
    private static final Logger log = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args){
        Parse.initialize("FaPUKSAyt9wbCfAOtcfQZtMw3IiDmJFmC2PBvvyc","jY94KHrbmhTqg1lRyGlrgAKzuZHsuFtLrXQ0cr70");

        try {
            Properties props = PropertyUtility.loadProperties(PropertyUtility.PROPERTY_FILE);
            ReadMediaFiles mediaFiles = new ReadMediaFiles();
            mediaFiles.processFolder(props.getProperty(PropertyUtility.SEARCH_DIRECTORY));
            UploadMediaData uploadMediaData = new UploadMediaData();
            uploadMediaData.loadMediaData(mediaFiles.getMovies());

        } catch (Exception ex) {
            log.error("main", ex);
        }
    }



}
