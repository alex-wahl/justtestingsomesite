package accenture_testing.backend;

import accenture_testing.steps.Helper;

import java.util.ArrayList;
import java.util.Arrays;


public class CaptchaHandle extends Helper {

    public static String id = null;
    public static String captchavalue = null;

    public static void getCaptcha(String response) {

        // Block captcha extraction

        String[] array = response.split("=");
        ArrayList<String> clearArray = new ArrayList<>();

        for (String str : array) {
            clearArray.addAll(Arrays.asList(str.split("&")));
        }

        logger.info("clearArray 4 " + clearArray.get(4));
        logger.info("clearArray 3 " + clearArray.get(3));
        logger.info("clearArray 5 " + clearArray.get(5));
        logger.info("clearArray 6 " + clearArray.get(6));

        captchavalue = clearArray.get(5);
        id = clearArray.get(3);

    }

}
