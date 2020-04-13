package Com.Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OpenbrowserTestcase {
	
	 
	@Test
	public void test12() throws Exception{
		
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Expandly_Automation\\Expandly_Automation_Project\\chromedriver.exe");
	 
	// Initialize browser
	WebDriver driver=new ChromeDriver();
	
	 
	// Open Google
	driver.get("http://www.google.com");
	 
	// Close browser
	driver.close();
	}
	 
	}

