package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CreatLead {
	public static RemoteWebDriver driver;
	@Given("Open the Browser")
	public void OpenBrowser() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver=new ChromeDriver();
	}
	@And("Max the Browser")
	public void maxBrowser() {
		driver.manage().window().maximize();
	}
	@And("set the timeout")
	public void setTimeOut(){
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	@And("Enter the URL")
	public void launchURL() {
		driver.get("http://leaftaps.com/opentaps");
	}
	@And("Enter the UserName as (.*)")
	public void enterUsername(String data) {
		driver.findElementById("username").sendKeys(data);
	}
	@And("Enter the Password as (.*)")
	public void enterPassword(String data) {
		driver.findElementById("password").sendKeys(data);
	}
	@And("Click on the login Button")
	public void ClickonLoginButton() {
		driver.findElementByClassName("decorativeSubmit").click();
	}
	@And("Verify Login is failed")
	public void VerifyLoginfailed() {
		System.out.println("Login is Failed");
	}
	@And("Click on CRM/SFA link")
	public void ClickonCRMSFALink() {
		driver.findElementByLinkText("CRM/SFA").click();
	}
	@And("Click on Leads Button")
	public void ClickOnLeadButton() {
		driver.findElementByLinkText("Leads").click();
	}
	@And("Click on Creat Lead Link")
	public void ClickonCreatLead() {
		driver.findElementByLinkText("Create Lead").click();
	}
	@And("Enter the Company Name as (.*)")
	public void EnterCompanyName(String data) {
		driver.findElementById("createLeadForm_companyName").sendKeys(data);
	}
	@And("Enter the First name as (.*)")
	public void EnterFirstName(String data) {
		driver.findElementById("createLeadForm_firstName").sendKeys(data);
	}
	@And("Enter the Last name as (.*)")
	public void EnterLastName(String data) {
		driver.findElementById("createLeadForm_lastName").sendKeys(data);
	}
	@And("Click on Creat Lead Button")
	public void ClickonCreatLeadButton() {
		driver.findElementByClassName("smallSubmit").click();
	}
	@Then("Verify the Company Name")
	public void verifyCompanyName() {
		System.out.println("Verify the Company Nmae");
	}
}



























