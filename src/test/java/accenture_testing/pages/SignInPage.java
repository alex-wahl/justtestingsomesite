package accenture_testing.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.lang.invoke.MethodHandles;

public class SignInPage {

    WebDriver driver;

    protected static Logger logger = Logger.getLogger(MethodHandles.lookup().lookupClass());

    public SignInPage(WebDriver driver) {
        this.driver = driver;
    }

    //Variables Section

    //Locators Section

    By signUp = By.xpath("//*[@id=\"block-block\"]/div/section/div[1]/div[2]/div/section/div[1]/p[2]/a");

    // Methods Section

    public void clickOnSignUp() {

        logger.info("Click on Sign Up");
        driver.findElement(signUp).click();

    }
}
