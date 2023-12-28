package Task;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class fetchingHeartColour30thNov {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		EdgeDriver ed=new EdgeDriver();
		ed.manage().window().maximize();
		ed.get("https://www.flipkart.com/");
		
		ed.findElement(By.xpath("//span[text()='Mobiles']")).click();
		

	}

}
