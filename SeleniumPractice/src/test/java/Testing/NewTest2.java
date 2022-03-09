package Testing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest2
{
	WebDriver driver=null;
  @Test
  public void f()
  {
	  System.setProperty("webdriver.chrome.driver", 
				"D://Projects//Automation//drivers//chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		
		List<WebElement> row=driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr"));
		int totalrow=row.size();
		
		for(int i=0;i<totalrow;i++)
		{
			List<WebElement> col=row.get(i).findElements(By.tagName("td"));
			int totalcol=col.size();
			
			for(int j=0;j<totalcol;j++)
			{
				System.out.print(col.get(j).getText());
				System.out.print("  ");
			}
			System.out.println();
		}
		
	driver.quit();
  }
}
