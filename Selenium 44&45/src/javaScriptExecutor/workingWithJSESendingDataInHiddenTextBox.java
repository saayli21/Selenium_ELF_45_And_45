package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class workingWithJSESendingDataInHiddenTextBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.msedge.driver", "./Drivers/msedgedriver.exe");
		EdgeDriver ed=new EdgeDriver();
		ed.manage().window().maximize();
		ed.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		ed.get("https://www.facebook.com/signup");
		WebElement hiddenTextBox = ed.findElement(By.name("custom_gender"));
	//	Thread.sleep(2000);
		ed.executeScript("arguments[0].value='I live in BLR';", hiddenTextBox);
		

	}

}
