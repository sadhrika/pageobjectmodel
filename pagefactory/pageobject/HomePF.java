package pageobject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePF {
	public HomePF(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(this.driver, this);
	}
	private WebDriver driver;
	
	
	@FindBy(xpath="//a[@id='nav-link-accountList']")
	private WebElement signinLink; 
	@FindBy(id="twotabsearchtextbox")
	private WebElement searchBox;
	@FindBy(id="nav-search-submit-button")
	private WebElement searchicon ;
	
			
			public void clickSigninLink() {
		signinLink.click();
	}
		
			
			public void searchProduct(String strSearchParam) {
				searchBox.clear();
				searchBox.sendKeys(strSearchParam);

				searchicon.click();
				
				
			}
	
}
