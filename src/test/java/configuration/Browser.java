package configuration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Browser {
	
	/* in this class we ccan set different browsers and depending on passing the value 
	 * we can include that broweser to run the test on that 
	 */
	 
	 
	 private static WebDriver driver;
	 
	 public static void setBrowser (WebDriver remoteWebDriver) {
		 driver = remoteWebDriver;
	 }
	 
	 public static void setBrowser(String browser) {
		 System.out.println("Inside setBrowser value is " + browser);
		 if ( browser.equals("CH")) {
			 System.out.println("Test will run on chrome");
			 System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
			 driver = new ChromeDriver();
			 }
		 
		 
		 else if ( browser.equals("FF")) {
			 System.out.println("Test will run on FireFox");
			 System.setProperty("webdriver.chrome.driver", "src/test/resources/geckodriver.exe");
			 driver = new FirefoxDriver();
			 }
		 
		 else if ( browser.equals("IE")) {
			 System.out.println("Test will run on Internet Explorer");
			 System.setProperty("webdriver.chrome.driver", "src/test/resources/");
			 driver = new InternetExplorerDriver();
		 }
	 }
		 
		 
	 }


