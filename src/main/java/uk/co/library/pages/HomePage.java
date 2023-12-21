package uk.co.library.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import uk.co.library.utility.Utility;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    @CacheLookup
    @FindBy(id = "save")
    WebElement acceptCookies;
    @CacheLookup
    @FindBy(xpath = "//input[@id='keywords']")
    WebElement jTitle;
    @CacheLookup
    @FindBy(xpath = "//input[@id='location']")
    WebElement location;
    @CacheLookup
    @FindBy(xpath = "//select[@id='distance']")
    WebElement distanceDropDown;
    @CacheLookup
    @FindBy(xpath = "//button[@id='toggle-hp-search']")
    WebElement searchOption ;
    @CacheLookup
    @FindBy(xpath = "//input[@id='salarymin']")
    WebElement salaryMin;
    @CacheLookup
    @FindBy(xpath = "//input[@id='salarymax']")
    WebElement salaryMax;
    @CacheLookup
    @FindBy(xpath = "//select[@id='salarytype']")
    WebElement salaryType;
    @CacheLookup
    @FindBy(xpath = "//select[@id='tempperm']")
    WebElement jobType;
    @CacheLookup
    @FindBy(xpath = "//input[@id='hp-search-btn']")
    WebElement jobButton;
//    public void setAcceptCookie() throws InterruptedException{
//        switchToIframe(iframe);
//        Thread.sleep(2000);
//        clickOnElement(acceptCookies);
//        driver.switchTo().defaultContent();
//    }


    public void clickOnAcceptCookies(){
        clickOnElement(acceptCookies);
    }
    public void enterJobTitle(String jobTitle){
        sendTextToElement(jTitle, jobTitle);
    }
    public void enterLocation(String jobLocation){
        //JavascriptExecutor js = (JavascriptExecutor) driver;
        //js.executeScript(jobLocation,location);
        sendTextToElement(location, jobLocation);
        sendAndClickTab(location);


    }
    public void selectDistanceDropDown(String distance){
        selectByVisibleTextFromDropDown(distanceDropDown, distance);

    }
    public void clickOnSearchOptionDropDown(){
        clickOnElement(searchOption);
    }
    public void enterMinSalary(String minSalary){
        sendTextToElement(salaryMin, minSalary);
    }
    public void enterMaxSalary(String maxSalary){
        sendTextToElement(salaryMax, maxSalary);
    }
    public void selectSalaryTypeDropDown(String sType){
       selectByVisibleTextFromDropDown(salaryType, sType);
    }
    public void selectJobTypeDropDown(String jType){
      selectByVisibleTextFromDropDown(jobType, jType);
    }
    public void clickOnFindJobButton(){
        clickOnElement(jobButton);
    }

}
