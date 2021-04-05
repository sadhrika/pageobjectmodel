package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import pageobject.HomePF;
import pageobject.LoginPF;
import utility.webdrivermanger;



public class Login_Test {

	private WebDriver driver;
	private webdrivermanger webDrvMgr;
	private HomePF homePF;
	private LoginPF loginPF;
	
	
	
	

	@BeforeClass
	public void setUP() {
		webDrvMgr = new webdrivermanger();
		driver = webDrvMgr.launchBrowser("chrome");
				
			driver.get("http://amazon.in");
			driver.manage().window().maximize();
			
	
	}
	@Test
	public void valid_UsrName_InValid_Password() throws Exception {
		
		homePF = new HomePF(driver);
		homePF.clickSigninLink();
		
		
	    loginPF=new LoginPF(driver);
		loginPF.enterUsrName("8885660277");
		loginPF.clickContinueOnUserName();
			
		loginPF.enterPassword("mypassword");
		loginPF.clickSignInSubmit();
		
		Thread.sleep(10000);
		
		boolean actionerrexist = false;
		actionerrexist = loginPF.doesActionErrorExist();
		if(actionerrexist == false)
		{
			actionerrexist = loginPF.doesActionErrorExist();
		}
		Assert.assertTrue(actionerrexist);
	}
	
	
	
	@AfterTest
	public void tear_Down() {
		driver.quit();
	}
}

