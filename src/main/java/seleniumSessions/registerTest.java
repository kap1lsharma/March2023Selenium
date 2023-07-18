package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class registerTest {

	public static void main(String[] args) {

		BrowserUtill Bu = new BrowserUtill();
		WebDriver driver = Bu.launchBrowser("Chrome");

		Bu.enterUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		System.out.println(Bu.getPageTitle());

		ElemetUtil Eu = new ElemetUtil(driver);
		By Fname = By.id("input-firstname");
		By Lname = By.id("input-lastname");
		By Email = By.id("input-email");
		By Telephone = By.id("input-telephone");
		By Psswrd = By.id("input-password");
		By ConfirmPswrd = By.id("input-confirm");

		Eu.doSendKeys(Fname, "Kapil");
		Eu.doSendKeys(Lname, "Sharma");
		Eu.doSendKeys(Email, "kapilshar@gmail.com");
		Eu.doSendKeys(Telephone, "9999999999");
		Eu.doSendKeys(Psswrd, "kap@2020");
		Eu.doSendKeys(ConfirmPswrd, "kap@2020");
		

	}

}
