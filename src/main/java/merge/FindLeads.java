package merge;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.How;
import wdMethods.ProjectMethods;

public class FindLeads extends ProjectMethods{
	public FindLeads() {		
		PageFactory.initElements(driver,this);
	}

	@FindBy (how = How.XPATH , using ="//input[@name='companyName']")
	WebElement elecomp;

	@FindBy (how = How.XPATH , using ="//button[contains(text(),'Find Leads')]")
	WebElement eleflead;

	@FindBy (how = How.XPATH , using ="(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")
	WebElement eleLeadid;


	public FindLeads enterCompany(String data) {
		type(elecomp, data);
		return this;
	}

	public FindLeads clickflead() {
		click(eleflead);
		return this;
	}
	public MergeLead clickleadid () {
		click(eleLeadid);
		switchToWindow(0);
		return new MergeLead();
	}

	@FindBy (how = How.XPATH , using ="//input[@name='companyName']")
	WebElement elecomp2;

	@FindBy (how = How.XPATH , using ="//button[contains(text(),'Find Leads')]")
	WebElement eleflead2;

	@FindBy (how = How.XPATH , using ="(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")
	WebElement eleLeadid2;


	public FindLeads enterComp(String data) {
		type(elecomp2, data);
		return this;
	}

	public FindLeads clickfilead2() {
		click(eleflead2);
		return this;
	}

	public MergeLead clickLeadid() {
		click(eleLeadid2);
		switchToWindow(0);
		return new MergeLead();

	}
}

