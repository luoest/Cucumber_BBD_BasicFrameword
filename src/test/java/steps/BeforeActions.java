package steps;

import base.SeleniumDriver;
import cucumber.api.java.Before;

public class BeforeActions {

	@Before
	public void setUp() {
		// 初始及实例化浏览器
		SeleniumDriver.setUpDriver();
	}
}

