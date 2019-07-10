package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import base.SeleniumDriver;
import cucumber.api.Scenario;
import cucumber.api.java.After;

public class AfterActions {

	@After
	public void tearDown(Scenario scenario) throws InterruptedException {
		TimeUnit.SECONDS.sleep(1);
		if (scenario.isFailed()) {
			byte[] screenshot = ((TakesScreenshot)SeleniumDriver.getDriver()).getScreenshotAs(OutputType.BYTES);
			scenario.embed(screenshot, "image/png");
		}
		
		SeleniumDriver.quitBrowser();
	}
}
