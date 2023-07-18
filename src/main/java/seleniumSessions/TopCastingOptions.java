package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TopCastingOptions {

	public static void main(String[] args) {

//		1 Valid but not recommended 
//		SearchContext sc = new  ChromeDriver();  unable to get all methods of WebDriver

//		2 Valid & Recommended -- Local Execution 
		WebDriver driver = new ChromeDriver();

//		3 Valid & Recommended
//		RemoteWebDriver driver = new ChromeDriver();

//		4 Valid for chrome/ edge 
//		ChromiumDriver driver = new ChromeDriver();

//		5. Valid & Recommended -- USed for remote execution/sel grid/cloud - aws /browser stack /LT
//		WebDriver driver = new RemoteWebDriver(remoteAddress, capabilities );

//		6. 

//		SearchContext sc = new RemoteWebDriver(remoteAddress, capabilities );

		// Valid only for edge browser
//		EdgeDriver driver = new EdgeDriver();

	}

}
