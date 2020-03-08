package accenture_testing.backend;

import accenture_testing.steps.Helper;

import java.util.ArrayList;

public class CaptchaHandle extends Helper {

    public static String captchavalue = null;
    public static String captchaID = null;

    public static String getCaptcha(String response){

        // Block captcha extraction
        String[] array = response.split("=");
        ArrayList<String> clearArray = new ArrayList<>();

        for (String str : array) {
            for (String tem : str.split("&")) {
                clearArray.add(tem);
            }
        }

        captchavalue = clearArray.get(5);
        captchaID = clearArray.get(3);


        return captchaID;
    }

}
