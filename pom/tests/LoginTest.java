package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import functionlibrary.SearchResultLib;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageobjects.HomePO;
import pageobjects.LoginPO;


public class LoginTest {
	
	
	private WebDriver driver;
	
	private WebDriverManager webDrvMgr;
	private HomePO homepo;
	private LoginPO loginpo;
	private SearchResultLib serreslib;
	
	@BeforeClass
	public void setUP() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
			driver.get("http://www.amazon.in");
			driver.manage().window().maximize();

			driver.findElement(By.xpath("//div[@class='nav-line-1-container']")).click();
			driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("lokeshwarreddyk33@gmail.com");
			driver.findElement(By.xpath("//input[@id='continue']")).click();
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys("401401401");
			driver.findElement(By.xpath("//input[@id=\"signInSubmit\"]")).click();
			
			
	}
	@Test
	public void valid_UsrName() throws InterruptedException { 
		homepo=new HomePO(driver);
		homepo.clickSigninLink();
		
		
	
		serreslib= new SearchResultLib(driver);
	
		
		
		Thread.sleep(10000);
		
		boolean actionerrexist = false;
		actionerrexist = loginpo.doesActionErrorExist();
		boolean actionWarexist = loginpo.doesActionErrorExist();
		if(actionerrexist == false)
		{
			actionerrexist = loginpo.doesActionErrorExist();
		}
		Assert.assertTrue(actionerrexist);
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}	