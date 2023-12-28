package Enum;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class copyPasteUsingSendKeys {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		EdgeDriver ed=new EdgeDriver();
		ed.get("https://demowebshop.tricentis.com/register");
		
		WebElement firstNameTB = ed.findElement(By.id("FirstName"));
		firstNameTB.sendKeys("Shivani");
	//	Thread.sleep(1000);
		firstNameTB.sendKeys(Keys.CONTROL+"a");
	//	Thread.sleep(1000);
		firstNameTB.sendKeys(Keys.CONTROL+"c");
	//	Thread.sleep(1000);
		ed.findElement(By.id("LastName")).sendKeys(Keys.CONTROL+"v");
		
		

	}

}
