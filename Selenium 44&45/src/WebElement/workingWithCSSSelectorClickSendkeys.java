package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class workingWithCSSSelectorClickSendkeys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		EdgeDriver ed=new EdgeDriver();
		ed.manage().window().maximize();
		ed.get("https://demowebshop.tricentis.com/login");
		ed.findElement(By.linkText("Log in")).click();
		ed.findElement(By.id("Email")).sendKeys("sayalipagare99@gmail.com");
		ed.findElement(By.id("Password")).sendKeys("sayali2199");
		ed.findElement(By.cssSelector("input[value='Log in']")).click();

	}

}
