package pages;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
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
	public void click_SignInLink(){
		 SignInlink.click();		
	}
	@FindBy(how=How.CSS, using= "#search_query_top")
	WebElement SearchTextBox;
	
	@FindBy(how=How.NAME, using = "submit_search")
	WebElement SearchIconBox;
	
	@FindBy(how=How.XPATH, using = "//*[@id='block_top_menu']/ul/li[1]/a")
	WebElement  WomenLink;
	
	@FindBy(how=How.LINK_TEXT, using = "Summer Dresses")
	WebElement SummerDressLabel;
	
	@FindBy(how=How.XPATH, using = "//*[@id='layered_price_slider']/a[1]")
	WebElement PriceRangeSlider1;

	@FindBy(how=How.XPATH, using = "//*[@id='layered_price_slider']/a[2]")
	WebElement PriceRangeSlder2;
	//*[@id='layered_price_slider']/a[2]
	
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
	public void click_SummerDressLabel(){
		Actions action = new Actions(driver);
		action.moveToElement(WomenLink).build().perform();
		SummerDressLabel.click();
	}
	public void I_click_Search_Icon_Box(){
		SearchIconBox.click();
	}
	
	public void change_price_range() throws InterruptedException{
	
	Dimension dim=	PriceRangeSlider1.getSize();
	int x =dim.getWidth();
	//System.out.println(x);
	
	     Actions action = new Actions(driver);
	     action.clickAndHold(PriceRangeSlider1).moveByOffset(0, 0).release().build().perform();
			
	}
	
	public void change_further_price_range() throws InterruptedException{
	Dimension dime=	PriceRangeSlder2.getSize();
     int y=	dime.getWidth();
		Actions actions = new Actions(driver);
		actions .clickAndHold(PriceRangeSlder2).moveByOffset(-183, 0).release().build().perform();
			
	}
	}

