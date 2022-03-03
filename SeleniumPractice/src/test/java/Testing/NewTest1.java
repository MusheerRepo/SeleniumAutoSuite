package Testing;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class NewTest1
{
	WebDriver driver=null;
  @Test
  public void test() throws Exception
  {
	  System.setProperty("webdriver.chrome.driver", 
				"D://Projects//Automation//drivers//Chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
	  Actions act=new Actions(driver);
	  act.clickAndHold(driver.findElement(By.xpath("//*[@id=\"fourth\"]")))
	  .moveToElement(driver.findElement(By.xpath("//*[@id=\"amt7\"]/li")))
	  .release().build().perform();
	  
	  Thread.sleep(5000);
	  System.out.println("Task done");
	  
	  driver.quit();
	  
	  
  }
}
