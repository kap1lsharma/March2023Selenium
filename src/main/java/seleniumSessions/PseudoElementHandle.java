package seleniumSessions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PseudoElementHandle {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		Thread.sleep(2000);

		// ::before/::after

		// js:
		String script = "return window.getComputedStyle(document.querySelector(\"label[for='input-telephone']\"), '::before').getPropertyValue('content')";

		JavascriptExecutor js = (JavascriptExecutor) driver;
		String mand_text = js.executeScript(script).toString();

		System.out.println(mand_text);

		if(mand_text.contains("*")) {
			System.out.println("Ele is mendatory");
		}
		
		
	}

}
