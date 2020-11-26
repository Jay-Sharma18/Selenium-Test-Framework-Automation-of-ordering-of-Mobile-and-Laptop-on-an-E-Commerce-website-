package TutorialsNinja.comPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ComponentsPage 
{	
	WebDriver driver;
	
	@FindBy(linkText="Monitors (2)")
	WebElement MonitorsLinkButton;
	
	@FindBy(linkText="Phones & PDAs (3)")
	WebElement PhonesLinkButton;
	
	public ComponentsPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickComponents()
	{
		MonitorsLinkButton.click();
	}
	
	public void clickPhonesLinkButton()
	{
		PhonesLinkButton.click();
	}
	
}
