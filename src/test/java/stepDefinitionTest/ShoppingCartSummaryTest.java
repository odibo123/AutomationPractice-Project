package stepDefinitionTest;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;
import cucumber.api.java.en.Then;
import junit.framework.Assert;
import pages.ShoppingCartSummaryPage;

public class ShoppingCartSummaryTest extends TestBase {
	ShoppingCartSummaryPage shoppingCartSummaryPage = new ShoppingCartSummaryPage();
	

	
	@Then("^user clicks on the negative button under the quantity section$")
	public void user_clicks_on_the_negative_button_under_the_quantity_section() throws Throwable {
		JavascriptExecutor javascript = (JavascriptExecutor) driver;
		 javascript.executeScript("window.scrollBy(0,250)", "");
		 ShoppingCartSummaryPage shoppingCartSummaryPage = PageFactory.initElements(driver,ShoppingCartSummaryPage.class);
		 shoppingCartSummaryPage.click_QtyNegativeBtn();
	 
	}

@Then("^user confirms seeing shopping cart summary$")
public void user_confirms_seeing_shopping_cart_summary() throws Throwable {
	ShoppingCartSummaryPage shoppingCartSummaryPage= PageFactory.initElements(driver, ShoppingCartSummaryPage.class); 
	String summaryPage=shoppingCartSummaryPage.verifyShoppingCartSummary();
	System.out.println("The summary text displayed on shopping cart is "+summaryPage);
	
}

@Then("^user verify a message displaying shopping cart is empty$")
public void user_verify_a_message_displaying_shopping_cart_is_empty() throws Throwable {	
	ShoppingCartSummaryPage shoppingCartSummaryPage= PageFactory.initElements(driver, ShoppingCartSummaryPage.class);
    String message=	shoppingCartSummaryPage.verifyOrderCartConfirmationMessageTxt();
    System.out.println("The title of the message is "+ message);
    Assert.assertTrue(shoppingCartSummaryPage.verifyOrderCartConfirmationMessageTxt().contains("Your shopping cart is empty."));
}

}
