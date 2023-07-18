package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class footerColumnCheck {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("http://www.amazon.com");

		Thread.sleep(5000);
		System.out.println(getFooterHeaderText("Blog"));
		System.out.println(getFooterHeaderText("Investor Relations"));
		System.out.println(getFooterHeaderText("About Amazon"));
		System.out.println(getFooterHeaderText("Amazon Devices"));
		System.out.println(getFooterHeaderText("Careers"));
		System.out.println(getFooterHeaderText("Amazon Science"));


	}

	public static String getFooterHeaderText(String footerText) {

		String footerheader = driver.findElement(By.xpath(
				"//a[text()='"+footerText+"']/ancestor::div[@class='navFooterLinkCol navAccessibility']/div"))
				.getText();

		return footerheader;
	}

}
