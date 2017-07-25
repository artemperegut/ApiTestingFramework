package steps;

import cucumber.api.java.ru.Тогда;
import services.Params;
import services.Response;

/**
 * Created by Artem Peregut on 25.07.2017.
 */
public class ResponseSteps {

    @Тогда("пользователь запоминает значение поля \"(.*?)\" ответа в переменную \"(.*?)\"")
    public void setResponseFieldAsSavedValue(String responseFieldPath, String var) {
        String responseFieldValue = Response.getResponseFieldValue(responseFieldPath);
        Params.setParam(var, responseFieldValue);
    }
}