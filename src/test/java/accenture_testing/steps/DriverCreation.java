package accenture_testing.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverCreation extends Helper {
    private static final String MAC_DRIVER_PATH = "src/test/resources/driver/chromedriver";

    @Given("I am using the browser Chrome")
    public void i_am_using_the_browser_Chrome() {

        System.setProperty("webdriver.chrome.driver", MAC_DRIVER_PATH);

        ChromeOptions options = new ChromeOptions();

        options.addArguments("window-size=1920,1080");
        options.addArguments("test-type");
        options.addArguments("start-maximized");

        logger.info("Test");
        driver = new ChromeDriver(options);
    }


    @And("I close the browser Chrome")
    public void i_close_the_browser_Chrome() {
        driver.close();
    }

}
