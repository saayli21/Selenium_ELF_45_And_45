package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class WorkingWithLinkText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		EdgeDriver ed=new EdgeDriver();
		ed.manage().window().maximize();
		
		ed.get("https://www.woodenstreet.com/");
		ed.findElement(By.linkText("Dining & Kitchen")).click();
		ed.findElement(By.partialLinkText("Modular ")).click();
		

	}

}
