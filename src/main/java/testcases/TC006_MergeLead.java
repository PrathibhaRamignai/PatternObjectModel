package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import merge.LoginPage;

import wdMethods.ProjectMethods;

public class TC006_MergeLead extends ProjectMethods {
	@BeforeTest
	public void setData() {
		testCaseName="TC003_DeleteLead";
		testDescription="Merge the 2 leads in Leaftap Application ";
		testNodes="MergeLead";
		category="Sanity";
		authors="karthick Harish";
		browserName="chrome";
		dataSheetName="TC006_MergeLead";

	}
	@Test(dataProvider="fetchData")
	public void EditLead(String UserName,String Password,String CompanyName,String CompName) {

		new LoginPage()
		.enterUserName(UserName)
		.enterPassword(Password)
		.clickLogIn()
		.clickCRMSFA()
		.clickLeads()
		.clickMerge()
		.clickfrom()
		.enterCompany(CompanyName)
		.clickflead()
		.clickLeadid()
		.clickto()
		.enterCompany(CompName)
		.clickfilead2()
		.clickLeadid()
		.clickmerge() ;

	}
}