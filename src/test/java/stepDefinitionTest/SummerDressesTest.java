package stepDefinitionTest;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pages.HomePage;

public class SummerDressesTest extends TestBase {
	 HomePage  homePage= new  HomePage();



@Given("^user mouses hover women  and clicks on summer dress$")
public void user_mouses_hover_women_and_clicks_on_summer_dress() throws Throwable {
	Thread.sleep(5000);
	HomePage  homePage = PageFactory.initElements(driver, HomePage .class);
	 homePage.click_SummerDressLabel();
	
}


@Given("^user changes the price range from \\$(\\d+) to \\$(\\d+)$")
public void user_changes_the_price_range_from_$_to_$(int arg1, int arg2) throws Throwable {
	Thread.sleep(5000);
	JavascriptExecutor jse = (JavascriptExecutor) driver;
	 jse.executeScript("window.scrollBy(0,750)", "");
	HomePage  homePage = PageFactory.initElements(driver, HomePage .class);
	Thread.sleep(5000);
	//homePage.change_price_range();
	homePage.change_further_price_range();
}
@Then("^user verify search results are updated$")
public void user_verify_search_results_are_updated() throws Throwable {
   

    File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
    FileUtils.copyFile(src, new File("C:\\eclipse\\Illumination\\AutomationPractice.com\\ScreenShots\\Searchresultsloading.jpeg"));
    System.out.println("Bug Found - Search Results still loading");
}



}