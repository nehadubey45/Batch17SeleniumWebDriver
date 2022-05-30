package Session_2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InteractWithXpath {
	
	public static void main (String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		
		driver.get("http:\\demo.automationtesting.in/Register.html");
		
		System.out.println("Landing page title is -> " + driver.getTitle());
		
		WebElement userFirstName = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		userFirstName.sendKeys("Tom");
		
		WebElement userLastName = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		userLastName.sendKeys("Peter");
		
		WebElement userAdress = driver.findElement(By.xpath("//textarea[@ng-model='Adress']"));
		userAdress.sendKeys("301, bakers street, NYC");
		
		WebElement userEmail = driver.findElement(By.xpath("//input[@type='email']"));
		userEmail.sendKeys("www.tom@gmail.com");
		
		WebElement userPhone = driver.findElement(By.xpath("//input[@ng-model='Phone']"));
		userPhone.sendKeys("9978655433");
		
		WebElement maleRadio =	driver.findElement(By.xpath("//input[@value='Male']"));
		maleRadio.click();
		
		WebElement moviesCheckBox = driver.findElement(By.id("checkbox2"));
		moviesCheckBox.click();
		
		WebElement password = driver.findElement(By.xpath("//input[@ng-model='Password']"));
		password.sendKeys("pass@123");
		
		WebElement secondPassword = driver.findElement(By.xpath("//input[@ng-model='CPassword']"));
		secondPassword.sendKeys("pass@123");
		
		WebElement subbutton = driver.findElement(By.id("submitbtn"));
		subbutton.click();
		
		Thread.sleep(3000);
		
		driver.quit();
		
		
		
		
		
		
		
		
		
	}

}
