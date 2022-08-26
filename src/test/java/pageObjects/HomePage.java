package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import configuration.ConfigProperties;

public class HomePage extends LoadableComponent <HomePage>  {
	
	private WebDriver driver;
	WebDriverWait wait;
	ConfigProperties property;
	
	
	
	public HomePage() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
		driver= new ChromeDriver();
		//driver = new InternetExplorerDriver();
		PageFactory.initElements(driver,this);
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, 20 );
	}
	
	public HomePage clickMyAccount() {
		driver.findElement(By.linkText("My Account")).click();
		HomePage homepage = new HomePage();
		return homepage;
		//button[contains(text(),'Register')]
		
	}

		
	@Override
	protected void load() {
		driver.get("http://localhost/avactis");
		
		
	}

	@Override
	protected void isLoaded() throws Error {
		String actualpageTitle = driver.getTitle();
		String expectedPAgeTitle= "Avactis Demo Store";
		Assert.assertEquals(expectedPAgeTitle, actualpageTitle );
		
	}
	
	public void quitBrowser() {
	
	driver.quit();
	

}
}
