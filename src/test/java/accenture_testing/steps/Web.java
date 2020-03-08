package accenture_testing.steps;

import accenture_testing.backend.Request;
import accenture_testing.pages.HomePage;
import accenture_testing.pages.RegisterPage;
import accenture_testing.pages.SignInPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Web extends Helper {

    @Given("I go to the main {string}")
    public void i_go_to_the_main(String url) {
        logger.info("Opened Link is: " + url);
        driver.get(url);

        try {
            Thread.sleep(3000);
        } catch (Exception e) {
            //
        }
    }

    @Then("I generate fake details and make a Sign up using {string}, password {string}")
    public void i_generate_fake_details_and_make_a_Sign_up_using_password(String email, String password) throws IOException {
        HomePage home = new HomePage(driver);
        RegisterPage registerPage = new RegisterPage(driver);
        SignInPage signInPage = new SignInPage(driver);

        logger.info("Accept coockies");
        registerPage.acceptCoockies();

        logger.info("Click on Sign In on the home page");
        home.clickOnSignIn();

        logger.info("Click on Sign Up on the Sign Up page");
        signInPage.clickOnSignUp();

        logger.info("Scroll Down");
        registerPage.scrollDown("0", "400");

        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            //
        }

        logger.info("Type email");
        registerPage.typeEmail(email);

        logger.info("Type password");
        registerPage.typePassword(password);

        logger.info("ReType password");
        registerPage.againTypePassword(password);

        logger.info("Scroll Down");
        registerPage.scrollDown("0", "300");

        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            //
        }

        logger.info("Type First Name");
        registerPage.fillOutFirstName();

        logger.info("Type Last Name");
        registerPage.fillOutLastName();

        registerPage.scrollDown("0", "500");

        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            //
        }

        logger.info("Click on country dropdown menu");
        registerPage.clickOnCountry();

        logger.info("Select a country in the dropdown menu");
        registerPage.selectCountry();

        logger.info("Click on state dropdown menu");
        registerPage.clickOnState();

        logger.info("Select a state in the dropdown menu");
        registerPage.selectState();

        logger.info("Type a city");
        registerPage.typeCity();

        logger.info("Type a phone number");
        registerPage.typePhoneNumber();

        logger.info("Scroll down");
        registerPage.scrollDown("0", "500");

        logger.info("Click on Job locations");
        registerPage.clickOnJobLocation();

        logger.info("Select Job region");
        registerPage.selectJobRegion();

        logger.info("Click on Years of experience");
        registerPage.clickOnYearsOfExperience();

        logger.info("Select Years of experience");
        registerPage.selectYearsOfExperience();

        logger.info("Click on job city");
        registerPage.clickOnJobCity();

        logger.info("Select job city");
        registerPage.selectJobCity();

        logger.info("Click on Primary functions");
        registerPage.clickOnPrimaryFunctions();

        logger.info("Select Primary functions");
        registerPage.selectPrimaryFunctions();

        logger.info("Scroll down");
        registerPage.scrollDown("0", "100");

        logger.info("Click on Industry");
        registerPage.clickOnIndustry();

        logger.info("Select Industry");
        registerPage.selectIndustryType();

        logger.info("Type what I can do good, there are not so big choose");
        registerPage.typeWhatIamRealygood();

        logger.info("Click on Careerblog");
        registerPage.clickOnCareersBlog();

        logger.info("Scroll down");
        registerPage.scrollDown("0", "500");

        logger.info("Scroll screen");
        registerPage.makeAscreenShot();

        logger.info("Make crop");
        registerPage.makeCrop();

        try {
            Thread.sleep(5000);
        } catch (Exception e) {
            //
        }

    }

    @Given("builder which I will send")
    public void builderWhichIWillSend() {

        logger.info("Send beckend request");

            Request.sendCaptcha("/Users/wahl/Desktop/testing/justtestingsomesite/cropped.png");


    }


}
