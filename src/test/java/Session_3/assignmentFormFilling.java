package Session_3;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignmentFormFilling {

	WebDriver driver;
	String url = "http://demo.automationtesting.in/Register.html";
	String firstName = "Tom";
	String lastName = "Peter";
	String address = "301, bakers street, NYC";
	String email = "www.tom@gmail.com";
	String phone = "9978655433";
	String gender = "Female";
	String hobbies = "Cricket and Hockey";
	String password = "tom@123";
	String confirmPassword = "tom@123";
	
	
	
	
	@Before
	public void setUp()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);
	}
	
	@Test
	public void formFillingValidation()
	{
		WebElement firstNameField = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		WebElement lastNameFiled =  driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		firstNameField.sendKeys(firstName);
		lastNameFiled.sendKeys(lastName);	
		
		WebElement addressField = driver.findElement(By.xpath("//textarea[@class='form-control ng-pristine ng-untouched ng-valid']"));
		addressField.sendKeys(address);
		
		WebElement emailField = driver.findElement(By.xpath("//input[@type='email']"));
		emailField.sendKeys(email);
		
		WebElement phoneField = driver.findElement(By.xpath("//input[@ng-model='Phone']"));
		phoneField.sendKeys(phone);
		
		WebElement genderField = driver.findElement(By.xpath("//input[@value='FeMale']"));
		genderField.click();
		
		WebElement Hobbies = driver.findElement(By.xpath("//input[@id='checkbox1']"));
		WebElement Hobbies1 = driver.findElement(By.xpath("//input[@id='checkbox2']"));
		Hobbies.click();
		Hobbies1.click();
	}
	
//	@Test
//	public void Addressvalidation()
//	{
//		
//		WebElement addressField = driver.findElement(By.xpath("//textarea[@class='form-control ng-pristine ng-untouched ng-valid']"));
//		addressField.sendKeys(address);
//		
//	}
	
//	@Test
//	public void emailValidation()
//	{
//		WebElement emailField = driver.findElement(By.xpath("//input[@type='email']"));
//		emailField.sendKeys(email);
//	}
	
//	@Test
//	public void phoneValidation()
//	{
//		WebElement phoneField = driver.findElement(By.xpath("//input[@ng-model='Phone']"));
//		phoneField.sendKeys(phone);
//		
//	}
//	@Test
//	public void genderValidation()
//	{
//		WebElement genderField = driver.findElement(By.xpath("//input[@value='FeMale']"));
//		genderField.click();
//	}
	
	
	
	
	
	
	
	
	
	@After
	public void tearDown() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.quit();
		
	}
	
	
	
	
}
