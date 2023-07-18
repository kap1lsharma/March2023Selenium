package seleniumSessions;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class googleLanguageLinks {

	static WebDriver  driver;
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		
		driver.get("http:/www.google.com");
		
		

	}

}
