package context;

import utilities.ReadConfig;

public class TestBase {

    ReadConfig readConfig = new ReadConfig();

    public String getUrl = readConfig.getUrl();

}
