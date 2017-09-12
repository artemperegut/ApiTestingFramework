package steps;

import cucumber.api.java.ru.Тогда;

import static steps.CommonSteps.log;
import static steps.CommonSteps.request;

/**
 * Created by Artem Peregut on 06.07.2017.
 */
public class RequestSteps {

    @Тогда("пользователь делает GET запрос по адресу \"(.*?)\"")
    public void doGetRequest(String path) {
        log.info("пользователь делает GET запрос по адресу " + path);
        log.info("Ответ: \n" + request.doGetAndReturnResponse(path, "application/json"));
    }

    @Тогда("пользователь делает POST запрос с телом \"(.*?)\" по адресу \"(.*?)\"")
    public void doPostRequest(String post, String path) {
        log.info("пользователь делает POST запрос с телом " + post + " по адресу " + path);
        log.info("Ответ: \n" + request.doPostAndReturnResponse(path, "application/json", post));
    }
}