package accenture_testing.steps;

import org.openqa.selenium.WebDriver;

import java.lang.invoke.MethodHandles;

import org.apache.log4j.Logger;

public abstract class Helper {

    protected static WebDriver driver = null;
    protected static Logger logger = Logger.getLogger(MethodHandles.lookup().lookupClass());

}
