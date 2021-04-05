package functionlibrary;



import org.openqa.selenium.WebDriver;

import pageobjects.LoginPO;


public class LoginLib {
 private LoginPO loginpo;
  WebDriver driver;
 

  
  public LoginLib(WebDriver driver) {
	  this.driver=driver;
	  
  }
  public void login(String usrName,String password) {
	  loginpo =new LoginPO(driver);
	  loginpo.enterUsrName(usrName);
	  loginpo.clickContinueOnUserName();
	  loginpo.enterPassword(password);
       loginpo.clickSignInSubmit();
  }
}
