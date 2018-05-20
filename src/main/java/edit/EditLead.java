package edit;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.How;
import wdMethods.ProjectMethods;

public class EditLead extends ProjectMethods{
	public EditLead() {		
		PageFactory.initElements(driver,this);
	}

	@FindBy(how = How.ID, using="updateLeadForm_firstName")
	WebElement elefirstname;

	@FindBy(how = How.ID, using="updateLeadForm_lastName")
	WebElement elelastname;

	@FindBy (how = How.ID, using="updateLeadForm_departmentName")
	WebElement eledept;
	
	@FindBy(how = How.CLASS_NAME, using="smallSubmit")
	WebElement eleUpdateLead;


	
	public EditLead enterFirstName(String data) {
		type(elefirstname, data);
		return this;
	}

	public EditLead enterLastName(String data) {
		type(elelastname, data);
		return this;
	}

	public EditLead enterDept(String data) {
		type(eledept, data);
		return this; 
	}
	
	public ViewLead clickUpdateLead() {
		click(eleUpdateLead); 
		return new ViewLead();
	}
	
	
}
