package Testing;

import java.awt.Robot;
import java.awt.event.InputEvent;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WindowsHandle
{
  @Test
  public void f() throws Exception
  {
	  System.setProperty("webdriver.chrome.driver", "D:\\Projects\\Automation\\drivers\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("http://demo.guru99.com/popup.php");
	  String mainHandle=driver.getWindowHandle();
	  System.out.println(mainHandle);
	  driver.findElement(By.partialLinkText("Click Here")).click();
	  Set<String> wh=driver.getWindowHandles();
	  
	  Iterator<String> i=wh.iterator();
	  
	  while(i.hasNext())
	  {
		  String temp=i.next();
		  System.out.println(temp);
		  System.out.println(1);
		  driver.switchTo().window(temp);
		  Thread.sleep(3000);
	  }
	  
	  Robot rb= new Robot();
	  rb.mouseMove(470, 10);
	  rb.mousePress(InputEvent. BUTTON1_DOWN_MASK);
	  rb.mouseRelease(InputEvent. BUTTON1_DOWN_MASK);
	  driver.switchTo().window(mainHandle);
	  
	  Thread.sleep(3000);
	  driver.quit();
  }
}
