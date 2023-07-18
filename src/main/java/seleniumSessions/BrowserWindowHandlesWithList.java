package seleniumSessions;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowHandlesWithList {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");// w1

		Thread.sleep(2000);

		// target=_blank
		driver.findElement(By.xpath("//a[contains(@href,'twitter')]")).click();// w2

		// Fetching windows IDs
		Set<String> handles = driver.getWindowHandles();

		// set to list for the order or index purpose
		List<String> handlesList = new ArrayList<String>(handles);
		String ParentWindowID = handlesList.get(0);
		System.out.println("Parent window ID : " + ParentWindowID);

		driver.close();
		
		String childWindowID = handlesList.get(1);
		System.out.println("Child window ID : " + childWindowID);

	}

}
