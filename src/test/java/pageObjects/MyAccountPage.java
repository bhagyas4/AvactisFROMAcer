package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import configuration.Browser;

public class MyAccountPage extends LoadableComponent<MyAccountPage> {
	
	private WebDriver driver;
	WebDriverWait wait ;
	@FindBy ( name = "customer_info[Customer][Email]")
	private WebElement email;
	@FindBy (name= "customer_info[Customer][Password]")
	private WebElement password;
	@FindBy (name= "customer_info[Customer][RePassword]")
	private WebElement repeatPassword;
	@FindBy (name= "customer_info[Customer][FirstName]")
	private WebElement firstName;
	@FindBy (name= "customer_info[Customer][LastName]")
	private WebElement lastName;
	@FindBy (name= "customer_info[Customer][Country]")
	private WebElement country;
	@FindBy (id= "customer_info_Customer_State")
	private WebElement state;
	@FindBy (xpath = "//input[@value='Register']")
	private WebElement registerButton;




	public MyAccountPage(WebDriver driver) {
		driver = this.driver;
		PageFactory.initElements(driver, this);
	}



	
	
	public MyAccountPage registerNewUser() {
		email.sendKeys("mairtybala@gmail.com");
		password.sendKeys("Oran6es234");
		repeatPassword.sendKeys("Oran6es234");
		firstName.sendKeys("Shri");
		lastName.sendKeys("sapt");
		Select select = new Select (driver.findElement(By.name("customer_info[Customer][Country]")));
		select.selectByValue("100");
		MyAccountPage myaccopage = new MyAccountPage(driver);
		return myaccopage ;
		
		
		}
	
	public void login() {
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@Override
	protected void load() {
		
		
		
		
		
		
	}

	@Override
	protected void isLoaded() throws Error {
		
		String actualpageTitle = driver.getTitle();
		String expectedPAgeTitle= "";
		Assert.assertEquals(expectedPAgeTitle, actualpageTitle );
		
	}
	
	

}
