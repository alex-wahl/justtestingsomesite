package accenture_testing.backend;

import static io.restassured.RestAssured.given;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Map;

import accenture_testing.steps.Helper;
import io.restassured.response.Response;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.binary.StringUtils;
import org.apache.commons.io.FileUtils;

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
                .multiPart("enctype", "multipart/form-data")
                .param("username", "walenberg")
                .param("password", "9CytF<Wn<V']z2J;")
                .param("captchafile", toSend)
                .param("type", 2)
                .post(baseUrl + "api/captcha");

        Cookies = response.getCookies();

        logger.info(response.asString());

        return null;
    }
/*
    public Response statusCaptcha() {

    }

    public Response reportWrongCaptcha() {

    }

    public Response checkBalanceStatus() {

    }
*/
}

