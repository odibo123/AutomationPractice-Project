package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import base.TestBase;

public class ContactUsPage extends TestBase {
	//  All Objects found are declared 
	
	@FindBy(how=How.ID,using = "id_contact")
	WebElement SubjectHeadingDropdown;
	
	@FindBy(how=How.ID,using = "email")
	WebElement EmailAddressTxtField;
	
	@FindBy(how=How.NAME,using = "id_order")
	WebElement Order_Reference_Txt_Field;
	
	@FindBy(how=How.ID,using = "fileUpload")
	WebElement ChooseFileBtn;
	
	@FindBy(how=How.ID,using = "message")
	WebElement  MessageTextBox;

	@FindBy(how=How.CSS,using = "#submitMessage > span")
	WebElement SendBtn;
	
	@FindBy(how=How.CSS,using = "#center_column > p")
	WebElement MessageReceivedTxt;
	
	
	//methods or action
	
	public String validate_Contactus_Title(){
		return	driver.getTitle();	
			}
	
	public void I_Select_Customer_Service_From_SubjectHeadingDropdown(){
		Select dropdown= new Select(SubjectHeadingDropdown);
		dropdown.selectByIndex(1);
		
	}
//create a random email
	public void type_my_email(){
		     random = 100 + (int) (Math.random() * ((1000 - 1) + 1));
			 EmailAddressTxtField.sendKeys("mike" + random + "@gmail.com");
	}
	public void I_enter_quanitity_on_order_reference(String orderReference){
		Order_Reference_Txt_Field.sendKeys(orderReference);
	}
	
	public void I_choose_my_file_path(){
		ChooseFileBtn.sendKeys("C:\\Users\\User\\Desktop\\page obj select.txt");
	}
	
	public void I_type_message_I_Want_To_send(String message){
		MessageTextBox.sendKeys(message);
	}
	
	public void I_click_Send_Button(){
		SendBtn.click();
	}
	
	public String verify_message_from_team(){
		return MessageReceivedTxt.getText();
	}
	
}
