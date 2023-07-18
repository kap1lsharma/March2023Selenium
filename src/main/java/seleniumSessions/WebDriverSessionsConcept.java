package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverSessionsConcept {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.google.com");

		
		//Get Title of the page 
		String Title = driver.getTitle();
		System.out.println(Title);

		
		//Get Current URL
		System.out.println(driver.getCurrentUrl());
		
//		driver.quit();
		driver.close();
		
		//NosuchSessionExeption Session ID is null. Using WebDriver after calling quit()?
		System.out.println(driver.getTitle());

	}

}
