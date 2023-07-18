package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class flipkartSVGSearchIcon {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		Thread.sleep(2000);
		
		driver.findElement(By.name("q")).sendKeys("macbookpro");
		
		Actions act = new Actions(driver);
//		act.se
		
		////*[local-name()='svg']/*[name()='g' and@fill-rule='evenodd']
	}
}


