package com.usergravity.utility;

import org.apache.commons.vfs.FileObject;
import org.apache.commons.vfs.FileSystemManager;
import org.apache.commons.vfs.VFS;

import java.util.Properties;

/**
 * User: Brent Baker
 * Date: 10/30/13
 * Time: 9:58 AM
 */
public class PropertyUtility {

    public static final String PROPERTY_FILE = "res:app.properties";
    public static final String SEARCH_DIRECTORY = "searchDirectory";

    public static Properties loadProperties(String resource) throws Exception {
        Properties props;
        try {
            FileSystemManager manager = VFS.getManager();
            props = new Properties();

            FileObject fo = manager.resolveFile(resource);

            props.load(fo.getContent().getInputStream());

            fo.close();
        } catch (Exception ex) {
            throw ex;
        }

        return props;
    }
}
