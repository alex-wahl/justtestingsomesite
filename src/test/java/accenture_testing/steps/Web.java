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
    }

    @Then("I generate fake details and make a Sign up using {string}, password {string}")
    public void i_generate_fake_details_and_make_a_Sign_up_using_password(String email, String password) {
        HomePage home = new HomePage(driver);
        RegisterPage registerPage = new RegisterPage(driver);
        SignInPage signInPage = new SignInPage(driver);

        logger.info("From Home to SignIn");
        home.clickOnSignIn();
        signInPage.clickOnSignUp();

        logger.info("Scroll Down");
        registerPage.scrollDown("0","400");

        logger.info("Type email");
        registerPage.typeEmail(email);

        logger.info("Type password");
        registerPage.typePassword(password);

        try {
            Thread.sleep(5000);
        } catch (Exception e) {
            //
        }

    }


}
