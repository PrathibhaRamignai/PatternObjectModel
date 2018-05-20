package pages;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.How;
import wdMethods.ProjectMethods;

public class CreateLead extends ProjectMethods{
	public CreateLead() {		
		PageFactory.initElements(driver,this);
	}

	@FindBy(how = How.ID, using="createLeadForm_companyName")
	WebElement eleCompanyname;

	@FindBy(how = How.ID, using="createLeadForm_firstName")
	WebElement elefirstname;

	@FindBy(how = How.ID, using="createLeadForm_lastName")
	WebElement elelastname;

	@FindBy(how = How.CLASS_NAME, using="smallSubmit")
	WebElement eleCreateLead;


	public CreateLead enterCompanyName(String data) {
		type(eleCompanyname, data);
		return this;
	}
	public CreateLead enterFirstName(String data) {
		type(elefirstname, data);
		return this;
	}

	public CreateLead enterLastName(String data) {
		type(elelastname, data);
		return this;
	}

	public ViewLead clickCreateLead() {
		click(eleCreateLead);
		return new ViewLead();
	}
	
	
}
