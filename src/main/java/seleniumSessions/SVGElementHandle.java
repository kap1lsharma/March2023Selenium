package seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SVGElementHandle {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://petdiseasealerts.org/forecast-map/");
		Thread.sleep(2000);
		
		driver.switchTo().frame(driver.findElement(By.xpath("iframe[contains(@id, 'map-instance')]")));
		
		
		
		List<WebElement> statesList =driver.findElements(By.xpath(""));

	}

}
