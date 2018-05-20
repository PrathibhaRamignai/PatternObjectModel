package pages;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.How;
import wdMethods.ProjectMethods;

public class MyLeads extends ProjectMethods{
	public MyLeads() {		
		PageFactory.initElements(driver,this);
	}

@FindBy (how = How.LINK_TEXT, using="Create Lead")
WebElement elecrLead;

public CreateLead clickCreateLead() {
	click(elecrLead);
	return new CreateLead();
}



}