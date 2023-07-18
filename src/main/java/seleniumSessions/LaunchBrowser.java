package seleniumSessions;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {

		// Open The Browser

		ChromeDriver driver = new ChromeDriver(); // ChromiunDriver >> R emoteWebDriver>>WebDriver
													// Interface>>SearchContextDriver

//				EdgeDriver driver = new EdgeDriver();

		// Enter the url 
		driver.get("http://www.google.com");

		// Fetch the title
		String actTitle = driver.getTitle();

		System.out.println("Actual Title is:" + actTitle);

		// verify the title Actual vs Expected steps
		if (actTitle.equals("Google")) {

			System.out.println("Correct Title");

		} else
			System.out.println("Incorrect Title");

		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getPageSource());

		// Automation Testing ---->>>>>>Automation Steps + Checkpoints (Verification
		// Actual vs Expected Result)

//		driver.quit();
		driver.close();

	}

}
