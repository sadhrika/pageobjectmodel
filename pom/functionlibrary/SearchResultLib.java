package functionlibrary;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pageobjects.SearchResultPO;


public class SearchResultLib {

	
	public SearchResultLib(WebDriver driver) {
		this.driver=driver;
		
		
	}
	private WebDriver driver;
	private SearchResultPO searespo;
	public List<WebElement>returnSearchResultList(){
		searespo=new SearchResultPO(driver);
		
		return searespo.returnSearchResultList();
	}
	
}
