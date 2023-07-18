package seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownWithOptions {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/book-a-free-demo/");
		Thread.sleep(4000);

		By country = By.id("Form_getForm_Country");

		Select select = new Select(driver.findElement(country));
		List<WebElement> Options = select.getOptions();

		System.out.println(Options.size());

		for (WebElement e : Options) {
			String txt = e.getText();
			System.out.println(txt);

		}

	}

}
