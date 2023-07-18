package selfSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class amzonsLinks {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/");
		
		By search = By.xpath("//*[@id='search']/input");
		

		driver.manage().window().maximize();
		Actions act = new Actions(driver);
		act.sendKeys(Keys.COMMAND).sendKeys(Keys.END);

	     ElementUtil utilAmazon = new ElementUtil(driver);
	     utilAmazon.doSendKeys(search, "Iphone");

		
		
	}

}
