package seleniumAssesment1;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class task2CloseAllWindow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.msedge.driver", "./Drivers/msedgedriver.exe");
		EdgeDriver ed=new EdgeDriver();
		ed.manage().window().maximize();
		ed.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		ed.get("file:///D:/TestPage.html");
		ed.findElement(By.xpath("//button[contains(@type,'button')]")).click();
		Thread.sleep(2000);
        Set<String> allWindowID = ed.getWindowHandles();
		
		for(String WindowID:allWindowID)
		{
			ed.switchTo().window(WindowID);
			System.out.println(ed.getTitle());
        }
		
		 String s="Hyderabadi House Indian Takeaway";
		 String title = ed.switchTo().window(s).getTitle();
		 if(title.contains(s))
		 {
			 System.out.println(title);
			 ed.close();
		 }
		 

}
}
