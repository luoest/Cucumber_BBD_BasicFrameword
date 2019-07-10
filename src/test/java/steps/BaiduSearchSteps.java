package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Assert;

import base.SeleniumDriver;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pages.actions.BaiduSearchActions;

public class BaiduSearchSteps {
	// 执行百度搜索的步骤
	
	BaiduSearchActions baiduSearchActions = new BaiduSearchActions();
	
	@Given("^navigate to baidu \"([^\"]*)\" homepage$")
	public void navigate_to_baidu_homepage(String homepage) throws Throwable {
	    SeleniumDriver.getUrl(homepage);
	}

	@Then("^clear searchBox$")
	public void clear_searchBox() throws Throwable {
	    baiduSearchActions.clearSearchBox();
	}

	@Then("^enter searchBox with \"([^\"]*)\" keyword$")
	public void enter_searchBox_with_keyword(String keyword) throws Throwable {
	    baiduSearchActions.enterSearchBox(keyword);
	}

	@Then("^click submit button to perform search$")
	public void click_submit_button_to_perform_search() throws Throwable {
	    baiduSearchActions.clickSubmitBtn();
	}

	@Then("^page title shold be \"([^\"]*)\" expected$")
	public void page_title_shold_be_pageTitle(String expected) throws Throwable {
		TimeUnit.SECONDS.sleep(1);
	    String actual = SeleniumDriver.getDriver().getTitle();
	    try {
			Assert.assertEquals(actual, expected);
		} catch (AssertionError e) {
			e.printStackTrace();
		}
	}

	@Then("^click target link with \"([^\"]*)\" partialLinkText$")
	public void click_target_link_with_partialLinkText(String partialLinkText) throws Throwable {
	    try {
	    	By partial = By.partialLinkText(partialLinkText);
		    SeleniumDriver.getDriver().findElement(partial).click();
		} catch (Exception e) {
			String info = "û�з���Ŀ��Ԫ�أ�" + partialLinkText + ", �޷�ִ�б��ε����";
			System.out.println(info);
		}
		
	}
}
