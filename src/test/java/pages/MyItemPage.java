package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.TestBase;


public class MyItemPage extends TestBase{

	//  All Objects found are declared 
	
	
	@FindBy(how=How.CSS, using= "#add_to_cart > button > span")
	WebElement AddToCartBtn;
	
	@FindBy(how=How.XPATH, using="//*[@id='layer_cart']/div[1]/div[2]/div[4]/a/span")
	WebElement ProccedToCheckoutBtn;
	
	@FindBy(how=How.XPATH, using="//h2[contains(.,'Product successfully added to your shopping cart')]")
	WebElement ProductAddedToCartText;
	
	@FindBy(how=How.ID, using= "bigpic")
	WebElement BigPxImage;
	
	@FindBy(how=How.XPATH, using= "//h1[contains(.,'Printed Chiffon Dress')]")
	WebElement BolderItemTxt;
	
	@FindBy(how=How.ID, using= "our_price_display")
	WebElement BolderPriceTxt;
	
	
	//Actions  
	
	public String validate_myItem_Title(){
		return driver.getTitle();
		}

   public void click_Add_To_Cart_Button(){
	AddToCartBtn.click();
   }
   
   public void click_ProccedToCheckout_Button(){
	   
	   WebDriverWait wait = new WebDriverWait(driver,20);
	  WebElement element = wait.until(
	                       ExpectedConditions.visibilityOf(ProccedToCheckoutBtn));
	  ProccedToCheckoutBtn.click();
	  
  }
  public boolean I_see_big_picture_of_itemPurchased(){
	return  BigPxImage.isDisplayed();
  }
  
  public boolean I_confirm_the_Price(){
	 return BolderPriceTxt.isDisplayed();
  }
  
   public String I_see_bolder_item_text(){
	return BolderItemTxt.getText();
   }
 
   public String I_verify_message_product_addedTo_shopping_Cart(){
	   WebDriverWait wait = new WebDriverWait(driver,20);
	   WebElement element = wait.until(
               ExpectedConditions.visibilityOf(ProductAddedToCartText));
	           return  ProductAddedToCartText.getText();
  }
  }