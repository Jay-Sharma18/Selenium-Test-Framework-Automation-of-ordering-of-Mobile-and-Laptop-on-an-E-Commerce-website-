package TutorialsNinja.comPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CheckoutPage 
{
	WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"collapse-checkout-option\"]/div/div/div[1]/div[2]/label/input")
	WebElement GuestAccountRadio;
	
	@FindBy(id="button-account")
	WebElement ContinueButton;
	
	@FindBy(id="input-payment-firstname")
	WebElement FirstNameBox;
	
	@FindBy(id="input-payment-lastname")
	WebElement LastNameBox;
	
	@FindBy(id="input-payment-email")
	WebElement emailBox;
	
	@FindBy(id="input-payment-telephone")
	WebElement phoneBox;
	
	@FindBy(id="input-payment-address-1")
	WebElement addressBox;
	
	@FindBy(id="input-payment-city")
	WebElement cityBox;
	
	@FindBy(id="input-payment-postcode")
	WebElement postalCodeBox;
	
	@FindBy(id="input-payment-country")
	WebElement CountryDropDown;
	
	@FindBy(id="input-payment-zone")
	WebElement State;
	
	@FindBy(id="button-guest")
	WebElement continueButton2;
	
	@FindBy(name = "comment")
	WebElement commentBox;
	
	@FindBy(xpath="//*[@id=\"collapse-shipping-method\"]/div/div[1]/label")
	WebElement flatShippingRateText;
	
	@FindBy(id="button-shipping-method")
	WebElement continueButton3; 
	
	@FindBy(css="input[name='agree'][value='1']")
	WebElement TermsConditionsCheckbox;
	
	@FindBy(id="button-payment-method")
	WebElement continueButton4;  
	
	@FindBy(id="button-confirm")
	WebElement ConfirmOrderButton; 
	
	@FindBy(xpath="//*[@id=\"content\"]/h1")
	WebElement OrderConfirmationBox;
	
	@FindBy(linkText="Continue")
	WebElement ContinueButtonFinal;
	
	public CheckoutPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void checkGuestRadio()
	{
		GuestAccountRadio.click();
	}
	
	public void clickContinueButton()
	{
		ContinueButton.click();
	}
	
	public void enterFirstName(String firstName)
	{
		FirstNameBox.sendKeys(firstName);
	}
	
	public void enterLastName(String lastName)
	{
		LastNameBox.sendKeys(lastName);
	}
	
	public void enterEmail(String email)
	{
		emailBox.sendKeys(email);
	}
	
	public void enterPhone(String phone)
	{
		phoneBox.sendKeys(phone);;
	}
	
	public void enterAddress(String address)
	{
		addressBox.sendKeys(address);
	}
	
	public void enterCity(String city)
	{
		cityBox.sendKeys(city);
	}
	
	public void enterPostCode(String post)
	{
		postalCodeBox.sendKeys(post);
	}
	
	public void selectCountry(String country)
	{
		new Select(CountryDropDown).selectByVisibleText(country);
	}
	
	public void selectState(String state)
	{
		new Select(State).selectByVisibleText(state);
	}
	
	public void clickContinue2()
	{
		continueButton2.click();
	}
	
	public void enterComment(String comment)
	{
		commentBox.sendKeys(comment);
	}
	
	public float returnFlatShippingRate()
	{
		return Float.parseFloat(flatShippingRateText.getText().substring(flatShippingRateText.getText().indexOf("$")+1));
	}
	
	public void clickContinue3()
	{
		continueButton3.click();
	}
	
	public void checkTermsAndConditions()
	{
		TermsConditionsCheckbox.click();
	}
	
	public void clickContinueButton4()
	{
		continueButton4.click();
	}
	
	    
	
	public void clickConfirmOrderButton()
	{
		ConfirmOrderButton.click();     
	}
	
	public boolean orderConfirmationAppears()
	{
		if(OrderConfirmationBox.isDisplayed()) return true;
		else return false;
	}
	
	public void clickFinalContinueButton()
	{
		ContinueButtonFinal.click();
	}
	
	
}

