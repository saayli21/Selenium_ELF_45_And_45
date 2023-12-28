package seleniumBasics;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class workingWithSwitchToMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		EdgeDriver ed=new EdgeDriver();
		ed.manage().window().maximize();
		
		ed.get("file:///D:/MultipleWindow.html");
		ed.findElement(By.xpath("//input[@value='Open Food Sites']")).click();
		Thread.sleep(2000);
		Set<String> allWindowID = ed.getWindowHandles();
		
		for(String windowID:allWindowID)
		{
			ed.switchTo().window(windowID);
			System.out.println(ed.getTitle());
		}
		
		Thread.sleep(2000);
		ed.close();
		Thread.sleep(2000);
		ed.quit();
		
		

	}

}
