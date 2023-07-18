package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AmzoneAllSearch {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.amazon.in/");
		
		WebElement all = driver.findElement(By.id("searchDropdownBox"));
		
		Select select = new Select(all);
		select.selectByVisibleText("Amazon Fresh");
		
		
		
		
		
		
		
	}

}
