package accenture_testing.backend;

import static io.restassured.RestAssured.given;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

import accenture_testing.steps.Helper;
import io.restassured.response.Response;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.io.FileUtils;

public class Request extends Helper {

    public static Map<String, String> Cookies;
    public static String baseUrl = "http://api.dbcapi.me/";
    public static Map<String, String> responseMap;

    public static Response sendCaptcha(String path) {

        String encodedString = null;
        Base64 base64 = new Base64();

        try {
            byte[] fileContent = FileUtils.readFileToByteArray(new File(path));
            encodedString = base64.encodeToString(fileContent);
        } catch (IOException e) {
            e.printStackTrace();
        }

        String toSend = "base64:" + encodedString;

        Response response = given()
                .param("username", "walenberg")
                .param("password", "9CytF<Wn<V']z2J;")
                .param("captchafile", toSend)
                .post(baseUrl + "api/captcha");

        Cookies = response.getCookies();

        logger.info("Status request is: " + response.asString());

        return response;
    }

    public static Response statusCaptcha(String captchaID) {

        Response response = given()
                .get("http://api.dbcapi.me/api/captcha/" + captchaID);

        logger.info("Status captcha is: " + response.asString());

        return response;
    }

    /*public Response reportWrongCaptcha() {
    }

    public Response checkBalanceStatus() {

    }*/

}

