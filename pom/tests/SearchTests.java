package tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import functionlibrary.HomeLib;
import functionlibrary.SearchResultLib;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SearchTests {
 public SearchTests(WebDriver driver){
	 this.driver = driver;
 }
	
	private WebDriver driver;
	private WebDriverManager webdrvrmgr;
	private HomeLib homlib;
	private SearchResultLib searchlib;
	private SoftAssert sf ;
	
	@BeforeClass
	public void setUp() {
    WebDriverManager.chromedriver().setup();
	WebDriver driver =new ChromeDriver();
		driver.get("http://amazon.in");
		driver.manage().window().maximize();
		
		
		

	}
	
	@BeforeMethod
	public void softAssert() {
		sf =new SoftAssert();
	}
	

	
	String searchParam = "iPhone";




	@Test
	public void Searchproduct() throws InterruptedException {
	
	homlib =new HomeLib(driver);
	homlib.searchProduct("searchparam");
	Thread.sleep(10000);
	searchlib =new SearchResultLib(driver);
	List<WebElement>listSearchResult =searchlib.returnSearchResultList();
	for(WebElement wbele:listSearchResult) {
		
		String text =  wbele.getText().toLowerCase();
		System.out.println(text);
		sf.assertTrue(text.contains(searchParam.toLowerCase()),"FAILURE|Expected"+searchParam);
	}
	sf.assertAll();
	

}
	

	@AfterClass
	public void tearDown() {
		driver.quit();
	
}
}

