package runner;

import java.io.File;

import org.junit.runner.RunWith;
import org.testng.annotations.BeforeClass;

import com.cucumber.listener.ExtentCucumberFormatter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src\\test\\resources\\features"},
				glue= {"steps"},
				tags= {"@setting, @searching"},
				monochrome=true,
				plugin= {"json:cucumberReport/report/cucumber.json",
						"pretty",
						"html:cucumberReport/report",
						"com.cucumber.listener.ExtentCucumberFormatter"})
public class RunCuke extends AbstractTestNGCucumberTests{
	// 生成extent报告

	@BeforeClass
	public static void setUp() {
		ExtentCucumberFormatter.initiateExtentCucumberFormatter(new File(System.getProperty("user.dir") + 
				"\\cucumberReport\\report\\cucumberExtent.html"), true);
		ExtentCucumberFormatter.loadConfig(new File(System.getProperty("user.dir") + 
				"\\src\\test\\resources\\extent-config.xml"));
	}
}












