package utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
/**
 * Created by atriu on 11.09.2017.
 */
public class Util {

    public static String getProperty(String key, String resourceFileName)  {
        InputStream inputStream = Util.class.getClassLoader().getResourceAsStream(resourceFileName);
        Properties properties = new Properties();
        try {
            properties.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return  properties.getProperty(key);
    }

    public static String getRunConfigProperty(String key) {
        return getProperty(key, "config.properties");
    }
}
