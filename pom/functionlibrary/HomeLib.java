package functionlibrary;

import org.openqa.selenium.WebDriver;

import pageobjects.HomePO;


public class HomeLib {

	
	public HomeLib(WebDriver driver) {
		
		this.driver=driver;
	}
	private WebDriver driver;
	private HomePO hompo;
	
	public void searchProduct(String strSearchParam) {
		hompo =new HomePO(driver);
		hompo.searchProduct(strSearchParam);
	}
}
