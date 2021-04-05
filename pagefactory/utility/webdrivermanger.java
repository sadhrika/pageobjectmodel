package utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import pageobjects.LoginPO;

public class webdrivermanger {
	
	private WebDriver driver;
	

	public WebDriver launchBrowser(String browserName) {
		
		if(browserName.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver","E:/Sadhrika481\\drivers\\chromedriver.exe") ;
				driver = new ChromeDriver();
	    }else if(browserName.equalsIgnoreCase("Firefox")){
				System.setProperty("webdriver.gecko.driver","E:\\Sadhrika481\\drivers\\geckodriver.exe");
				driver = new FirefoxDriver();
		}else {
			Assert.fail("Invaelid Browser was Passed.");
		}
		
		
			 driver.manage().window().maximize();
			 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			 
		return driver;
		
	}
}