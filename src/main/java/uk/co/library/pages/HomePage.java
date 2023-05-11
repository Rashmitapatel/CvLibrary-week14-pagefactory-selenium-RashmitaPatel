package uk.co.library.pages;


import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;
import uk.co.library.customlisteners.CustomListeners;
import uk.co.library.utility.Utility;

public class HomePage extends Utility {
  @CacheLookup
  // @FindBy(xpath = "//span[text()='Accept All']")
  @FindBy(xpath = "//button[@id='save']/span/div/span")
  WebElement cookies;
  @CacheLookup
  @FindBy(xpath = "//input[@id='keywords']")
  WebElement jobTitle1;
  @CacheLookup
  @FindBy(xpath = "driver.findElement(By.xpath(\"//div[@class='hps-location hps-transition']")
  WebElement location1;
  @CacheLookup
  @FindBy(xpath = "//select[@id='distance']")
  WebElement distanceDropDown;
  @CacheLookup
  @FindBy(xpath = "//button[@id='toggle-hp-search']")
  WebElement moreSearchOptionsLink;
  @CacheLookup
  @FindBy(xpath = "//input[@id='salarymin']")
  WebElement salaryMin;
  @CacheLookup
  @FindBy(xpath = "//input[@id='salarymax']")
  WebElement salaryMax;
  @CacheLookup
  @FindBy(xpath = "//select[@id='salarytype']")
  WebElement salaryTypeDropDown;
  @CacheLookup
  @FindBy(xpath = "//select[@id='tempperm']")
  WebElement jobTypeDropDown;
  @CacheLookup
  @FindBy(xpath = "//select[@id='tempperm']")
  WebElement findJobsBtn;
//---------------------------------------Methods------------------------------------------------------//
  public void acceptAllCookies() {
    mouseHoverToElementAndClick(cookies);
  }

  public void enterJobTitle(String jobTitle) {
    Reporter.log("Enter jon Title" + jobTitle1.toString());
    sendTextToElement(jobTitle1, jobTitle);
    CustomListeners.test.log(Status.PASS, "Enter Job Title" + jobTitle);
  }

  public void enterLocation(String location) {
    Reporter.log("Enter Location" + location1.toString());
    sendTextToElement(location1, location);
    CustomListeners.test.log(Status.PASS, "Enter Location" + location);

  }

  public void selectDistance(String distance) {
    Reporter.log("Select Distance" + distanceDropDown.toString());
    selectByVisibleTextFromDropDown(distanceDropDown,distance);
    CustomListeners.test.log(Status.PASS, "Select Distance" + distanceDropDown);
  }

  public void clickOnMoreSearchOptionLink() {
    Reporter.log("click on MoreSerchOptionLink" + moreSearchOptionsLink.toString());
    clickOnElement(moreSearchOptionsLink);
    CustomListeners.test.log(Status.PASS, "click on MoreSerchOptionLink");
  }

  public void enterMinSalary(String MinSalary) {
    Reporter.log("Enter MinSalary" + MinSalary.toString());
    sendTextToElement(salaryMin, MinSalary);
    CustomListeners.test.log(Status.PASS, "Enter MinSalary" + MinSalary);

  }
    public void   enterMaxSalary(String maxSalary){
    Reporter.log("Enter MaxSalary"+maxSalary.toString());
      sendTextToElement(salaryMax,maxSalary);
      CustomListeners.test.log(Status.PASS,"Enter MaxSalary"+maxSalary);
    }
    public void selectSalaryType (String sType){
    Reporter.log("Select SalaryType"+sType.toString());
      selectByVisibleTextFromDropDown(salaryTypeDropDown,sType);
      CustomListeners.test.log(Status.PASS,"Select SalaryType"+sType);

    }
    public void selectJobType(String jobType){
    Reporter.log("Select JobType"+jobType.toString());
      selectByVisibleTextFromDropDown(jobTypeDropDown,jobType);
      CustomListeners.test.log(Status.PASS,"Select JobType"+jobType);
    }
    public void clickOnfindJobsButton(){
    Reporter.log("click on FindJobButton"+findJobsBtn.toString());
      clickOnElement(findJobsBtn);
      CustomListeners.test.log(Status.PASS,"click on FindJobButton"+findJobsBtn);
    }
}
