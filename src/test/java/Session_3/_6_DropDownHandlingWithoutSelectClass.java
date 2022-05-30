package Session_3;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class _6_DropDownHandlingWithoutSelectClass {

	WebDriver driver;
	
	@Before
	public void setUp()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
	
	}
	
	@Test
	public void dropDown() throws InterruptedException
	{
		WebElement rightClickMeButton = driver.findElement(By.xpath("//span[text()='right click me']"));
		
		Thread.sleep(2000);
		
		Actions act = new Actions(driver);
		act.contextClick(rightClickMeButton).build().perform();
		
		List <WebElement> rightClickMenuOptions = driver.findElements(By.xpath("//ul[@class='context-menu-list context-menu-root']//li/span"));
		for(int i=0; i < rightClickMenuOptions.size(); i++)
		{
			System.out.println("Option No" + (i+1)+"is"+rightClickMenuOptions.get(i).getText());
			if (rightClickMenuOptions.get(i).getText().equals("Copy"))
			{
				Thread.sleep(2000);
				rightClickMenuOptions.get(i).click();
				Thread.sleep(2000);
			}
		}
		
		
	}
	
	
	@After
	public void tearDown() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.quit();
	}
	
	
	
}
