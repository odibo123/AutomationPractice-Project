package stepDefinitionTest;

import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.HomePage;
import pages.ProductListingPage;

public class ProductListingPageTest extends TestBase{
	HomePage homePage = new HomePage(); 
	ProductListingPage productListingPage= new ProductListingPage();
	
	@Then("^user click on search input box$")
	public void user_click_on_search_input_box() throws Throwable {
		HomePage homepage=PageFactory.initElements(driver,HomePage.class);
		 homepage.click_on_Search_Text_Box();
	}

	@Then("^user search for \"([^\"]*)\" in the search input box$")
	public void user_search_for_in_the_search_input_box(String clothing) throws Throwable {
		   HomePage homepage=PageFactory.initElements(driver,HomePage.class); 
	       homepage.type_Choice_of_clothes(clothing);
	}
	@When("^user clicks on Search on search box$")
	public void user_clicks_on_Search_on_search_box() throws Throwable {
		HomePage homepage=PageFactory.initElements(driver,HomePage.class); 
		homepage.I_click_Search_Icon_Box();
	}

	
	@Then("^user chooses an item displaying image and title and price$")
	public void user_chooses_an_item_displaying_image_and_title_and_price() throws Throwable {
		ProductListingPage productListingPage= PageFactory.initElements(driver, ProductListingPage.class);
		
        Boolean canSeeTheDress=	productListingPage.I_Verify_ProductQuickview_Image();
		System.out.println( "User can see the dress is "+canSeeTheDress);
	    Assert.assertTrue(productListingPage.I_Verify_ProductQuickview_Image());
	    
	    String title=	productListingPage.verify_Product_Title();
		System.out.println("The title of the page is "+ title);
		Assert.assertTrue(productListingPage.verify_Product_Title().contains("Printed Chiffon Dress"));
		
	   String price=	productListingPage.verify_Product_Price();
	   System.out.println("The price on chosen item item is "+price);
	   Assert.assertTrue(productListingPage.verify_Product_Price().contains("$16.40"));
	 }
	
	@Then("^user click on the item$")
	public void user_click_on_the_item() throws Throwable {
		ProductListingPage productListingPage= PageFactory.initElements(driver, ProductListingPage.class);
		productListingPage.click_ProductQuickview_Item();
	  }


}
