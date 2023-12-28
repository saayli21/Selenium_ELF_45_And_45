package Task;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.edge.EdgeDriver;

public class taskWindowSizeAndPosition3windows {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		EdgeDriver ed=new EdgeDriver();
		//ed.manage().window().maximize();
		
		ed.get("file:///D:/MultipleWindow.html");
		ed.findElement(By.xpath("//input[@value='Open Food Sites']")).click();
		Thread.sleep(2000);
		
       Set<String> allWindowID = ed.getWindowHandles();
		
		for(String WindowID:allWindowID)
		{
			Dimension d = new Dimension(300,800);
			Point p=new Point(48,50);
			ed.switchTo().window(WindowID).manage().window().setSize(d);
			ed.switchTo().window(WindowID).manage().window().setPosition(p);
			
		    
		

	}

}
}
