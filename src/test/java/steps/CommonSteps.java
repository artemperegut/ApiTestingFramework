package steps;

import cucumber.api.java.Before;
import services.Request;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by Artem Peregut on 06.07.2017.
 */
public class CommonSteps {
    public static Request request;
    public static Properties prop;

    @Before
    public void startUp() throws IOException {
        prop = new Properties();
        InputStream input = getClass().getClassLoader().getResourceAsStream("config.properties");
        prop.load(input);
        request = new Request(prop.getProperty("uri"));
    }
}