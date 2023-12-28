package Enum;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.edge.EdgeDriver;

public class clickUsingSendKeys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
       EdgeDriver ed=new EdgeDriver();
       ed.get("https://www.nykaafashion.com/");
       ed.findElement(By.xpath("//input[contains(@placeholder,'Search for products, styles, brands')]")).sendKeys("b","l","u","s","h",Keys.ENTER);
       
	}

}
