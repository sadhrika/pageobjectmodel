package pageobject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchResultPF {
	public SearchResultPF(WebDriver driver) {
		this.driver=driver;
		
		
	}

	private WebDriver driver;
	private By listSearchResult=By.xpath("div(contains(@data-cel-widget,'search_results_')]//h2");
	 
	
	public List<WebElement>returnSearchResultList(){
		return driver.findElements(listSearchResult);
		
	}
}

