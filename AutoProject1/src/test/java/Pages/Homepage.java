package Pages;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import Framework.Setup;
import org.testng.Reporter;

public class Homepage extends Setup
{
	//Declaring webelement variables
	By logo=By.cssSelector("#header_logo > a > img");
	By signinbutton= By.xpath("//a[@class='login']");
	By facbookfollow=By.xpath("//*[@class='fb-like-box fb_iframe_widget']");
	
	public boolean funclogo()
	{
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		System.out.println("Visibility of logo is being checked");
		return(driver.findElement(logo).isDisplayed());
		
	}
	
	public void clicksigninbutton()
	{
		driver.findElement(signinbutton).click();
		System.out.println("Sign in button clicked");
	}
	
	public void facebookfollowinput()
	{
		driver.findElement(facbookfollow).sendKeys(email);
	}
}
