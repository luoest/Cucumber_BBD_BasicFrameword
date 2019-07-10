package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumDriver {

	private static SeleniumDriver seleniumDriver;
	private static WebDriver driver;
	private static WebDriverWait waitDriver;
	public static int TIMEOUT = 5;
	public static int PAGE_LOAD_TIMEOUT = 30;
	
	private SeleniumDriver() {
		// 初始化driver
		System.setProperty("webdriver.chrome.driver", 
				System.getProperty("user.dir")+"\\src\\test\\resources\\executables\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
	}
	public static WebDriver getDriver() {
		return driver;
	}
	public static void setUpDriver() {
		if (seleniumDriver == null) {
			seleniumDriver = new SeleniumDriver();
		}
	}
	public static void getUrl(String url) {
		driver.get(url);
	}
	public static Alert alert() {
		// 获取并返回弹窗对象
		ExpectedConditions.alertIsPresent();
	    Alert alert = SeleniumDriver.getDriver().switchTo().alert();
		return alert;
	}
	public static void quitBrowser() {
		if (driver != null) {
			driver.close();
			driver.quit();
		}
		seleniumDriver = null;
	}
}
