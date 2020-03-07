package accenture_testing.pages;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

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
    By jobLand = By.name("DE-BY - München");
    By jobLandUpdateButton = By.xpath("//*[@id=\"btnCityUpdate\"]");

    //By jobFunction
    By jobFunction = By.xpath("//*[@id=\"RegPrimaryJob\"]");
    By jobBranch = By.name("Software Engineering");
    By jobBranchUpdateButton = By.xpath("//*[@id=\"btnPrimaryJobUpdateReg\"]");

    //By industry
    By industry = By.xpath("//*[@id=\"RegIndustryLink\"]");
    By industryType = By.name("Banking");
    By industryTypeUpdateButton = By.xpath("//*[@id=\"btnIndustryUpdate\"]");

    //By travel
    By travel = By.xpath("//*[@id=\"Form-bc069210-38f8-42e1-9882-b84c350f3613\"]/section[2]/div[2]/div[2]/div[1]/div[3]/div/div/button[1]/span");
    By travelPercentage = By.xpath("//*[@id=\"ddPreferredTravel-ulid\"]/li[6]/a");

    //By skills
    By skills = By.xpath("//*[@id=\"skillsSpecialization\"]");
    By skillsButton = By.xpath("//*[@id=\"Form-bc069210-38f8-42e1-9882-b84c350f3613\"]/section[2]/div[2]/div[2]/div[2]/div[3]/div[1]/span");

    //By talentConnection
    By talentConnection = By.name("chkJoinTalentConnection");

    //By careersBlog
    By careersBlog = By.name("chkSubscribeToCareerBlog");

    //By captha
    By capthaPicture = By.className("LBD_CaptchaImage");
    By captha = By.className("captchaInput");

    // By coockies
    By coockies = By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]");


    //Methods Section

    //for letters
    public String generateRandomString(int length) {
        return RandomStringUtils.randomAlphabetic(length);
    }

    //for numbers
    public String generateRandomNumber(int length) {
        return RandomStringUtils.randomNumeric(length);
    }

    /**
     * This method will scroll a windows browser, gets string parameters in pixel
     *
     * @param horizontal, it gets pixels value to scroll horizontal
     * @param vertical,   it gets pixels value to scroll vertical
     */
    public void scrollDown(String horizontal, String vertical) {
        String parameters = "(" + horizontal + "," + vertical + ")";
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

    public void acceptCoockies() {
        driver.findElement(coockies).click();
    }

    public void againTypePassword(String password) {

        driver.findElement(reTypePassword).sendKeys(password);

    }

    public void fillOutFirstName() {

        driver.findElement(firstName).sendKeys(generateRandomString(5));
    }

    public void fillOutLastName() {

        driver.findElement(lastName).sendKeys(generateRandomString(5));

    }

    public void clickOnCountry() {

        driver.findElement(country).click();

    }

    public void selectCountry() {

        driver.findElement(region).click();

    }

    public void clickOnState() {

        driver.findElement(state).click();

    }

    public void selectState() {

        driver.findElement(province).click();

    }

    public void typeCity() {

        driver.findElement(city).sendKeys(generateRandomString(6));

    }

    public void typePhoneNumber() {

        driver.findElement(phoneNumber).sendKeys(generateRandomNumber(8));

    }

    public void clickOnJobLocation() {

        driver.findElement(jobLocation).click();

    }

    public void selectJobRegion() {

        driver.findElement(jobRegion).click();

    }

    public void clickOnYearsOfExperience() {

        driver.findElement(yearsOfExperience).click();

    }

    public void selectYearsOfExperience() {

        driver.findElement(years).click();

    }

    public void clickOnJobCity() {

        driver.findElement(jobCity).click();

    }

    public void selectJobCity() {

        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            //
        }
        driver.findElement(jobLand).click();
        driver.findElement(jobLandUpdateButton).click();

    }

    public void clickOnPrimaryFunctions() {

        driver.findElement(jobFunction).click();

    }

    public void selectPrimaryFunctions() {

        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            //
        }
        driver.findElement(jobBranch).click();
        driver.findElement(jobBranchUpdateButton).click();

    }

    public void clickOnIndustry() {

        driver.findElement(industry).click();

    }

    public void selectIndustryType() {

        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            //
        }
        driver.findElement(industryType).click();
        driver.findElement(industryTypeUpdateButton).click();

    }

    public void typeWhatIamRealygood() {

        driver.findElement(skills).sendKeys("Quality Assurance");
        driver.findElement(skillsButton).click();
        try {
            Thread.sleep(500);
        } catch (Exception e) {
            //
        }
        driver.findElement(skills).sendKeys("Automated Testing");
        driver.findElement(skillsButton).click();
        try {
            Thread.sleep(500);
        } catch (Exception e) {
            //
        }
        driver.findElement(skills).sendKeys("Test Automation Framework");
        driver.findElement(skillsButton).click();

    }

    public void clickOnCareersBlog() {

        driver.findElement(careersBlog).click();

    }



}
