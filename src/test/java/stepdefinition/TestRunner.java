package stepdefinition;

import java.io.IOException;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import objectrepo.TelecomBase;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"F:\\Selenium-cucumber\\Telecom\\src\\test\\resources\\Feature"},tags= {"@us3"},strict=true,dryRun=false,glue= {"stepdefinition"},monochrome=true,plugin= {"html:target","json:target/cucumberReport.json","rerun:src/test/resources/failedscenarios.txt"})
public class TestRunner extends TelecomBase {
	
//	public static void readData() throws IOException{
//		ReadDataFromExcel("F:\\Selenium-cucumber\\Telecom\\src\\main\\java\\objectrepo\\ReadFromExcel.xlsx", "sheet3");
//	}

}
