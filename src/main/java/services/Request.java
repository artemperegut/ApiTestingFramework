import com.sun.org.apache.regexp.internal.RE;
import io.restassured.RestAssured;
import io.restassured.config.DecoderConfig;
import io.restassured.config.EncoderConfig;
import io.restassured.filter.session.SessionFilter;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;

/**
 * Created by Artem Peregut on 06.07.2017.
 */
public class Request {

    String baseURI; //адрес, по которому будет послан запрос
    int port; //порт адреса, по которому будет послан запрос
    String decoderCharSet;
    String encoderCharSet;
    SessionFilter sessionFilter = new SessionFilter();
    public static Request request;

    public Request() {
        decoderCharSet = "UTF-8";
        encoderCharSet = "UTF-8";
        request = new Request();
    }

    public RequestSpecification preparedRequest(String contentType) {
        RestAssured.baseURI = baseURI;
        RestAssured.port = port;
        return given().
                config(RestAssured.config().decoderConfig(DecoderConfig.decoderConfig().defaultContentCharset(decoderCharSet))).
                config(RestAssured.config().encoderConfig(EncoderConfig.encoderConfig().defaultContentCharset(encoderCharSet))).
                contentType(contentType).
                when();
    }

    public String doPostAndReturnResponse(String path, String contentType, String body) {
        RestAssured.baseURI = baseURI;
        RestAssured.port = port;
        Response response = preparedRequest(contentType).
                body(body).
                filter(sessionFilter).
                then().
                post(path);
        return response.andReturn().body().asString();
    }
}
