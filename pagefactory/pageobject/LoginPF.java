package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPF {
	public LoginPF( WebDriver driver) {
		this.driver =driver;
		PageFactory.initElements(this.driver, this);
	}

	
	
	private WebDriver driver;
	
	
	@FindBy(id="email")
	private WebElement username;
	@FindBy(id="continue")
	private WebElement continueOnUserNae ;
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(id="signinSubmit")
	private WebElement signinSubmit;
	@FindBy(id="//div[@id='auth-error-message-box']")
	private WebElement actionError;
	@FindBy(id="//div[@id='auth-warning-message-box']")
	private WebElement actionWar ;
	
	
	public void enterUsrName(String userName) {
		username.clear();
		username.sendKeys(userName);
	}
	
 public void clickContinueOnUserName() {
	 continueOnUserNae.click();
 }
 
public void enterPassword(String strPassword) {
	password.clear();
	password.sendKeys(strPassword);
}




public void clickSignInSubmit() {
	signinSubmit.click();
}


public boolean doesActionErrorExist() {
	boolean actionErrorExist=false;
	try {
		if(actionError.isDisplayed() || actionWar.isDisplayed())
		actionErrorExist=true;
	}
	catch(Exception ex) {
		
}
return actionErrorExist;
}
}
