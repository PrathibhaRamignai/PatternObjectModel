package delete;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.How;
import wdMethods.ProjectMethods;

public class FindLeads extends ProjectMethods{
	public FindLeads() {		
		PageFactory.initElements(driver,this);
	}

	@FindBy (how = How.XPATH , using ="(//input[@name='companyName'])[2]")
	WebElement elecomp;

	@FindBy (how = How.XPATH , using ="//button[contains(text(),'Find Leads')]")
	WebElement eleflead;

	@FindBy (how = How.XPATH , using ="(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")
	WebElement eleLeadid;
	
	@FindBy(how=How.XPATH,using="(//div[text()='No records to display'])[1]")
	WebElement eletext;


	public FindLeads enterCompany(String data) {
		type(elecomp, data);
		return this;
	}

	public FindLeads clickflead() {
		click(eleflead);
		return this;
	}

	public ViewLead clickLeadid() {
		click(eleLeadid);
		return new ViewLead();
	}
	
		public FindLeads verifyLoggedName(String data) {
		verifyPartialText(eletext, data);
		return this;	
	}
}



