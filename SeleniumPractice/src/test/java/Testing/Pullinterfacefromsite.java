package Testing;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pullinterfacefromsite
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Projects\\Automation\\drivers\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver.get("https://www.selenium.dev/selenium/docs/api/java/allclasses-noframe.html");
		  List<WebElement> a=driver.findElements(By.className("interfaceName"));
		  
		  for(WebElement i:a)
		  {
			  System.out.println(i.getText());
		  }
		  
		  driver.quit();
	}

}
