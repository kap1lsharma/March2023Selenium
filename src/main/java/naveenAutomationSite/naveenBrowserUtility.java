package naveenAutomationSite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import customExceptions.FrameworkException;

public class naveenBrowserUtility {

	private WebDriver driver;

	public WebDriver launchBrowser(String browserName) {

		if (browserName == null) {

			System.out.println("Browser Cant be null");
			throw new FrameworkException("Browsercantbenull");
		}

		System.out.println("Browser Name is: " + browserName);

		switch (browserName.toLowerCase().trim()) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;
		case "safari":
			driver = new SafariDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		default:
			System.out.println("Please pass the right browser..." + browserName);
			throw new FrameworkException("Not Valid Browser");
		}

		return driver;

	}

	public void enterUrl(String url) {

		if (url.contains("http")) {
			driver.get(url);
		} else
			throw new FrameworkException("url should have the http(s) protocol");

	}

	public String getPageTitle() {
		return driver.getTitle();
	}

	public String getPageUrl() {
		return driver.getCurrentUrl();
	}

	public void quitBrowser() {
		driver.quit();
	}

	public void closeBrowser() {
		driver.close();
	}


}
