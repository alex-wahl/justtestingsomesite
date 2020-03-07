package accenture_testing.steps;

import accenture_testing.pages.HomePage;
import accenture_testing.pages.RegisterPage;
import accenture_testing.pages.SignInPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

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
    public void i_generate_fake_details_and_make_a_Sign_up_using_password(String email, String password) {
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
        registerPage.scrollDown("0","400");

        try {
            Thread.sleep(1000);
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
        registerPage.scrollDown("0","200");

        logger.info("Type First Name");
        registerPage.fillOutFirstName();

        logger.info("Type Last Name");
        registerPage.fillOutLastName();

        registerPage.scrollDown("0","500");

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

        registerPage.typeCity();

        registerPage.typePhoneNumber();

        registerPage.scrollDown("0","500");

        registerPage.clickOnJobLocation();

        registerPage.selectJobRegion();

        registerPage.clickOnYearsOfExperience();

        registerPage.selectYearsOfExperience();

        registerPage.clickOnJobCity();

        registerPage.selectJobCity();

        try {
            Thread.sleep(5000);
        } catch (Exception e) {
            //
        }

    }


}
