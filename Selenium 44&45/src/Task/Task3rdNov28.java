package Task;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;

public class Task3rdNov28 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		EdgeDriver ed=new EdgeDriver();
		ed.manage().window().maximize();
		
		ed.get("https://www.maybelline.co.in/");
		 
		ed.switchTo().newWindow(WindowType.TAB);
		ed.get("https://www.nykaafashion.com/");
		ed.findElement(By.linkText("Men")).click();
		Thread.sleep(2000);
		Set<String> allWindowID = ed.getWindowHandles();
		
		for(String WindowID:allWindowID)
		{
			ed.switchTo().window(WindowID);
			Thread.sleep(1000);
			if(ed.getTitle().contains("Buy Men's Clothing"))
			{
				ed.findElement(By.linkText("Careers")).click();
				break;
				
			}
		}
		for(String WindowId:allWindowID)
		{
			ed.switchTo().window(WindowId);
			Thread.sleep(1000);
			if(ed.getTitle().contains("Maybelline"))
			{
				ed.close();
			}
		}
	
		
	}

}
