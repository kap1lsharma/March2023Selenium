package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ElemetUtil {
	private WebDriver driver;

	// example of Encapsulation Accessing private objects with public constructor
	ElemetUtil(WebDriver driver) {
		this.driver = driver;

	}

	public void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);

	}

	public WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	

	public void doClick(By locator) {

		getElement(locator).click();
	}


//**************************Drop Down Utils**********************

	public void doSelectDropDownByIndex(By locator, int index) {

		if (index < 0) {

			System.out.println("please write the positive index");
			return;
		}
		Select select = new Select(getElement(locator));
		select.selectByIndex(index);
	}

	public void doSelectDropDownByVisibletext(By locator, String visibleText) {

		if (visibleText == null) {

			System.out.println("please give the valid text name or Null values arent allowed");
			return;
		}
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(visibleText);
	}

	public void doSelectDropDownByValue(By locator, String Value) {

		if (Value == null) {

			System.out.println("please give the valid text name or Null values arent allowed");
			return;
		}
		Select select = new Select(getElement(locator));
		select.selectByValue(Value);
	}

}
