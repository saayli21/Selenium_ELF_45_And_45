package Shree;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class Task1DemoWebShopRegister {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		EdgeDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.xpath("//input[@value='Register']")).click();
	Thread.sleep(3000);
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Shreepad");
		driver.findElement(By.id("LastName")).sendKeys("Daundkar");
		driver.findElement(By.id("Email")).sendKeys("Shreepad21@123gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Asdfghjkl@123");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("Asdfghjkl@123");
		driver.findElement(By.id("register-button")).click();
		driver.findElement(By.linkText("Log out")).click();
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("Shreepad21@123gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Asdfghjkl@123");
		driver.findElement(By.id("RememberMe")).click();
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
	}

}
