package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXpath {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login/beta");

//		//htmltag[attr='value']

		// input[name='username']

		// input -14
		// input[@id]--6
		// input[@id='input-firstname'] --1

		// htmltag[@attr1='' and @attr2 = '' and @attr3 ='']

		// input[@class and @placeholder @name]
		// input[@class='form-control private-form_control login-email']

//		By e1 = By.xpath("//input[@class='form-control private-form__control login-email']"); // valid
//		By e2 = By.className("login-email"); // valid
//		By e3 = By.className("form-control private-form__control login-email"); 
		// not valid //multiple classes
		// org.openqa.selenium.InvalidSelectorException: Compound class names not
		// permitted

//		driver.findElement(e3).sendKeys("kapil");

		// input[contains(@attr1,'value')]
		// input[contains(@id,'username')]
		// input[contains(@data-test-id, 'email-input-field')]
		// input[contains(@class, 'login-email')]

		// long value
		// dynamic attributes/ids
//		<input id= "test_123">
//		<input id= "test_456">
//		<input id= "test_789">
		// input[contains(id,'test_')]

//		By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']"); // valid
//		By.className("oxd-button"); // valid
//		By.className("oxd-button oxd-button--medium oxd-button--main orangehrm-login-button"); // not valid multiple
		// classes not allowed
//    ---------Contains----------Used in long values, dynamic ID, 
//		contains[@attribute,'value']
		// div[contains(@class,"optanon-alert-box-wrapper")]
		// div[contains(@id,"optanon-branding1")]

//		contains with one more attribute
		// HTML tag[contains(@attribute,'value') and @attribute='value']
		//iframe[contains(@id,'65979464') and @aria-hidden='true'] Sequence doesnt matter here
		//iframe[contains(@id,'65979464') and @aria-hidden='true' and @title]
		
		
//		text() in xpath------------------
//		html tag[text()='value']
		//a[text()='Skip to main content']
		//htmltag[contains(text(),'value')]
		//a[contains(text(), 'Amazon Pay on Merchants')]
		
		//text with the attribute
		
		//htmltag[text()='value' and @attribute='value']
		//div[contains(text(), 'Sorry, no results found!') and @class='_3uTeW4']
		//div[text()='Sorry, no results found!' and @class='_3uTeW4']
		
		
//		text() with contains and Atrribute with contains and attribute without contains
//htmltag[contains(text(),'value') and contains(@attribute,'value'  and @attribute2='value')]
//1a[contains(text(), 'Laptops') and contains(@class,'dropdown') and @href='https://naveenautomationlabs.com/opencart/index.php?route=product/category&path=18']
//a[contains(text(), 'Laptops') and contains(@href, 'https://naveenautomationlabs.com') and @class='dropdown-toggle']
		
//		xpath by Position or Index
//		(//input[@class='form-control'])[last()]
//				(//input[@class='form-control'])[last()-(last()-1)]
//						(//input[@class='form-control'])[last()-2]
		
		
//(//div[@class='navFooterLinkCol navAccessibility'])[last()]//li[last()]  help in amazone
//(  direct association  / single slash then htmltag Indirect association//double slash with html tag)
// ((//div[@class='navFooterLinkCol navAccessibility'])[last()-(last()-1)]//a)[last()]  Amazon science
		
//		Parent to Child
		//parent/child  : Direct Child 
		//Parent//child : Indirect+Direct 
		
		//form //input[@id='chkMain'] rare case but if multiple Ids are there then can use it.
		
//		Child to parent or backword traversing
		//*[@id='username']/../../..  or (//*[@id='username']//parent::div//parent::div)
		//*[@id='username']//ancestor::div//parent::body
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
