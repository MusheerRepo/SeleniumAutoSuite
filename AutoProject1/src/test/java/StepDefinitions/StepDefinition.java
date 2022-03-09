package StepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;

import com.google.common.base.Verify;

import Framework.Setup;
import Pages.Homepage;
import Pages.LoginMyStore;


public class StepDefinition extends Setup
{
	Properties ob=new Properties();
	boolean result;
	
	//Creating objects of pages class
	Homepage Hmob=new Homepage();
	LoginMyStore lmsob=new LoginMyStore();
	
	//Hook to initialize browser aat starting of scenario
	@Before
	public void beforeScenario()
	{	
		if(browser.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", 
					"D://Projects//Automation//drivers//chromedriver.exe");
			driver=new ChromeDriver();
			//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			System.out.println("Chrome Browser initialized");
			
		}
		
		else if(browser.equalsIgnoreCase("mozilla"))
		{
			System.setProperty("webdriver.gecko.driver", 
					"D://Projects//Automation//drivers//geckodriver.exe");
			driver=new FirefoxDriver();
			System.out.println("Mozilla Browser initialized");
		}
		driver.manage().window().maximize();
		System.out.println("Browser initialized");
	}
	
	//Hook to kill browser after scenario and take screenshot of failed scenarios
	@After
	public void afterScenario(Scenario scenario)
	{
		if(scenario.isFailed())
		{
			TakesScreenshot tsc=(TakesScreenshot)driver;
			byte[] src= tsc.getScreenshotAs(OutputType.BYTES);
			scenario.attach(src,"image/png","SS");
			System.out.println("Screenshot captured for failed test scenario");
		}
		//driver.close();
		driver.quit();
		System.out.println("Browser closed");
	}
	
	//Step definitions
	@Given("homepage of site")
	public void homepage_of_regex_site()
	{
		try
		{
			FileInputStream fis=new FileInputStream("D:\\Projects\\Automation\\AutoProject1\\src\\test\\java\\Config\\Configuration.properties");
			ob.load(fis);
			System.out.println("Property file is loaded");
		}
		catch(Exception E)
		{
			System.out.println("Error encountered while fetching properties file");
		}
		driver.get((String)ob.getProperty("url"));
		Assert.assertTrue(driver.getTitle().equalsIgnoreCase("My Store"));
	}
	
	@When("logo is checked")
	public void logo_is_checked()
	{
		result=Hmob.funclogo();
	}
	@Then("correct logo is displayeds")
	public void correct_logo_is_displayeds()
	{
		Assert.assertTrue(result);
	}
	
	@When("clicking on sign in")
	public void clicking_on_sign_in()
	{
		Hmob.clicksigninbutton();
	}
	
	@And("Signing up with valid credentials")
	public void Signing_up_with_valid_credentials()throws Exception
	{
		lmsob.filldetails();	
		lmsob.clickregisterbutton();
	}
	
	@Then("user should be able to sign up")
	public void user_should_be_able_to_sign_up()
	{
		//Verify.verify(driver.getTitle().equalsIgnoreCase("My account - My Stor"));
		//System.out.println("Verified");
		Assert.assertTrue(driver.getTitle().equalsIgnoreCase("My account - My Store"));
	}
	
	@When("sign in with correct credentials")
	public void sign_in_with_correct_credentials()
	{
		Hmob.clicksigninbutton();
		lmsob.fillsigncred();
		lmsob.clicksubmit();
	}
	
	@When("sign in with existing credentials")
	public void sign_in_with_existing_credentials()
	{
		Hmob.clicksigninbutton();
		lmsob.fillexistingcred();
		lmsob.clicksubmit();
	}
	
	@Then("user should be able to login")
	public void user_should_be_able_to_login()
	{
		Assert.assertTrue(driver.getTitle().equalsIgnoreCase("My account - My Store"));
	}
	
	@When("email added to the follow us on facebook field")
	public void email_added_to_the_follow_us_on_facebook_field()
	{
		Hmob.facebookfollowinput();
	}
	
	@When("click on submit button")
	public void click_on_submit_button()
	{
		System.out.println("This wont be printed");
	}
	
	@Then("the site should be followed on facebook")
	public void the_site_should_be_followed_on_facebook()
	{
		System.out.println("This wont be printed");
	} 
}
