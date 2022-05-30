package Session_3;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class _5_DropDownHandlingBySelectClass {

	WebDriver driver;
	
	@Before
	public void setUp()
	{
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
	}
	
	@Test
	public void dropDown() throws InterruptedException
	{
		WebElement CreateNewAccountButton = driver.findElement(By.xpath("//a[@role='button'and text()='Create New Account']"));
		CreateNewAccountButton.click();
		WebElement birthDay = driver.findElement(By.id("day"));
		WebElement birthMonth = driver.findElement(By.name("birthday_month"));
		WebElement birthYear = driver.findElement(By.id("year"));
		
		//here we are creating a object of select class and in the constructor of select class we have to give a webElement
		Select daySelect = new Select(birthDay);
		
		//daySelect.selectByIndex(2);
		//daySelect.selectByValue("4");
		daySelect.selectByVisibleText("5");
		
		Thread.sleep(3000);
		
		Select monthSelect = new Select(birthMonth);
		monthSelect.selectByVisibleText("Sep");
		//monthSelect.selectByValue("9");
		//monthSelect.selectByIndex(8);
		
		Thread.sleep(3000);
		
		Select yearSelect = new Select(birthYear);
		yearSelect.selectByVisibleText("2011");
		//yearSelect.selectByValue("2014");
		
		Thread.sleep(3000);
	
	}
	
	@After
	public void tearDown() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.quit();
	}
	
	
	
	
	
	
	
}
