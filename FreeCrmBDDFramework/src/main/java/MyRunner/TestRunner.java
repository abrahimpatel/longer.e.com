package MyRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


	@RunWith(Cucumber.class)
	@CucumberOptions(
			features = "D:\\git\\longer.e.com\\longer.e.com\\FreeCrmBDDFramework\\src\\main\\java\\Features\\purchase_pellow.feature", //the path of the feature files
			glue={"D:\\git\\longer.e.com\\longer.e.com\\FreeCrmBDDFramework\\src\\main\\java\\stepDefinitions\\Purches_Pillow.java"}, //the path of the step definition filesjnjnvn
			format= {"pretty","html:test-outout", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"}, //to generate different types of reporting
			monochrome = true, //display the console output in a proper readable format
			strict = false, //it will check if any step is not defined in step definition file
			dryRun = false //to check the mapping is proper between feature file and step def file
			//tags = {"~@SmokeTest" , "~@RegressionTest", "~@End2End"}			
			)
	 
	public class TestRunner {
	 
	}
	
	//ORed : tags = {"@SmokeTest , @RegressionTest"} -- execute all tests tagged as @SmokeTest OR @RegressionTest
	//ANDed : tags = tags = {"@SmokeTest" , "@RegressionTest"} -- execute all tests tagged as @SmofalsekeTest AND @RegressionTest
	

