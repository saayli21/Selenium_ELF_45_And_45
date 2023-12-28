package iFrame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class iFrameSpeedTestClosingAds {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		EdgeDriver ed=new EdgeDriver();
		ed.manage().window().maximize();
		ed.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		ed.get("https://www.speedtest.net/");
		Thread.sleep(4000);
		//TO LOCATE AD
		WebElement ads = ed.findElement(By.xpath("//iframe[@name='google_ads_iframe_/6692/speedtest.net/stnext_lowerboard_0']"));
        ed.switchTo().frame(ads);
        
        //TO PERFORM CLICK ACTION ON CROSS SIGN
        ed.findElement(By.id("cbb")).click();
        ed.switchTo().defaultContent();  //USING DEFAULT CONTENT WE CAN SWITCH BACK CONTROL TO PARENT FRAME
	}

}
