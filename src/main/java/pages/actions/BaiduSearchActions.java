package pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import base.SeleniumDriver;
import pages.locators.BaiduSearchLocators;

public class BaiduSearchActions {

	BaiduSearchLocators baiduSearchLocators;
	public BaiduSearchActions() {
		this.baiduSearchLocators = new BaiduSearchLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(SeleniumDriver.getDriver(), 10);
		PageFactory.initElements(factory, this.baiduSearchLocators);
	}
	
	public void clearSearchBox() {
		// 对搜索框执行清空操作
		baiduSearchLocators.searchBox.clear();
	}
	
	public void enterSearchBox(String value) {
		// 向搜索框发送信息
		baiduSearchLocators.searchBox.sendKeys(value);
	}
	
	public void clickSubmitBtn() {
		// 点击搜索按钮
		baiduSearchLocators.submit.click();
	}
}
