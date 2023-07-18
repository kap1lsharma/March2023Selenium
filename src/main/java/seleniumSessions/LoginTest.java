package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginTest {

	public static void main(String[] args) {

		BrowserUtill brwUtil = new BrowserUtill();
		WebDriver driver = brwUtil.launchBrowser("chrome");

		brwUtil.enterUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		System.out.println(brwUtil.getPageTitle());

		ElemetUtil eleutil = new ElemetUtil(driver);
		By email_ID = By.id("input-email");
		By pass_word = By.id("input-password");
		eleutil.doSendKeys(email_ID, "kapilsharma@gmail.com");
		eleutil.doSendKeys(pass_word, "kap@123");
		
		brwUtil.closeBrowser();
		
	}

}
