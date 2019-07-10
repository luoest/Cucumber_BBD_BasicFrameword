package steps;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Alert;
import org.testng.Assert;
import base.SeleniumDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.actions.BaiduSettingActions;

public class BaiduSettingSteps {
	// 执行百度设置的步骤
	BaiduSettingActions baiduSettingActions = new BaiduSettingActions();

	@Given("^navigate to baidu \"([^\"]*)\" homePage$")
	public void navigate_to_baidu_homePage(String homePage) throws Throwable {
	    SeleniumDriver.getUrl(homePage);
	    TimeUnit.SECONDS.sleep(1);
	}

	@When("^action on setting$")
	public void action_on_setting() throws Throwable {
	    baiduSettingActions.actionOnSet();
	}

	@Then("^click on searchSetting$")
	public void click_on_searchSetting() throws Throwable {
	    baiduSettingActions.clickSearchSetting();
	}

	@Then("^click on saveSetting$")
	public void click_on_saveSetting() throws Throwable {
		TimeUnit.SECONDS.sleep(1);
	    baiduSettingActions.clickSaveSetting();
	}

	@Then("^alert should have \"([^\"]*)\" expectedAlertText$")
	public void alert_should_have_alertText(String expectedAlertText) throws Throwable {
	    String actual = SeleniumDriver.alert().getText();
	    System.out.println("actual <--> expectedAlertText:::" + actual + expectedAlertText);
	    try {
	    	Assert.assertEquals(expectedAlertText, actual);
		} catch (AssertionError e) {
			// TODO: handle exception
		}
	    
	}

	@Then("^choose to accept alert$")
	public void choose_to_accept_alert() throws Throwable {
	    Alert alert = SeleniumDriver.alert();
	    alert.accept();
	}
}
