package accenture_testing.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Web extends Helper {

    @Given("I go to the main {string}")
    public void i_go_to_the_main(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("I generate fake details and make a Sign up using {string}, password {string}")
    public void i_generate_fake_details_and_make_a_Sign_up_using_password(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Given("test")
    public void test() {
        logger.info("#################################");
    }


}
