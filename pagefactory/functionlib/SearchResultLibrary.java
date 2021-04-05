package functionlib;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pageobject.SearchResultPF;


public class SearchResultLibrary {
	public SearchResultLibrary(WebDriver driver) {
		this.driver=driver;
		
	}
	private WebDriver driver;
	private SearchResultPF searespf;
	public List<WebElement>returnSearchResultList(){
		searespf=new SearchResultPF(driver);
		
		return searespf.returnSearchResultList();
	}
}
