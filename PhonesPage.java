package TutorialsNinja.comPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PhonesPage 
{
	WebDriver driver;
	
	@FindBy(linkText="HTC Touch HD")
	WebElement iPhoneButton;
	
	public PhonesPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void clickPhoneButton()
	{
		iPhoneButton.click();
	}
	
	
	
}
