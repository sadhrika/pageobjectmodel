package pageobjects;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

public class HomePO {

	public HomePO(WebDriver driver) {
		this.driver=driver;
		
	}
	private WebDriver driver;
	private By signinLink= By.id("new-link-accountlist-new-line-1");
	private By searchBox= By.id("twotabsearchtextbox");
	private By searchicon= By.id("nav-search-submit-button");
			
			public void clickSigninLink() {
		driver.findElement(signinLink).click();
	}
			
			public void searchProduct(String strSearchParam) {
				driver.findElement(searchBox).clear();
				driver.findElement(searchBox).sendKeys(strSearchParam);

				driver.findElement(searchicon).click();
				
			}
	
}
