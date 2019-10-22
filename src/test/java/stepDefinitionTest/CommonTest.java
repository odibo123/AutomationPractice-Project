package stepDefinitionTest;

import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pages.HomePage;


public class CommonTest extends TestBase{
	
	HomePage homePage = new HomePage();  
	
	@Given("^user opens the browser$")
	public void user_opens_the_browser() throws Throwable {
		TestBase.initialization();   //initialialize the webbrowser and the url  using TestBase(inheritance concepts)
	}

	@Then("^user is on Home Page$")
	public void user_is_on_Home_Page() throws Throwable {
	HomePage homepage=PageFactory.initElements(driver,HomePage.class); 
		 String title= homepage.validate_HomePage_Title();
	     System.out.println("The title of HomePage is  "+ title);
	    Assert.assertTrue(homepage.validate_HomePage_Title().contains("My Store"));
	}

	@Then("^user sees a Logo banner$")
	public void user_sees_a_Logo_banner() throws Throwable {
		HomePage homepage=PageFactory.initElements(driver,HomePage.class); 
	    boolean b=	homepage.verify_LogoLabel();
	    System.out.println("Logo banner is displayed is "+ b);
		
	}
}
