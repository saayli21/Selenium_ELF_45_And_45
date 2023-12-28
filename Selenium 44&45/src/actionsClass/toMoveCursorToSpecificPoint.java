package actionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class toMoveCursorToSpecificPoint {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		EdgeDriver ed=new EdgeDriver();
		ed.manage().window().maximize();
		ed.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		ed.get("https://yonobusiness.sbi/login/yonobusinesslogin");
		WebElement passwordTextBox = ed.findElement(By.id("password"));
		passwordTextBox.sendKeys("Testing@1223");
		Thread.sleep(2000);
		System.out.println(passwordTextBox.getSize().getWidth());
		Actions a=new Actions(ed);
		a.moveToElement(passwordTextBox, 298, 0).click().perform();
		

	}

}
