package functionlib;

import org.openqa.selenium.WebDriver;

import pageobject.LoginPF;



public class LoginLibray {
	private LoginPF loginpf;
	  WebDriver driver;
	 

	  public LoginLibray(WebDriver driver) {
		  this.driver=driver;
		  
	  }
	  public void login(String usrName,String password) {
		  loginpf =new LoginPF(driver);
		  loginpf.enterUsrName(usrName);
		  loginpf.clickContinueOnUserName();
		  loginpf.enterPassword(password);
	       loginpf.clickSignInSubmit();
	  }
}
