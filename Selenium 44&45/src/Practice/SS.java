package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SS 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		EdgeDriver ed=new EdgeDriver();
		ed.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebDriverWait explicitWait=new WebDriverWait(ed,Duration.ofSeconds(15));
		
		
		ed.get("https://www.shoppersstack.com/");
		ed.findElement(By.xpath("//span[text()='APPLE iPhone 14 Pro']")).click();
		ed.findElement(By.id("Check Delivery")).sendKeys("548756");
		
		WebElement check=ed.findElement(By.id("Check"));
		explicitWait.until(ExpectedConditions.elementToBeClickable(check));
		check.click();
	}
}
