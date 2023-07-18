package seleniumSessions;

public class AmazonTest {

	public static void main(String[] args) {

		String browserName = "chrome";

		BrowserUtill brUtill = new BrowserUtill();
		brUtill.launchBrowser(browserName);

		brUtill.enterUrl("https://www.amazon.com");
		String actualTitle = brUtill.getPageTitle();
		System.out.println("Page title is : " + actualTitle);
		String actualURL = brUtill.getPageUrl();
		System.out.println("The Actual URL is: " + actualURL);
		
		brUtill.closeBrowser();
		
	

//		brUtill.quitBrowser();

	}

}
