package seleniumSessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowHandling {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");// w1

		Thread.sleep(2000);
		
		//target=_blank
		driver.findElement(By.xpath("//a[contains(@href,'twitter')]")).click();// w2

		
		//Fetching windows IDs
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();

		String parentWindowID = it.next();
		System.out.println("Parent Window ID: " + parentWindowID);

		String childWindowID = it.next();
		System.out.println("Child Window ID: " + childWindowID);
		
		//2:switch work
		driver.switchTo().window(childWindowID);
		System.out.println("Child Window URL: " +driver.getCurrentUrl());
		
		
		//close the child window
		driver.close();
		
		//comeback to the parent window
		driver.switchTo().window(parentWindowID);
		System.out.println("Parent Window URL: " +driver.getCurrentUrl());
		
		driver.quit();

		

	}

}
