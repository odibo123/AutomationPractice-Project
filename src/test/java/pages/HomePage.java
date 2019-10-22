package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
//import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class HomePage extends TestBase{
	
	//constructor
	public HomePage(){
		PageFactory.initElements(driver, this);
	}
	
	//  All Objects found are declared 
	
	@FindBy(how=How.LINK_TEXT,using = "Sign in")
	 WebElement SignInlink;
	
	@FindBy(how=How.XPATH,using = "//img[@class='logo img-responsive']")
	 WebElement LogoLabel;
	
	@FindBy(how=How.XPATH,using = "//*[@id='contact-link']/a")
	 WebElement ContactusLink;
	
	//methods or actions
	
	public void click_SignInLink(){
		 SignInlink.click();		
	}
	@FindBy(how=How.CSS, using= "#search_query_top")
	WebElement SearchTextBox;
	
	@FindBy(how=How.NAME, using = "submit_search")
	WebElement SearchIconBox;
	
	public String validate_HomePage_Title(){
	return	driver.getTitle();	
		}
	
	public boolean verify_LogoLabel(){
		return LogoLabel.isDisplayed();
   }
	public void click_Contact_UsLink(){
		ContactusLink.click();
		
	}
	public void click_on_Search_Text_Box(){
		SearchTextBox.click();
	}
	

	public void type_Choice_of_clothes(String clothing){
		SearchTextBox.sendKeys(clothing);	
	}
	public void I_click_Search_Icon_Box(){
		SearchIconBox.click();
	}
	}

