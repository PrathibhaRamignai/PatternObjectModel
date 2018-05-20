package delete;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.How;
import wdMethods.ProjectMethods;

public class DeleteLead extends ProjectMethods{
	public DeleteLead() {		
		PageFactory.initElements(driver,this);
	}

	
	@FindBy(how = How.LINK_TEXT, using="Delete")
	WebElement eleDeleteLead;


	
	
	
	public ViewLead clickDeleteLead() {
		click(eleDeleteLead);
		return new ViewLead();
	}
	
	
}