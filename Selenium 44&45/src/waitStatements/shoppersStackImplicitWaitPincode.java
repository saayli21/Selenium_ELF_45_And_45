package waitStatements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class shoppersStackImplicitWaitPincode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		EdgeDriver ed=new EdgeDriver();
		ed.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		ed.get("https://www.shoppersstack.com/");
		ed.findElement(By.xpath("//span[text()='SAMSUNG']")).click();
		ed.findElement(By.id("Check Delivery")).sendKeys("560029");
		WebElement Login = ed.findElement(By.xpath("//button[text()='Check']"));
		System.out.println(Login.isEnabled());
		Login.submit();

	}

}

//IMPLICIT WAIT WILL NOT WORK HERE AS CHECKBOX WHICH WE ARE LOCATING IS ALREADY THERE, BUT BUTTON ITSELF IS DISABLED.
