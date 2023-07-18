package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsConcepts {
	static WebDriver driver;// no need to create the class now

	public static void main(String[] args) {

		// create a Web Element + Perform action (click, sendkey, getText, isDisplayed)

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		// 1.
//		driver.findElement(By.id("input-email")).sendKeys("naveen@gmail.com");
//		driver.findElement(By.id("input-password")).sendKeys("naveen@gmail.com");

		// 2.This approach will save our time and give us usability
//		WebElement emailID = driver.findElement(By.id("input-email"));
//		WebElement password = driver.findElement(By.id("input-password"));
//		emailID.sendKeys("naveen@gmail.com");
//		password.sendKeys("naveen@gmail.com");

		// 3 By Locator
//		By email_ID = By.id("input-email");
//		By pass_word = By.id("input-password");
//
//		WebElement emailID = driver.findElement(email_ID);
//		WebElement password = driver.findElement(pass_word);//
//		emailID.sendKeys("naveen@gmail.com");
//		password.sendKeys("naveen@gmail.com");

		// 4 By Locator with web element generic method;
//
//		By email_ID = By.id("input-email");//
//		By pass_word = By.id("input-password");//
//		getElement(email_ID).sendKeys("naveen@gmail.com");
//		getElement(pass_word).sendKeys("naveen@gmail.com");

		// 5 By Locators with web element and action generic method
//		By email_ID = By.id("input-email");
//		By pass_word = By.id("input-password");
//		doSendKeys(email_ID, "naveen@gmail.com");
//		doSendKeys(pass_word, "naveen@gmail.com");

		// 6th Approach (By Locators with web element and action generic method in a
		// Utility Class)
		By email_ID = By.id("input-email");
		By pass_word = By.id("input-password");

		ElemetUtil elu = new ElemetUtil(driver);
		elu.doSendKeys(email_ID, "kapilsharma@gmail.com");
		elu.doSendKeys(pass_word, "kap123");

		// 7By Locators with web element and action generic method in a
		// Utility Class) & Test or called class with browser and element utility

	}

}
