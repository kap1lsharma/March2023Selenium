package naveenAutomationSite;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import seleniumSessions.ElemetUtil;

public class NaveenTestClass {

	public static void main(String[] args) throws IOException {

		// Using this for launching the browser only
		naveenBrowserUtility nbu = new naveenBrowserUtility();
		WebDriver driver = nbu.launchBrowser("chrome");
		nbu.enterUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

		System.out.println(nbu.getPageTitle());
		// after launching the browser enter the fields

		//The driver here is going into constructor of this class so that we will not have to reuse the 
		//object creation of Chrome driver class
		naveenElementUtility neu = new naveenElementUtility(driver); 

		By Fname = By.id("input-firstname");
		By Lname = By.id("input-lastname");
		By Email = By.id("input-email");
		By Telephone = By.id("input-telephone");
		By Psswrd = By.id("input-password");
		By ConfirmPswrd = By.id("input-confirm");
		By CBPrivacy = By.xpath("//*[@id=\"content\"]/form/div/div/input[1]");
		By BtnContinue = By.cssSelector("#content>form>div>div>input.btn.btn-primary");
//		By BtnPriPolLink = By.linkText("Privacy Policy");

		neu.doSendKey(Fname, "Kapil");
		neu.doSendKey(Lname, "Sharma");
		neu.doSendKey(Email, "kapsharddmsdsdbdfga@gmail.com");
		neu.doSendKey(Telephone, "9999999999");
		neu.doSendKey(Psswrd, "kap@2020");
		neu.doSendKey(ConfirmPswrd, "kap@2020");
		neu.getClicked(CBPrivacy);
//		neu.getClicked(BtnPriPolLink);
		neu.getClicked(BtnContinue);
		String Message = driver.findElement(By.cssSelector("#content>h1")).getText();
		System.out.println(Message);

		if (Message.contentEquals("Your Account Has Been Created!")) {

			System.out.println("Account has been created sucessfully");

		}
		

	}
}
