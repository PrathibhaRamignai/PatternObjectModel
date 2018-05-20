package merge;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class MyhomePage extends ProjectMethods{
	
	public MyhomePage() {		
		PageFactory.initElements(driver,this);
	}	
	
	@FindBy(how=How.LINK_TEXT,using="Leads")
	WebElement eleleads;
	
	public MyLeads clickLeads() {
		click(eleleads);
		return new MyLeads();
}
	

}
