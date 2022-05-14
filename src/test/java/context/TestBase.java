package context;

import java.io.InputStream;
import java.util.Properties;

public class TestBase {

    protected String url = LoadProperties().getProperty("url");

    public Properties LoadProperties() {
        try {
            InputStream inputStream =
                    getClass().getClassLoader().getResourceAsStream("config" +
                            ".properties");
            Properties prop = new Properties();
            prop.load(inputStream);
            return prop;
        } catch (Exception e) {
            System.out.println("File not found exception thrown for config" +
                    ".properties file.");
            return null;
        }
    }

}
