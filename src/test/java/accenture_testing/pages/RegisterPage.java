package accenture_testing.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import java.lang.invoke.MethodHandles;

public class RegisterPage {

    WebDriver driver;

    protected static Logger logger = Logger.getLogger(MethodHandles.lookup().lookupClass());

    public RegisterPage(WebDriver driver) {
        this.driver = driver;
    }

    //Variables Section

    //Locators Section

    //By emailAddress
    By emailAddress = By.xpath("//*[@id=\"CareersRegistration_EmailAddress\"]");

    //By firstName
    By firstName = By.xpath("//*[@id=\"CareerRegistration_FirstName\"]");

    //By lastName
    By lastName = By.xpath("//*[@id=\"CareerRegistration_LastName\"]");

    //By country
    By country = By.xpath("//*[@id=\"Form-bc069210-38f8-42e1-9882-b84c350f3613\"]/section[1]/div[4]/div[1]/div/div/div[1]/button[1]/span");
    By region = By.xpath("//*[@id=\"ddBoxRegistrationCountryRegion-ulid\"]/li[83]/a");

    //By state
    By state = By.xpath("//*[@id=\"Form-bc069210-38f8-42e1-9882-b84c350f3613\"]/section[1]/div[4]/div[2]/div/div/div[1]");
    By province = By.xpath("//*[@id=\"ddBoxRegistrationStateProvince-ulid\"]/li[4]/a/span");

    //By createPassword
    By createPassword = By.xpath("//*[@id=\"CareersRegistration_Password\"]");

    //By reTypePassword
    By reTypePassword = By.xpath("//*[@id=\"CareersRegistration_RetypePassword\"]");

    //By city
    By city = By.xpath("//*[@id=\"CareerRegistration_City\"]");

    //By phoneNumber
    By phoneNumber = By.xpath("//*[@id=\"TalentConnectionRegistration_PhoneNumber\"]");

    //By jobLocation
    By jobLocation = By.xpath("//*[@id=\"Form-bc069210-38f8-42e1-9882-b84c350f3613\"]/section[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/button[1]/span");
    By jobRegion = By.xpath("//*[@id=\"ddlPreferredCountryRegion-ulid\"]/li[83]/a");

    //By yearsOfExperience
    By yearsOfExperience = By.xpath("//*[@id=\"Form-bc069210-38f8-42e1-9882-b84c350f3613\"]/section[2]/div[2]/div[2]/div[2]/div[1]/div/div[1]/button[1]/span");
    By years = By.xpath("//*[@id=\"ddPreferredExperience-ulid\"]/li[4]/a");

    //By jobCity
    By jobCity = By.xpath("//*[@id=\"RegCitiesLink\"]");
    By jobLand = By.xpath("//*[@id=\"selectCity\"]/div/div[4]/label/input");
    By jobLandUpdateButton = By.xpath("//*[@id=\"btnCityUpdate\"]");

    //By jobFunction
    By jobFunction = By.xpath("//*[@id=\"RegPrimaryJob\"]");
    By jobBranch = By.xpath("//*[@id=\"selectPrimaryJob\"]/div[3]/div[7]/label/input");
    By jobBranchUpdateButton = By.xpath("//*[@id=\"btnPrimaryJobUpdateReg\"]");

    //By industry
    By industry = By.xpath("//*[@id=\"RegIndustryLink\"]");
    By industryType = By.xpath("//*[@id=\"selectIndustry\"]/div[1]/div[4]/label");
    By industryTypeUpdateButton = By.xpath("//*[@id=\"btnIndustryUpdate\"]");

    //By travel
    By travel = By.xpath("//*[@id=\"Form-bc069210-38f8-42e1-9882-b84c350f3613\"]/section[2]/div[2]/div[2]/div[1]/div[3]/div/div/button[1]/span");
    By travelPercentage = By.xpath("//*[@id=\"ddPreferredTravel-ulid\"]/li[6]/a");

    //By skills
    By skills = By.xpath("//*[@id=\"skillsSpecialization\"]");

    //By talentConnection
    By talentConnection = By.xpath("//*[@id=\"chkJoinTalentConnection\"]");

    //By careersBlog
    By careersBlog = By.xpath("//*[@id=\"chkSubscribeToCareerBlog\"]");

    //By captha
    By capthaPicture = By.className("LBD_CaptchaImage");
    By captha = By.className("captchaInput");

    // By coockies
    By coockies = By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]");


    //Methods Section

    /**
     * This method will scroll a windows browser, gets string parameters in pixel
     *
     * @param horizontal, it gets pixels value to scroll horizontal
     * @param vertical,  it gets pixels value to scroll vertical
     */
    public void scrollDown(String horizontal, String vertical){
        String parameters = "(" + horizontal + ","+ vertical + ")";
        String script = "window.scrollBy" + parameters;
        logger.info(script);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript(script, "");
    }

    public void typeEmail(String email) {

        driver.findElement(emailAddress).sendKeys(email);

    }

    public void typePassword(String password) {

        driver.findElement(createPassword).sendKeys(password);

    }



}
