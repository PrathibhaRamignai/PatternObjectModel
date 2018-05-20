package edit;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import org.openqa.selenium.WebElement;
import wdMethods.ProjectMethods;

public class ViewLead extends ProjectMethods{
	public ViewLead() {		
		PageFactory.initElements(driver,this);
	}
	@FindBy (how =How.XPATH , using ="//a[contains(text(),'Edit')]")
	WebElement eleEdit;

	public EditLead clickEdit() {
		click(eleEdit);
		return new EditLead();
	}

	@FindBy(how=How.XPATH,using="//span[text()[contains(.,'Harish')]]")
	WebElement elefName;

	public ViewLead verifyLoggedName(String data) {
		verifyPartialText(elefName, data);
		return this;	
	}
}



