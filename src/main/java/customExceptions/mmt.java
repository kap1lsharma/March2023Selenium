package customExceptions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class mmt {

	public static void main(String[] args) throws InterruptedException {

		// Dinamic@21!

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");

		// click on login
		driver.findElement(By.xpath("//*[@data-cy='LoginHeaderText']")).click();

		// enter the email
		driver.findElement(By.xpath("//*[@id='username']")).sendKeys("vatschetanya@gmail.com");

		// click on continue
		driver.findElement(By.xpath("//span[text()='Continue']")).click();

		// put password
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("Dinamic@21!");

		// click on login
		driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();

		Select sel = new Select(driver.findElement(By.xpath("//*[@id='fromCity']")));
		sel.selectByValue("Delhi");
		
		Select sel2 = new Select(driver.findElement(By.xpath("//*[@id='toCity']")));
		sel.selectByValue("Bangaluru");
		
		
		

	}

}
