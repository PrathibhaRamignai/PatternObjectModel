package merge;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class MyLeads extends ProjectMethods{
	
	public MyLeads() {		
		PageFactory.initElements(driver,this);
	}	
	
	
	@FindBy(how = How.LINK_TEXT, using="Merge Leads")
	WebElement elemerge;
	
	public MergeLead  clickMerge() {
		click(elemerge);
		return new MergeLead();
	}

		
	

}
