package delete;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class MyLeads extends ProjectMethods{
	
	public MyLeads() {		
		PageFactory.initElements(driver,this);
	}	
	
		
	@FindBy(how = How.LINK_TEXT, using="Find Leads")
	WebElement elefindleads;
	
	public FindLeads clickfindleads() {
		click(elefindleads);
		return new FindLeads();
	}

		
	

}
