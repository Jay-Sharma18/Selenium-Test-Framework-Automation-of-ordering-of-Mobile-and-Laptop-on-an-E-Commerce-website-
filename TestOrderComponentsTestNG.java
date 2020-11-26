package TutorialsNinjaTests;

import org.testng.annotations.Test;

import TutorialsNinja.comPages.CheckoutPage;
import TutorialsNinja.comPages.ComponentsPage;
import TutorialsNinja.comPages.HTCPhonePage;
import TutorialsNinja.comPages.MonitorsPage;
import TutorialsNinja.comPages.PhonesPage;
import TutorialsNinja.comPages.SamsungMonitorPage;
import TutorialsNinja.comPages.YourStorePage;

import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;

public class TestOrderComponentsTestNG {   
	
	WebDriver driver=utilities.DriverFactory.Open("chrome");
	String URL="http://tutorialsninja.com/demo/index.php?route=common/home";
	YourStorePage homePage=new YourStorePage(driver);
	ComponentsPage components=new ComponentsPage(driver);
	MonitorsPage monitor=new MonitorsPage(driver);
	SamsungMonitorPage SamsungMonitor=new SamsungMonitorPage(driver);
	Float monitorPrice;
	PhonesPage phones=new PhonesPage(driver);
	HTCPhonePage iphone=new HTCPhonePage(driver);
	Float PhonePrice;
	CheckoutPage checkout = new CheckoutPage(driver);
	String comment="Please deliver at the basement door after 5:00 P.M";
	Float flatShippingRate;   
	
  @Test
  public void f() 
  {
	  homePage.hoverMouseComponentsDropDown();
	  homePage.clickShowAllComponents();
	  components.clickComponents();
	  monitor.clickSamsungMonitor();
	  monitorPrice=SamsungMonitor.getMonitorPrice();
	  SamsungMonitor.clickAddToCartButton();
	  assertTrue(SamsungMonitor.addToCartConfirmationAppears());
	  homePage.hoverMouseComponentsDropDown();
	  homePage.clickShowAllComponents();
	  components.clickPhonesLinkButton();
	  phones.clickPhoneButton();
	  PhonePrice=iphone.PhonePriceBox();
	  iphone.clickAddToCart();
	  assertTrue(iphone.confirmationAppears());
	  String fName="test";
	  String lName="last";
	  String email="test@gmail.com";
	  String phone="7363837838";
	  String address="hjdgdh dhudhd d383y8 djhdjd";
	  String city="Toronto";
	  String postCode="ikjhjl";
	  String Country="Canada";
	  String State="Ontario";
	  
	  try
	  {
		Thread.sleep(5000);
	  } 
	  catch (InterruptedException e) 
	  {
		// TODO Auto-generated catch block
		e.printStackTrace();
	  }
	  assertEquals(iphone.CartTotal(),(monitorPrice+PhonePrice));  
	  iphone.clickCheckoutButton();
	  checkout.checkGuestRadio();
	  checkout.clickContinueButton();
	  checkout.enterFirstName(fName);
	  checkout.enterLastName(lName);
	  checkout.enterEmail(email);
	  checkout.enterPhone(phone);
	  checkout.enterAddress(address);
	  checkout.enterCity(city);
	  checkout.enterPostCode(postCode);
	  checkout.selectCountry(Country);
	  checkout.selectState(State);
	  checkout.clickContinue2();
	  checkout.enterComment(comment);
	  flatShippingRate=checkout.returnFlatShippingRate();
	  checkout.clickContinue3();
	  checkout.checkTermsAndConditions();
	  checkout.clickContinueButton4();
	  checkout.clickConfirmOrderButton();
	  assertTrue(checkout.orderConfirmationAppears());
	  checkout.clickFinalContinueButton();
  }
  @BeforeMethod
  public void beforeMethod() 
  {
	  driver.get(URL);
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.manage().window().maximize();
	  driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	  
  }

  @AfterMethod
  public void afterMethod() 
  {
	  driver.close();  
  }   

}
