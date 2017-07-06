package steps;

import cucumber.api.java.Before;
import services.Request;

/**
 * Created by Artem Peregut on 06.07.2017.
 */
public class CommonSteps {
    public static Request request;


    @Before
    public void startUp() {
        request = new Request("http://httpbin.org");
    }
}
