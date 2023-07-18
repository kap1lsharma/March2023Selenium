package seleniumSessions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class JavaScriptExecutorConcept {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		Thread.sleep(2000);
	
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("alert('hi this is kap')");
		
//		String title = js.executeScript("return document.title;").toString();
		
//		System.out.println(title);
		
		
		
	}

}
