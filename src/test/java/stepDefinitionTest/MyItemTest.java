package stepDefinitionTest;

import org.openqa.selenium.support.PageFactory;

import base.TestBase;
import cucumber.api.java.en.Then;
import junit.framework.Assert;
import pages.MyItemPage;


public class MyItemTest extends TestBase {
	MyItemPage myItemPage = new MyItemPage(); 
	
	@Then("^user is taken to my item page$")
	public void user_is_taken_to_my_item_page() throws Throwable {
		MyItemPage myItemPage= PageFactory.initElements(driver, MyItemPage.class);
	    String myItemTitle= myItemPage.validate_myItem_Title();
	    System.out.println("The title of product listing page is "+myItemTitle);
	}
	
	@Then("^user confirm details of purchased item$")
	public void user_confirm_details_of_purchased_item() throws Throwable {
		MyItemPage myItemPage = PageFactory.initElements(driver, MyItemPage.class);
	boolean c=	myItemPage.I_see_big_picture_of_itemPurchased();
	System.out.println("User see a big picture of my product is "+c);
	boolean d= myItemPage.I_confirm_the_Price();
	System.out.println("User see the bolder text of the price of my item "+d);
    String e=myItemPage.I_see_bolder_item_text();
    System.out.println("The text of the item boldly displayed is  "+e);
	
		
	}
	@Then("^user click on Add To Cart button$")
	public void user_click_on_Add_To_Cart_button() throws Throwable {
		 MyItemPage myItemPage= PageFactory.initElements(driver, MyItemPage.class);
		 myItemPage.click_Add_To_Cart_Button();
	}
	
	@Then("^user confirm seeing a message saying product is successfully added to cart$")
	public void user_confirm_seeing_a_message_saying_product_is_successfully_added_to_cart() throws Throwable {
		MyItemPage myItemPage= PageFactory.initElements(driver, MyItemPage.class);
		String confirmedMessage= myItemPage.I_verify_message_product_addedTo_shopping_Cart();
		System.out.println("The message displayed is "+ ""+confirmedMessage);
		Assert.assertTrue(myItemPage.I_verify_message_product_addedTo_shopping_Cart().contains("Product successfully added to your shopping cart"));
	}
	
	@Then("^user click on proceed To Checkout$")
	public void user_click_on_proceed_To_Checkout() throws Throwable {
		MyItemPage myItemPage= PageFactory.initElements(driver, MyItemPage.class);
		myItemPage.click_ProccedToCheckout_Button();
	}
}
