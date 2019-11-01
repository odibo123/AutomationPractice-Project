package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(  
		features = {"src/test/resourceS"},        //Path of my feature file
		format = {"pretty" ,"json:target/cucumber.json"},    //format for the test
		strict = false,          //check if the steps are in my step definition file
        monochrome = true,       //display the console in a proper readable format
        glue = {"stepDefinitionTest"}       //path of my step definition ..where test code is
		         )
public class RunnerTest {

}
