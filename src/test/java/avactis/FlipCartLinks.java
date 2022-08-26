package avactis;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.Collection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class FlipCartLinks {
	
	WebDriver driver;
  @Test
  public void f() {
	  
	  driver.findElement(By.xpath("//*[@class='_2QfC02']/button")).click();
	  
	  List <WebElement> allLinksOnPage = driver.findElements(By.tagName("a"));
	  
	  for(int i=0; i <allLinksOnPage.size(); i++ ) {
		  
		  System.out.println("Links on the page are " +allLinksOnPage.get(i).getAttribute("href") );
		  
		  
	  }
	  System.out.println("Total links are " +allLinksOnPage.size());


	  
	  
  }
  
  
  
  @BeforeClass
  public void beforeClass() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sachin\\eclipse-workspace\\avactis\\src\\test\\resources\\chromedriver.exe");
	  driver= new ChromeDriver();
	  driver.get("https://www.flipkart.com/");
	  driver.manage().window().maximize();

  }

  @AfterClass
  public void afterClass() {
	  
	  driver.quit();
  }

}
