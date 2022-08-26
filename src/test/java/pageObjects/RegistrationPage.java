package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.LoadableComponent;

public class RegistrationPage extends LoadableComponent<RegistrationPage> {

	private WebDriver driver;
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
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@Override
	protected void load() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void isLoaded() throws Error {
		// TODO Auto-generated method stub
		
	}
	

}
