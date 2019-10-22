package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;


public class ProductListingPage extends TestBase{

	public ProductListingPage(){
		PageFactory.initElements(driver, this);
	}
	
//  All Objects found are declared 
	@FindBy(how=How.CSS, using = "img.replace-2x.img-responsive")
     WebElement ProductQuickview;
	
	@FindBy(how=How.CSS,using= "#best-sellers_block_right > div > ul > li:nth-child(1) > div > h5 > a")
	WebElement ProductTitle;
	
	@FindBy(how=How.XPATH,using= "//span[@class='price'][contains(text(),'$16.40')]")
	WebElement ProductPrice;
	
	//create all the methods
	public boolean I_Verify_ProductQuickview_Image(){
	return ProductQuickview.isDisplayed();
	}
	
	public String verify_Product_Title(){
		return ProductTitle.getText();
	}
	
	public String verify_Product_Price(){
	return ProductPrice.getText();
	}
	
	public void click_ProductQuickview_Item(){
		 ProductQuickview.click();
	}
	
}
