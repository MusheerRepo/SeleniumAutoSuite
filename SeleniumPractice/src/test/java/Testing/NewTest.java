package Testing;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class NewTest
{
	WebDriver driver=null;
  @Test
  public void test() throws Exception
  {
	  System.setProperty("webdriver.chrome.driver", 
				"D://Projects//Automation//drivers//chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
	  
	  /*
	  Actions act=new Actions(driver);
	  act.clickAndHold(driver.findElement(By.xpath("//*[@id=\"fourth\"]")))
	  .moveToElement(driver.findElement(By.xpath("//*[@id=\"amt7\"]/li")))
	  .release().build().perform();
	  
	  Thread.sleep(5000);
	  System.out.println("Task done");
	  */
		
	  driver.get("https://google.com");
	  driver.findElement(By.name("q")).sendKeys("Hello");
	  driver.findElement(By.name("btnK")).click();
	  
	  System.out.println("Google opened");
	  Thread.sleep(3000);
	  
	  driver.navigate().back();
	  System.out.println("Back to guru99");
	  Thread.sleep(3000);
	  
	  driver.navigate().forward();
	  System.out.println("Now on google again");
	  
	  Thread.sleep(3000);
	  
	  driver.navigate().refresh();
	  System.out.println("Window refreshed");
	  
	  Thread.sleep(3000);

	  driver.quit();
  }
}
