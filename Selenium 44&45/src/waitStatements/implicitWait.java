package waitStatements;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class implicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		EdgeDriver ed=new EdgeDriver();
		ed.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		ed.get("https://www.shoppersstack.com/");
		
		ed.findElement(By.id("loginBtn")).click();
		
	}

}


////div[text()=' Lakme 9To5 Vitamin C+ Facial Serum With 98% Pure Vitamin C Complex For Healthy Glowing Skin ']/..//s[text()='₹299']