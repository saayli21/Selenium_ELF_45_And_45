package seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WorkingWithBrowserActions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//LAUNCH CHROME WEBDRIVER
//		ChromeDriver driver=new ChromeDriver();
//		driver.get("https://www.google.co.in");
		
		//UPCASTING IN ORDER TO ACESS WEBDRIVER METHODS
//		WebDriver driver=new ChromeDriver();
//		driver.get("https://www.google.co.in");
		
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.google.co.in");
		
		//VERSION 4
		
	}

}
