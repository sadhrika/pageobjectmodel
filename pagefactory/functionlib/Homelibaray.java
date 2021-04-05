package functionlib;

import org.openqa.selenium.WebDriver;

import pageobject.HomePF;



public class Homelibaray {

	public Homelibaray (WebDriver driver) {
		this.driver=driver;
	}
	private WebDriver driver;
	private HomePF hompf;
	
	public void searchProduct(String strSearchParam) {
		hompf =new HomePF(driver);
		hompf.searchProduct(strSearchParam);
	}
}
