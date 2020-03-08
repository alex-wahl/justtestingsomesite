package accenture_testing.backend;

import static io.restassured.RestAssured.given;

import java.io.File;
import java.io.IOException;
import java.util.Map;

import accenture_testing.steps.Helper;
import io.restassured.response.Response;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.io.FileUtils;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

import javax.imageio.ImageIO;

public class Request extends Helper {

    public static Map<String, String> Cookies;
    public static String baseUrl = "http://api.dbcapi.me/";


    public static Response sendCaptcha(String path) {
        String encodedString = null;
        Base64 base64 = new Base64();

        try {
            byte[] fileContent = FileUtils.readFileToByteArray(new File(path));
            encodedString = base64.encodeToString(fileContent);
        }
        catch(IOException e) {
            e.printStackTrace();
        }

        String toSend = "base64:" + encodedString;
        logger.info(toSend);

        Response response = given()
                .param("username", "walenberg")
                .param("password", "9CytF<Wn<V']z2J;")
                .param("captchafile", toSend)
                .post(baseUrl + "api/captcha");

        Cookies = response.getCookies();

        logger.info(response.asString());

        return response;
    }

    /*public Response statusCaptcha() {

    }

    public Response reportWrongCaptcha() {

    }

    public Response checkBalanceStatus() {

    }*/

}

