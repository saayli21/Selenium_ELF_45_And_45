package Task;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class purpleAddAndRemoveLowPriceProdFromCart1stDec {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		EdgeDriver ed=new EdgeDriver();
		ed.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebDriverWait explicitWait=new WebDriverWait(ed,Duration.ofSeconds(15));
		
		ed.get("https://www.purplle.com/");
		ed.findElement(By.partialLinkText("SHOP CATEGORIES")).click();
		
		ed.findElement(By.linkText("Skin Care")).click();
		
		ed.findElement(By.linkText("Cleanser")).click();
		
//		ed.findElement(By.xpath("//div[contains(text(),'Lakme 9To5 Vitamin C+ Facial Serum')]/../..//span[text()='269 ']")).click();
//	    ed.findElement(By.xpath("//div[contains(text(),' Cetaphil Gentle Skin')]/..//span[contains(text(),'359 ')]")).click();
	
		
		

	}

}
