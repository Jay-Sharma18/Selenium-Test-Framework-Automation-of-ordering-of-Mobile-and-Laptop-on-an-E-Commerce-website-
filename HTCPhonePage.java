package TutorialsNinja.comPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HTCPhonePage 
{
	WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"content\"]/div/div[2]/ul[2]/li/h2")
	WebElement priceBox;
	
	@FindBy(id="button-cart")
	WebElement addToCartButton;
	
	@FindBy(xpath="//*[@id=\"product-product\"]/div[1]")
	WebElement confirmationBox;
	
	@FindBy(xpath="//*[@id=\"cart-total\"]")
	WebElement CartButton;
	
	@FindBy(xpath="//*[@id=\"top-links\"]/ul/li[5]/a")
	WebElement CheckoutButton;
	
	public HTCPhonePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public float PhonePriceBox()
	{
		return Float.parseFloat(priceBox.getText().replace("$", ""));
	}
	
	public void clickAddToCart()
	{
		addToCartButton.click();
	}
	
	public boolean confirmationAppears()
	{
		if(confirmationBox.isDisplayed()) return true;
		else return false;
	}
	
	public float CartTotal()
	{
		return Float.parseFloat(CartButton.getText().substring(CartButton.getText().indexOf("$")+1));
	}
	
	public void clickCheckoutButton()
	{
		CheckoutButton.click();
	}
}
