package Testing;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Ctrlplusclick
{
  @Test
  public void f() throws Exception
  {
	  System.setProperty("webdriver.chrome.driver", "D:\\Projects\\Automation\\drivers\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.get("https://store.steampowered.com/about/");
	  
	  Robot rb=new Robot();
	  rb.keyPress(KeyEvent.VK_CONTROL);
	  Thread.sleep(5000);
	  System.out.println("1");
	  
	  //getting location
	  int x=driver.findElement(By.xpath("//*[@id=\"global_header\"]/div/div[2]/a[2]")).getLocation().getX();
	  int y=driver.findElement(By.xpath("//*[@id=\"global_header\"]/div/div[2]/a[2]")).getLocation().getY();
	  rb.mouseMove(x+20, y+170);
	  System.out.println(x+"  "+y);
	  rb.mousePress(InputEvent.BUTTON1_DOWN_MASK);
	  rb.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
	  Thread.sleep(5000);
	  System.out.println("1");
	  
	  rb.keyRelease(KeyEvent.VK_CONTROL);
	  Thread.sleep(5000);
	  System.out.println("1");
	  driver.quit();
  }
}
