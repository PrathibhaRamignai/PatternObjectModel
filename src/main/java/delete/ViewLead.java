package delete;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import org.openqa.selenium.WebElement;
import wdMethods.ProjectMethods;

public class ViewLead extends ProjectMethods{
	public ViewLead() {		
		PageFactory.initElements(driver,this);
	}
	@FindBy (how =How.XPATH , using ="//a[contains(text(),'Delete')]")
	WebElement eleDelete;

	public MyLeads clickDelete() {
		click(eleDelete);
		return new MyLeads();
	}

	
}



