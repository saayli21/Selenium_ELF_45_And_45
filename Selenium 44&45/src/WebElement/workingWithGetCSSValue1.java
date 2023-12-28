package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class workingWithGetCSSValue1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		EdgeDriver ed=new EdgeDriver();
		ed.manage().window().maximize();
		
		ed.get("https://skillrary.com");
		Thread.sleep(2000);
//		ed.findElement(By.partialLinkText("SPANISH")).click();
//		ed.findElement(By.partialLinkText("ENGLISH")).click();
//		ed.navigate().back();
//		Thread.sleep(6000);
		ed.findElement(By.linkText("SIGN IN")).click();
		ed.findElement(By.linkText("X")).click();
		ed.findElement(By.xpath("//button[text()=' Submit ']")).click();
		Thread.sleep(5000);
		WebElement errorMessage = ed.findElement(By.id("email-error"));
		System.out.println(errorMessage.getCssValue("color"));  
		System.out.println(errorMessage.getCssValue("font-family"));
		System.out.println(errorMessage.getCssValue("font-weight"));

	}

}
