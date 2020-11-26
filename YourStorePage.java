package TutorialsNinja.comPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YourStorePage 
{
	
	WebDriver driver;
	
	@FindBy(linkText = "Components")
	WebElement ComponentsDropDown;
	
	@FindBy(linkText="Show All Components")
	WebElement ShowAllComponents;
	
	public YourStorePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
		
	public void hoverMouseComponentsDropDown()
	{
		Actions action= new Actions(driver);
		action.moveToElement(ComponentsDropDown).perform();
		
	}
	
	public void clickShowAllComponents()
	{
		ShowAllComponents.click();
	}
	
	
}
