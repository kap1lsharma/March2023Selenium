package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewWindowHandle {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");// w1

		String parentwindowID = driver.getWindowHandle();

		// after selenium 4.X
		driver.switchTo().newWindow(WindowType.TAB);

		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());

		driver.close();

		driver.switchTo().window(parentwindowID);

		System.out.println(driver.getTitle());

		// cross origin policy/resource sharing -- different domain
		// same origin policy -- operning links in same domains

		// chatty things - slow like cypress

	}

}
