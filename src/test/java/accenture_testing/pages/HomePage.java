package accenture_testing.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.lang.invoke.MethodHandles;

public class HomePage {

    WebDriver driver;

    protected static Logger logger = Logger.getLogger(MethodHandles.lookup().lookupClass());

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    //Variables Section

    //Locators Section

    By signIn = By.xpath("//*[@id=\"header-topnav\"]/div/div[2]/div[2]/div/a");

    //Methods Section

    public void clickOnSignIn() {

        logger.info("Click on SignIn");
        driver.findElement(signIn).click();

    }
}
