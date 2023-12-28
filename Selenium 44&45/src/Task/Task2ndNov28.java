package Task;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class Task2ndNov28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		EdgeDriver ed=new EdgeDriver();
		ed.manage().window().maximize();
		
		ed.get("https://www.skillrary.com/user/login");
		ed.findElement(By.id("email")).sendKeys("siya21@gmail.com");
		ed.findElement(By.name("password")).sendKeys("siya123");
		ed.findElement(By.name("captcha")).sendKeys("PNDe82");

	}

}
