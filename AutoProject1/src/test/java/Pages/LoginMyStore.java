package Pages;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import Framework.Setup;

public class LoginMyStore extends Setup
{
	By emailTextField=By.id("email_create");
	By MrMrs=By.xpath("//*[@value='1']");
	By createaccountbutton= By.xpath("//button[@name='SubmitCreate']");
	By Firstname=By.xpath("//input[@name='customer_firstname']");
	By lastname=By.xpath("//input[@name='customer_lastname']");
	By passwordfield=By.xpath("//input[@name='passwd']");
	By selectdate=By.xpath("//select[@name='days']");
	By selectmonth=By.xpath("//select[@name='months']");
	By selectyear=By.xpath("//select[@name='years']");
	By CusFirstname=By.xpath("//input[@name='firstname']");
	By Cuslastname=By.xpath("//input[@name='lastname']");
	By addresssfield=By.xpath("//input[@id='address1']");
	By cityfield=By.xpath("//input[@id='city']");
	By state=By.xpath("//select[@id='id_state']");
	By zipfield=By.xpath("//input[@id='postcode']");
	By country=By.xpath("//select[@id='id_country']");
	By mobilefield=By.xpath("//input[@id='phone_mobile']");
	By aliasfield=By.xpath("//input[@id='alias']");
	By Registerbutton=By.xpath("//*[@name='submitAccount']");
	By emailfield=By.id("email");
	By passwordtfield=By.xpath("//*[@id='passwd']");
	By submitbutton= By.xpath("//*[@id='SubmitLogin']");
	
	public void filldetails() throws Exception
	{
		//Declaring XSSF object
		//FileInputStream fis=new FileInputStream("D:\\Projects\\Automation\\AutoProject1\\src\\test\\java\\TestData\\TestDataFile.xlsx");
		//XSSFWorkbook wb=new XSSFWorkbook(fis);
		//XSSFSheet sh=wb.getSheetAt(0);
		
		Scanner scob=new Scanner(new File("D:\\Projects\\Automation\\AutoProject1\\src\\test\\java\\TestData\\tdft.txt"));
		System.out.println("File stream for test data from file initialized");
		
		driver.findElement(emailTextField).sendKeys(email);
		driver.findElement(createaccountbutton).click();
		
		driver.findElement(MrMrs).click();
		driver.findElement(Firstname).sendKeys(username);
		driver.findElement(lastname).sendKeys(username);
		driver.findElement(passwordfield).sendKeys(password);
		
		new Select(driver.findElement(selectdate)).selectByVisibleText("1 ");
		new Select(driver.findElement(selectmonth)).selectByVisibleText("January ");
		new Select(driver.findElement(selectyear)).selectByVisibleText("2004 ");
		
		driver.findElement(CusFirstname).sendKeys(username);
		driver.findElement(Cuslastname).sendKeys(username);
		
		//Row r=sh.getRow(0);
		driver.findElement(addresssfield).sendKeys(scob.nextLine());
		driver.findElement(cityfield).sendKeys(scob.nextLine());
		new Select(driver.findElement(state)).selectByVisibleText("Alaska");
		
		driver.findElement(zipfield).sendKeys(scob.nextLine());
		new Select(driver.findElement(country)).selectByVisibleText("United States");
		
		driver.findElement(mobilefield).sendKeys(scob.nextLine());
		
		driver.findElement(aliasfield).sendKeys(scob.nextLine());
	}
	
	public void clickregisterbutton()
	{
		driver.findElement(Registerbutton).click();
	}
	
	public void fillsigncred()
	{
		driver.findElement(emailfield).sendKeys(email);
		driver.findElement(passwordtfield).sendKeys(password);
	}
	
	public void fillexistingcred()
	{
		driver.findElement(emailfield).sendKeys(existingemail);
		driver.findElement(passwordtfield).sendKeys(password);
	}
	
	public void clicksubmit()
	{
		driver.findElement(submitbutton).click();
	}
}
