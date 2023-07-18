package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class HeadLessConcept {

	public static void main(String[] args) {

		// headless:No Browser
		// invisible browser//without
		// testing is happening behind the scene
		// faster than the normal mode'
		// When to use?Linux os, jenkins, docker, Non UI
		// might not work for complex html sites, navigation, responsive
		// testing(Different sizes)
//
//		ChromeOptions co = new ChromeOptions();
//		co.addArguments("--headless=new--");

		EdgeOptions eo = new EdgeOptions();
		eo.addArguments("--headless=new--");

//		The method setHeadless(boolean) in the type ChromiumOptions<ChromeOptions> is not applicable for the arguments ()
		WebDriver driver = new EdgeDriver(eo);
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.quit();
		
		
		//there is no headless mode in safari

	}

}
