package TutorialsNinja.comPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SamsungMonitorPage 
{
	WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"content\"]/div/div[2]/ul[2]/li/h2")
	WebElement priceBox;
	
	@FindBy(id="button-cart")
	WebElement addToCartButton;
	
	@FindBy(xpath="//*[@id=\"product-product\"]/div[1]")
	WebElement addToCartConfirmationBox;
	
	public SamsungMonitorPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public float getMonitorPrice()
	{
		return Float.parseFloat(priceBox.getText().replace("$", ""));
	}
	
	public void clickAddToCartButton()
	{
		addToCartButton.click();
	}
	
	public boolean addToCartConfirmationAppears() 
	{
		if(addToCartConfirmationBox.isDisplayed())
		{
			return true;
		}
		else return false;
	}
}
