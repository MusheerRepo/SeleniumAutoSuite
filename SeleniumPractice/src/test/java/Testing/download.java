package Testing;

import java.awt.Robot;
import java.awt.event.InputEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class download
{
  @Test
  public void f() throws Exception
  {
	  System.setProperty("webdriver.chrome.driver", "D:\\Projects\\Automation\\drivers\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.get("https://store.steampowered.com/about/");
	  //driver.findElement(By.xpath("//*[@id=\"about_greeting\"]/div[3]/div[1]")).click();
	  
	  Robot rb=new Robot();
	  rb.mouseMove(215, 610);
	  rb.mousePress(InputEvent.BUTTON1_DOWN_MASK);
	  rb.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
	  Thread.sleep(5000);
	  driver.quit();
  }
}
