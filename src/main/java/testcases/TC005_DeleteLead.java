package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import delete.LoginPage;
import wdMethods.ProjectMethods;

public class TC005_DeleteLead extends ProjectMethods {
	@BeforeTest
	public void setData() {
		testCaseName="TC003_DeleteLead";
		testDescription="Delete a created Lead in Leaftap Application ";
		testNodes="DeleteLead";
		category="Sanity";
		authors="karthick Harish";
		browserName="chrome";
		dataSheetName="TC005_DeleteLead";

	}
	@Test(dataProvider="fetchData")
	public void EditLead(String UserName,String Password,String CompanyName,String ValidationMessage) {

		new LoginPage()
		.enterUserName(UserName)
		.enterPassword(Password)
		.clickLogIn()
		.clickCRMSFA()
		.clickLeads()
		.clickfindleads()
		.enterCompany(CompanyName)
		.clickflead()
		.clickLeadid()
		.clickDelete()
		.clickfindleads()
		.enterCompany(CompanyName)
		.clickflead()
		.verifyLoggedName(ValidationMessage);

	}
}

