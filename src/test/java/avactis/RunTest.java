package avactis;

import org.testng.annotations.Test;

import configuration.ConfigProperties;
import pageObjects.HomePage;
import pageObjects.MyAccountPage;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class RunTest {
	
	HomePage homepage;
	ConfigProperties properties;
	MyAccountPage myaccopage;
	
  @Test
  public void f() {
	  homepage.clickMyAccount();
	myaccopage.registerNewUser();  
	  
  }
  
  @BeforeClass
  public void beforeClass() {
	   homepage  = new HomePage();
	  homepage.get();
  }

  @AfterClass
  public void afterClass() {
	  homepage.quitBrowser();
  }

}
