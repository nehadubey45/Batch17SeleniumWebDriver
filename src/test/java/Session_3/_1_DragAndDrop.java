package Session_3;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class _1_DragAndDrop {

	WebDriver driver;
	
	@Before
	public void setUp()
	{
	 driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().deleteAllCookies();
	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 driver.get("https://demoqa.com/droppable");
	}
	
	@Test
	public void dropDown() throws InterruptedException
	{
		WebElement dragArea = driver.findElement(By.id("draggable"));
		//WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement dropArea = driver.findElement(By.xpath("//div[@id='simpleDropContainer']//div[@id='droppable']"));
		//WebElement drop = driver.findElement(By.id("droppable"));
		
		//when we have to use click action here hold it 'drag me' and then drop over here 'drop here'and release the mouse key, for that
		//you have to create actions class
		
		Actions act	= new Actions(driver);
		
		Thread.sleep(3000);
		
		act.dragAndDrop(dragArea, dropArea).build().perform();
		
	 WebElement dropedTextElement = driver.findElement(By.xpath("//div[@id='droppable']/p[text()='Dropped!']"));
	 
	 Assert.assertEquals("The actions is not performed",dropedTextElement.getText() ,"Dropped!"); 	
		
	}
	
	@After
	public void tearDown() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.quit();
	}
	
	
}
