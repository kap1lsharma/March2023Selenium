package naveenAutomationSite;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenshotUtility {

	public static void main(String[] args) throws IOException, InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://smallpdf.com/word-to-pdf");
		driver.manage().window().maximize();

		Thread.sleep(2000);

		System.out.println(driver.getTitle());

		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scroll(0, 8000)");

		// take screenshot and store it as a file format
		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		// 2. Now copy the screenshot to desired location using copy file method;
		Thread.sleep(2000);
		Files.copy(file, new File("C:\\Users\\Kapil Sharma\\Documents\\Custom Office Templates\\demoscreenshot.jpeg"));
		
		
        //to upload the files
		WebElement uploadFIle = driver.findElement(By.xpath("//button[@class=\"l3tlg0-0 ggoliT\"]"));
		uploadFIle.sendKeys("D:\\Aristocrat Data Personal");

	}

}
