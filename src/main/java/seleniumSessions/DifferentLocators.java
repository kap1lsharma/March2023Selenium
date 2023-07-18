package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DifferentLocators {

	static WebDriver driver;

	public static void main(String[] args) throws Exception {

		driver = new ChromeDriver();

		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

//		//ID : Always unique
//		driver.findElement(By.id("input-firstname")).sendKeys("Kap");
//		
		// Name :Can be a duplicate name 99% are unique
//		driver.findElement(By.name("firstname")).sendKeys("Kapil");

		// Class : Can be duplicate and most of the time duplicate
//		driver.findElement(By.className("form-control")).sendKeys("test@123");

		// Xpath is not an attribute, Its a xml path in the DOM Extensible mark up
		// language

//		By f_nm = By.xpath("//*[@id=\"input-firstname\"]");
//		By l_nm = By.xpath("//*[@id=\"input-lastname\"]");
//		By E_mail = By.xpath("//*[@id=\"input-email\"]");
//		By phone = By.xpath("//*[@id=\"input-telephone\"]");
//		By pswrd = By.xpath("//*[@id=\"input-password\"]");
//		By C_pswrd = By.xpath("//*[@id=\"input-confirm\"]");
//		By p_policy = By.xpath("//*[@id=\"content\"]/form/div/div/input[1]");
//		By btn_cntn = By.xpath("	 //*[@id=\"content\"]/form/div/div/input[2]");
//
//		doSendKeys(f_nm, "Kap");
//		doSendKeys(l_nm, "Dude");
//		doSendKeys(E_mail, "kap@123.com");
//		doSendKeys(phone, "9999999999");
//		doSendKeys(pswrd, "kap@123");
//		doSendKeys(C_pswrd, "kap@123");
//		doClick(p_policy);
//		doClick(btn_cntn);

//		5. CSS Selector : Not an attributes Based on css property

//		driver.findElement(By.cssSelector("#input-firstname")).sendKeys("Kapil");
//		driver.findElement(By.cssSelector("#input-lastname")).sendKeys("Kapil");
//		driver.findElement(By.cssSelector("#content > form > div > div > input[type=checkbox]:nth-child(2)")).click();
//		driver.findElement(By.cssSelector("#content > form > div > div > input.btn.btn-primary")).click();

//		6. Linktext  applicable only for links   /can be duplicate 	
//		<a>  tag should be there attributes are in key and value pair
//		driver.findElement(By.linkText("Brands")).click();

//		By DeliveryInfo = By.linkText("Delivery Information");
//		doClick(DeliveryInfo);

//		7. Partial Link text
//		driver.findElement(By.partialLinkText("Forgotten")).click();

//		8.Tag name
//		driver.findElement(By.tagName("input")).click();
		System.out.println(driver.findElement(By.tagName("h1")).getText());

		Thread.sleep(4000);
		driver.quit();

	}

	public static WebElement getElement(By locator) {

		return driver.findElement(locator);
	}

	public static void doSendKeys(By locator, String value) {

		getElement(locator).sendKeys(value);
	}

	public static void doClick(By locator) {

		getElement(locator).click();
	}

}
