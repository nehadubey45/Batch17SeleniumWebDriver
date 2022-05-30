package Session_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class _2_FirefoxInvocation {

	public static void main (String[] args) 
	{
		
		//Automation
	//System.setProperty("webdriver.gecko.driver", "C:\Users\dubey\eclipse-workspace\Batch17SeleniumWebDriver\geckodriver.exe");
		
	System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/geckodriver.exe");
		
	WebDriver driver = new FirefoxDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		String title = driver.getTitle();
		
		String titleExpected = "Facebook – log in or sign up";
		
	 System.out.println("Web Page title is -> " + title);
	
	 //Validation
	if(title.equals(titleExpected))
	{
		System.out.println("Tilte matched");
	}
	else
	{
		System.out.println("Title doesn't match");
	}
	 
	 driver.close();
	 
	
	}
	
	
	
	
	
}
