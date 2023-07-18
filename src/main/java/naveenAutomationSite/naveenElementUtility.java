package naveenAutomationSite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class naveenElementUtility {

	private WebDriver driver;

	public naveenElementUtility(WebDriver driver) {
		this.driver = driver;
	}

	public void doSendKey(By locator, String value) {

		getElement(locator).sendKeys(value);

	}

	public WebElement getText(By locator) {

		return driver.findElement(locator);

	}

	public WebElement getElement(By locator) {
		return driver.findElement(locator);

	}

	public void getClicked(By locator) {
		driver.findElement(locator).click();

	}

}
