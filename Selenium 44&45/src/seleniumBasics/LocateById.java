package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class LocateById {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		EdgeDriver ed=new EdgeDriver();
		ed.manage().window().maximize();
		
		ed.get("https://demowebshop.tricentis.com/login");
		ed.findElement(By.id("Email")).sendKeys("siya21@gmail.com");
		ed.findElement(By.id("Password")).sendKeys("siya123");
		ed.findElement(By.id("RememberMe")).click();
		
		

	}

}
