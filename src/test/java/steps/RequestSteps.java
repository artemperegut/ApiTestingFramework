package steps;

import cucumber.api.java.ru.Тогда;

import static steps.CommonSteps.request;

/**
 * Created by Artem Peregut on 06.07.2017.
 */
public class RequestSteps {

    @Тогда("пользователь делает GET запрос в \"(.*?)\" и выводит ответ в консоль")
    public void doRequest(String path) {
        System.out.println(request.doGetAndReturnResponse(path, "application/json"));
    }
}