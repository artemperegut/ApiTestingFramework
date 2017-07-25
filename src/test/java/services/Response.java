package services;

import com.jayway.jsonpath.JsonPath;

import static steps.CommonSteps.lastResponseBody;

/**
 * Created by Artem Peregut on 25.07.2017.
 */
public class Response {

    public static String getResponseFieldValue(String fieldPath) {
        return JsonPath.read(lastResponseBody, "." + fieldPath).toString();
    }
}