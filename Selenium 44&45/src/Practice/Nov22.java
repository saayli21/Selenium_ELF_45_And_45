package Practice;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.edge.EdgeDriver;

public class Nov22 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		EdgeDriver ed=new EdgeDriver();
		ed.manage().window().maximize();
		
		ed.get("https://www.ferrari.com/en-IN");
		
		String pageTitle = ed.getTitle();
		System.out.println(pageTitle);
		
//		String pageSource = ed.getPageSource();
//		System.out.println(pageSource);
		
		String currentURL = ed.getCurrentUrl();
		System.out.println(currentURL);
		
	//	Thread.sleep(2000);
	//	ed.close();
	//	ed.quit();
		
		ed.get("https://www.bugatti.com/");
		ed.navigate().back();
	//	Thread.sleep(2000);
		ed.navigate().forward();
	//	Thread.sleep(2000);
		ed.navigate().refresh();
		
		Dimension size = ed.manage().window().getSize();
		System.out.println("Browser height is:"+ size.getHeight());
		System.out.println("Browser width is:"+ size.getWidth());
		
//		Thread.sleep(2000);
		
		Dimension newSize=new Dimension(100,300);
		ed.manage().window().setSize(newSize);
		
//		Thread.sleep(2000);
		
		Point position = ed.manage().window().getPosition();
		System.out.println("X position is:"+ position.x);
		System.out.println("Y position is:"+ position.y);
//		Thread.sleep(2000);
		
		Point newPosition=new Point(200,400);
		ed.manage().window().setPosition(newPosition);
	
		}

}
