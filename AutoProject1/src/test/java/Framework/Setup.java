package Framework;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.cucumber.java.After;
import io.cucumber.java.Before;

@SuppressWarnings("unused")
public class Setup
{
	//variables
	public static WebDriver driver;
	public static String username,password,email,existingemail,browser;
	
	By fem=By.xpath("//*[@id=\"details\"]/div[2]/div[2]/div/div[2]/dl[9]/dd");
	By fuser=By.xpath("//*[@id=\"details\"]/div[2]/div[2]/div/div[1]/h3");
	
	//Beforetest to get the browser details through parameters
	@BeforeTest()
	@Parameters({"Browser"})
	public void initializeDriver(String ebrowser)
	{
		browser=ebrowser;
		System.out.println(browser+" is used for test execution");
	}
	
	//Function to take screenshot
	public static void Screenshot()
	{
		try
		{
			
			TakesScreenshot tsc=(TakesScreenshot)driver;
			File src= tsc.getScreenshotAs(OutputType.FILE);
			
			//to save on file
			File dest=new File("D:\\Projects\\Automation\\AutoProject1\\src\\test\\java\\Utility\\FailureScreenshot.png");
			FileUtils.copyFile(src, dest);
			System.out.println("Screenshot captured and is saved");
		}
		catch(Exception E)
		{
			System.out.println("Error encountered while taking screemshot : "+E);
		}
		
	}
	
	//Getting credentials from fakenamegenerator.com
	@SuppressWarnings("deprecation")
	@BeforeSuite(alwaysRun = true)
	public void getCredentials()throws Exception
	{
		//Fetching new email from fakenamegenerator
		System.setProperty("webdriver.chrome.driver", 
				"D://Projects//Automation//drivers//chromedriver.exe");
		WebDriver driver1=new ChromeDriver();
		System.out.println("Process to get fake credentials started");
		
		driver1.get("https://www.fakenamegenerator.com/");
		driver1.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		email=driver1.findElement(fem).getText().split("\\r?\\n")[0];
		driver1.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		username=driver1.findElement(fuser).getText();
		driver1.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		System.out.println("Fake credentials captured");
		
		driver1.close();
		driver1.quit();
		
		Properties p=new Properties();
		p.load(new FileInputStream("D:\\Projects\\Automation\\AutoProject1\\src\\test\\java\\Config\\Configuration.properties"));
		password=p.getProperty("password1");
		existingemail=p.getProperty("exmail");
	}
}
