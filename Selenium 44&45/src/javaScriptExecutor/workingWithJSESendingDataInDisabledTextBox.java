package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class workingWithJSESendingDataInDisabledTextBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.msedge.driver", "./Drivers/msedgedriver.exe");
		EdgeDriver ed=new EdgeDriver();
		ed.manage().window().maximize();
		ed.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		ed.get("https://demoapp.skillrary.com/");
		WebElement disabledTextBox = ed.findElement(By.xpath("//input[@class='form-control']"));
		ed.executeScript("arguments[0].value='I live in BLR';", disabledTextBox);

	}

}
