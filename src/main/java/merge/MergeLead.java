package merge;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class MergeLead extends ProjectMethods{
	public MergeLead(){		
		PageFactory.initElements(driver,this);

	}

	@FindBy (how =How.XPATH, using="(//img[@alt='Lookup'])[1]")
	WebElement elefromlead ;

	public FindLeads clickfrom() {
		click(elefromlead);
		switchToWindow(1);
		return new FindLeads();
	}
	@FindBy (how =How.XPATH, using="(//img[@alt='Lookup'])[2]")
	WebElement eletolead ;

	public FindLeads clickto() {
		click(eletolead);
		switchToWindow(1);
		return new FindLeads();
	}
	@FindBy (how = How.LINK_TEXT, using="Merge")
	WebElement eleMerge;

	public ViewLead clickmerge() {
		click(eleMerge);
		acceptAlert();
		return new ViewLead() ;
	}
}