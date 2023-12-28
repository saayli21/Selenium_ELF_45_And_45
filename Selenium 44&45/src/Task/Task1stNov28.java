package Task;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class Task1stNov28 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		EdgeDriver ed=new EdgeDriver();
		ed.manage().window().maximize();
		
		ed.get("https://www.shoppersstack.com/");
//		Thread.sleep(6000);
		ed.findElement(By.id("loginBtn")).click();
//		Thread.sleep(1000);
		ed.findElement(By.id("Create Account")).click();
//		Thread.sleep(10000);
		ed.findElement(By.id("First Name")).sendKeys("Siya");
		ed.findElement(By.id("Last Name")).sendKeys("Sharma");
		ed.findElement(By.id("Female")).click();
//		Thread.sleep(10000);
		ed.findElement(By.id("Phone Number")).sendKeys("1234562345");
		ed.findElement(By.id("Email Address")).sendKeys("siya21@gmail.com");
		ed.findElement(By.id("Password")).sendKeys("Siya@123");
		ed.findElement(By.id("Confirm Password")).sendKeys("Siya@123");
		ed.findElement(By.id("Terms and Conditions")).click();
//		Thread.sleep(30000);
		ed.findElement(By.xpath("//button[text()='Register']")).click();
		
		

	}

}
