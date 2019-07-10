package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class BaiduSettingLocators {

	// 设置元素
	@FindBy(how=How.LINK_TEXT, using="设置")
	public WebElement setting;
	
	// 搜索设置元素
	@FindBy(css=".setpref")
	public WebElement searchSetting;
	
	// 保存设置元素
	@FindBy(css=".prefpanelgo")
	public WebElement saveSetting;
}
