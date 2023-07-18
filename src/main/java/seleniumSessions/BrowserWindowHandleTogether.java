package seleniumSessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowHandleTogether {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");// w1

		Thread.sleep(2000);

		String parentWindowID = driver.getWindowHandle();

		// target=_blank
		WebElement twitter = driver.findElement(By.xpath("//a[contains(@href,'twitter')]"));// w2
		WebElement FB = driver.findElement(By.xpath("//a[contains(@href,'facebook')]"));// w2
		WebElement YT = driver.findElement(By.xpath("//a[contains(@href,'youtube')]"));// w2
		WebElement LinkedIn = driver.findElement(By.xpath("//a[contains(@href,'linkedin')]"));// w2

		twitter.click();
		FB.click();
		YT.click();
		LinkedIn.click();

		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();

		while (it.hasNext()) {

			String windowID = it.next();
			driver.switchTo().window(windowID);
			System.out.println(driver.getCurrentUrl());
			Thread.sleep(5000);

			//this will not close the parent window
			if (!windowID.equals(parentWindowID)) {
				driver.close();

			}

		}
		
		driver.switchTo().window(parentWindowID);
		System.out.println("Parent Window URL:"+driver.getCurrentUrl());

	}

}
