package waitStatements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class shoppersStackExplicitWaitPincode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		EdgeDriver ed=new EdgeDriver();
		ed.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebDriverWait explicitWait=new WebDriverWait(ed,Duration.ofSeconds(15));
		
		
		ed.get("https://www.shoppersstack.com/");
		ed.findElement(By.xpath("//span[text()='SAMSUNG']")).click();
		ed.findElement(By.id("Check Delivery")).sendKeys("560029");
		WebElement checkButton = ed.findElement(By.xpath("//button[text()='Check']"));
		explicitWait.until(ExpectedConditions.elementToBeClickable(checkButton));
	//	while(!checkButton.isEnabled());
		checkButton.submit();
	}

}
