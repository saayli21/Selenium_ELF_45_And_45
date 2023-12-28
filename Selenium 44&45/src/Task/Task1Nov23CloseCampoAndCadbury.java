package Task;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.edge.EdgeDriver;

public class Task1Nov23CloseCampoAndCadbury {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		EdgeDriver ed=new EdgeDriver();
		ed.manage().window().maximize();
		
		ed.get("file:///D:/MultipleWindow.html");
		ed.findElement(By.xpath("//input[@value='Open Food Sites']")).click();
//		Thread.sleep(2000);
		Set<String> allWindowID = ed.getWindowHandles();
		
		for(String WindowID:allWindowID)
		{
			ed.switchTo().window(WindowID);
			System.out.println(ed.getTitle());
			
			
//		 Dimension size = ed.manage().window().getSize();
//		 System.out.println("Heigth of browser is:"+ size.getHeight());
//		 System.out.println("Width of browser:"+ size.getWidth());
//		 Thread.sleep(2000);
//		 
		 Dimension newSize=new Dimension(200,300);
		 ed.manage().window().setSize(newSize);
		 
//		 Thread.sleep(2000);
		 
		 Point position = ed.manage().window().getPosition();
	     System.out.println("X position is:"+ position.x);
	     System.out.println("Y position is:"+ position.y);
//		 Thread.sleep(2000);
			
		 Point newPosition=new Point(200,400);
		 ed.manage().window().setPosition(newPosition);
		 
		 //TO CLOSE CAMPO
		 String s1="Campco";
		 String title = ed.switchTo().window(WindowID).getTitle();
		 if(title.contains(s1))
		 {
			 System.out.println(title);
			 ed.close();
		 }
		 
		 //CLOSE CADBURY
		 String s2="Cadbury";
		 String title1 = ed.switchTo().window(WindowID).getTitle();
		 if(title.contains(s2))
		 {
			 System.out.println(title1);
			 ed.close();
		 }
		 
		 
		 
		 
		}
	}

}

