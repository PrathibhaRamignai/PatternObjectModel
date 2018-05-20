package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.LoginPage;
import wdMethods.ProjectMethods;
public class TC003_CreateLead extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC001_CreateLead";
		testDescription="Create a new Lead in Leaftap Application ";
		testNodes="Leads";
		category="Smoke";
		authors="Prathibha";
		browserName="chrome";
		dataSheetName="TC003_CreateLead";

	}
	@Test(dataProvider="fetchData")
	public void CreateLead(String UserName,String Password,String CompanyName,String FirstName,String LastName) {

		new LoginPage()
		.enterUserName(UserName)
		.enterPassword(Password)
		.clickLogIn()
		.clickCRMSFA()
		.clickLeads()
		.clickCreateLead()
		.enterCompanyName(CompanyName)
		.enterFirstName(FirstName)
		.enterLastName(LastName)
		.clickCreateLead()
		.verifyLoggedName(FirstName);

	}
}