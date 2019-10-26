package stepDefinitionTest;

import org.openqa.selenium.support.PageFactory;

import base.TestBase;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pages.ContactUsPage;
import pages.HomePage;

public class ContactUsTest extends TestBase{
	
  //call the objects and the methods  using PagrFactory..First create the objects
	HomePage homePage = new HomePage(); 
	ContactUsPage contactUsPage = new ContactUsPage();
	
	@When("^user click on Contact us link$")
	public void user_click_on_Contact_us_link() throws Throwable {
	HomePage homepage=PageFactory.initElements(driver,HomePage.class);
	homepage.click_Contact_UsLink();
		
	}

	@Then("^user validate Contact us Page$")
	public void user_validate_Contact_us_Page() throws Throwable {
		ContactUsPage contactUsPage= PageFactory.initElements(driver, ContactUsPage.class);
	String contactusTitle=	contactUsPage.validate_Contactus_Title();
	System.out.println( "The title of contact us page is "+contactusTitle);
	Assert.assertEquals("Contact us - My Store",contactusTitle);
	
	}
	
	@Then("^user selects Customer Service from Subject Heading dropdown$")
	public void user_selects_Customer_Service_from_Subject_Heading_dropdown() throws Throwable {
		ContactUsPage contactUsPage= PageFactory.initElements(driver, ContactUsPage.class); 
		contactUsPage.I_Select_Customer_Service_From_SubjectHeadingDropdown();
	}

	@Then("^user enter \"([^\"]*)\" address$")
	public void user_enter_address(String email) throws Throwable {
		ContactUsPage contactUsPage= PageFactory.initElements(driver, ContactUsPage.class); 
		contactUsPage.I_type_my_email_Address(email);
	}

	@Then("^user enter quantity in   \"([^\"]*)\"$")
	public void user_enter_quantity_in(String orderReference) throws Throwable {
		ContactUsPage contactUsPage= PageFactory.initElements(driver, ContactUsPage.class);
		contactUsPage.I_enter_quanitity_on_order_reference(orderReference);
	}


@Then("^user chooses a file$")
public void user_chooses_a_file() throws Throwable {
	ContactUsPage contactUsPage= PageFactory.initElements(driver, ContactUsPage.class);
	contactUsPage.I_choose_my_file_path();
}

@Then("^user types a \"([^\"]*)\" in the message box$")
public void user_types_a_in_the_message_box(String message) throws Throwable {
	ContactUsPage contactUsPage= PageFactory.initElements(driver, ContactUsPage.class);
	contactUsPage.I_type_message_I_Want_To_send(message);
}

@Then("^user click the send button$")
public void user_click_the_send_button() throws Throwable {
	ContactUsPage contactUsPage= PageFactory.initElements(driver, ContactUsPage.class); 
	contactUsPage.I_click_Send_Button();
}

@Then("^user confirm message was sent$")
public void user_confirm_message_was_sent() throws Throwable {
	ContactUsPage contactUsPage= PageFactory.initElements(driver, ContactUsPage.class);
String messageConfirmed	=contactUsPage.verify_message_from_team();
System.out.println(messageConfirmed);
Assert.assertEquals("Your message has been successfully sent to our team.", messageConfirmed);
}
@Then("^user closes the browser$")
public void user_closes_the_browser() throws Throwable {
    driver.close();
}

}
