package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {
    Properties pro;
    public ReadConfig() {

        File src = new File("C:\\Users\\hal19\\IdeaProjects\\VisionIT_Batch8\\CucumberAPIAutomation1\\src\\main\\resources\\config.properties");

        try {
            FileInputStream fis = new FileInputStream(src);
            pro = new Properties();
            pro.load(fis);
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getUrl(){
        String url = pro.getProperty("url");
        return url;
    }
}
