package seleniumBasics;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.edge.EdgeDriver;

public class workingWithManageGetSetSize {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.msedge.driver", "./Drivers/msedgedriver.exe");
		EdgeDriver ed=new EdgeDriver();
		ed.manage().window().maximize();
		
		ed.get("https://www.jaguar.in/index.html");
		
		//TO GET SIZE OF WEBPAGE
		Dimension size = ed.manage().window().getSize();
		System.out.println("Browser height is:"+ size.getHeight());
		System.out.println("Browser width is:"+ size.getWidth());
		
//	     Thread.sleep(2000);
//		//TO SET SIZE OF THE WEBPAGE
//	     Dimension newSize = new Dimension(1000, 1500);
//		 ed.manage().window().setSize(newSize);
//		
//		 System.out.println("Browser height is:"+ newSize.getHeight());
//			System.out.println("Browser width is:"+ newSize.getWidth());
//			
		
		
		

	}

}
