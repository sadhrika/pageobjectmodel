package test;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import functionlib.Homelibaray;
import functionlib.SearchResultLibrary;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageobject.HomePF;
import pageobject.SearchResultPF;

public class SearchTestPF {

	private WebDriver driver;
	private WebDriver wd ;
	private HomePF homepf;
	private SearchResultLibrary searespf;
private Homelibaray homelib;
	private SoftAssert sf;
	

	@BeforeClass
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
			driver.get("http://amazon.in");
			driver.manage().window().maximize();
	}

	

	@BeforeMethod
	public void softAssertMethod() {
		sf = new SoftAssert();
	}
	
	
	String searchParam = "iPhone";
	
	@Test
	public void searchPrduct(WebDriver driver) throws Exception {
		homelib = new Homelibaray(driver);
		homelib.searchProduct(searchParam);
		

		Thread.sleep(5000);
		searespf = new SearchResultLibrary(driver);
		List<WebElement> listSearchResult = searespf.returnSearchResultList();

		for(WebElement ele:listSearchResult) {
			String text= ele.getText().toLowerCase();
			sf.assertEquals(text, searchParam.toLowerCase());
		}
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
	
}

