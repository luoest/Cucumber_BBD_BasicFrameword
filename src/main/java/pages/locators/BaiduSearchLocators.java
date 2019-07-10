package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BaiduSearchLocators {

	// 搜索框元素
	@FindBy(css="#kw")
	public WebElement searchBox;
	
	// 提交搜索元素
	@FindBy(css="#su")
	public WebElement submit;
}
