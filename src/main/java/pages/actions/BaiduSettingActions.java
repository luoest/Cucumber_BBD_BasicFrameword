package pages.actions;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import base.SeleniumDriver;
import pages.locators.BaiduSettingLocators;

public class BaiduSettingActions {
	BaiduSettingLocators baiduSettingLocators = new BaiduSettingLocators();
	public BaiduSettingActions() {
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(SeleniumDriver.getDriver(), 10);
		PageFactory.initElements(factory, this.baiduSettingLocators);
	}
	
	public void actionOnSet() {
		// 弹出设置下拉框
		Actions actions = new Actions(SeleniumDriver.getDriver());
		actions.moveToElement(baiduSettingLocators.setting).perform();
	}
	public void clickSearchSetting() {
		// 点选搜索设置
		baiduSettingLocators.searchSetting.click();
	}
	public void clickSaveSetting() {
		// 点选保存设置
		baiduSettingLocators.saveSetting.click();
	}
	

}
