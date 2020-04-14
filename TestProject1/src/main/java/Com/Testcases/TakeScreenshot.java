package Com.Testcases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TakeScreenshot {
	
	@Test
	
	public void ScreenShot() throws IOException{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Expandly_Automation\\Expandly_Automation_Project\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/V4/");
		this.TakeScreeshotNow(driver, "C:\\Users\\SHUBHAM-PC\\git\\PracticeProject\\TestProject1\\Screenshot\\test.png");
		driver.quit();
	}
	
	public void TakeScreeshotNow(WebDriver webdriver, String FilePath) throws IOException{
		TakesScreenshot scr = ((TakesScreenshot)webdriver);
		File SourceFile = scr.getScreenshotAs(OutputType.FILE);
		File destinationFile = new File(FilePath);
		FileUtils.copyFile(SourceFile, destinationFile);
		
		
	}

}
