package selfSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class insightQuantitySelector {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.insight.com/en_US/home.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@placeholder, 'Search for products')]")).sendKeys("monitors");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"app-header\"]/div/header/div[3]/div[3]/div/form/div/div[2]/button"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"onetrust-close-btn-container\"]/button")).click();
		Thread.sleep(2000);

		String textno = driver.findElement(By.xpath(
				"//span[text()='Dell P2422H - LED monitor - Full HD (1080p) - 24\"']//ancestor::section//following-sibling::section//input[@id='quantity']"))
				.getText();
		System.out.println(textno);
		Thread.sleep(4000);
//		driver.quit();

	}

}
