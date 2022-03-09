package Testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pagef
{
	static WebDriver driver=null;
	@FindBy(name="q")
	static WebElement textBox;
	
	@FindBy(name="btnK")
	static WebElement searchButton;
	
	public Pagef(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Projects\\Automation\\drivers\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  Pagef ob=new Pagef(driver);
		  driver.get("https://www.google.co.in/");
		  textBox.sendKeys("Hello");
		  searchButton.click();
		  Thread.sleep(4000);
	}

}
