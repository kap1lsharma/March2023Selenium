package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropHandle {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/book-a-free-demo/");

		By country = By.id("Form_getForm_Country");
//		WebElement country_ele = driver.findElement(country);

//		Select sel = new Select(country_ele);
//		sel.selectByIndex(5);  for months, days etc 
//		sel.selectByVisibleText("India");

//		sel.selectByValue("Austria");  value = "Value"

		doSelectDropDownByVisibletext(country, "India");

	}

	public static WebElement getElement(By locator) {

		return driver.findElement(locator);
	}

	public static void doSelectDropDownByIndex(By locator, int index) {

		if (index < 0) {

			System.out.println("please write the positive index");
			return;
		}
		Select select = new Select(getElement(locator));
		select.selectByIndex(index);
	}

	public static void doSelectDropDownByVisibletext(By locator, String visibleText) {

		if (visibleText == null) {

			System.out.println("please give the valid text name or Null values arent allowed");
			return;
		}
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(visibleText);
	}

	public static void doSelectDropDownByValue(By locator, String Value) {

		if (Value == null) {

			System.out.println("please give the valid text name or Null values arent allowed");
			return;
		}
		Select select = new Select(getElement(locator));
		select.selectByValue(Value);
	}

}
