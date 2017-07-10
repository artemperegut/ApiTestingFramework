package services;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Artem Peregut on 10.07.2017.
 */
public class Params {

    private static Map<String, String> parameters = new HashMap<>();

    public static void setParam(String name, String value) {
        if (!name.isEmpty()) {
            parameters.put(name, value);
        }
    }

    public static String getParam(String name) {
        if (parameters.containsKey(name)) {
            return parameters.get(name);
        }
        return name;
    }

    public static String replace(String value) {
        switch (value) {
            case "сегодня":
                return new SimpleDateFormat("dd.MM.yyyy").format(Calendar.getInstance().getTime());
            default:
                return getParam(value);
        }
    }

    public static String inspect(String value) {
        String replaced = replace(value);
        for (Map.Entry<String, String> entry : parameters.entrySet()) {
            if (replaced.contains(entry.getKey())) {
                replaced = replaced.replace(entry.getKey(), entry.getValue());
            }
        }
        return replaced;
    }

    public static void resetParams() {
        parameters.clear();
    }
}