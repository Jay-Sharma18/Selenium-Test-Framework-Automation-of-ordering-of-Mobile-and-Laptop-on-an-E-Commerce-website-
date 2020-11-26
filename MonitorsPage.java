package TutorialsNinja.comPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MonitorsPage 
{

	WebDriver driver;
	
	@FindBy(linkText="Samsung SyncMaster 941BW")
	WebElement SamsungMonitorLink;
	
	public MonitorsPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickSamsungMonitor()
	{
		SamsungMonitorLink.click();
	}
	
}
