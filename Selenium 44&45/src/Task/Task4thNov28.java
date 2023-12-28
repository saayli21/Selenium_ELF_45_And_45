package Task;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class Task4thNov28 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		EdgeDriver ed=new EdgeDriver();
		ed.manage().window().maximize();
		
		ed.get("https://www.skillrary.com/user/login");
		Thread.sleep(10000);
		ed.findElement(By.partialLinkText("SPANISH")).click();
		ed.findElement(By.partialLinkText("ENGLISH")).click();
		ed.navigate().back();
		Thread.sleep(2000);
		ed.findElement(By.linkText("SIGN IN")).click();
		ed.findElement(By.id("email")).sendKeys("siya21@gmail.com");
		ed.findElement(By.name("password")).sendKeys("siya123");
		ed.findElement(By.id("usertype_yes")).click();
		ed.findElement(By.id("groupcode")).sendKeys("TYSS123");
	//	Thread.sleep(6000);
		ed.findElement(By.name("remember")).click();
		

	}

}
