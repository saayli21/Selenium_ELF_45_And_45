package seleniumBasics;

import org.openqa.selenium.Point;
import org.openqa.selenium.edge.EdgeDriver;

public class workingWithManageGetSetPosition {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		EdgeDriver ed=new EdgeDriver();
		ed.manage().window().maximize();
		
		//TO GET POSTIION
		ed.get("https://www.jaguar.in/index.html");
		Point Position = ed.manage().window().getPosition();
		System.out.println("X position is :" + Position.getX());
		System.out.println("Y position is :" + Position.getY());
		 
		Thread.sleep(2000);
		
		//TO SET POSITION
		Point targetPosition = new Point(100, 200);
		ed.manage().window().setPosition(targetPosition);
		

	}

}
