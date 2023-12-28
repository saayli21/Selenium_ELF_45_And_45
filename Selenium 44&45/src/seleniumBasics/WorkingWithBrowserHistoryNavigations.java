package seleniumBasics;

import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.edge.EdgeDriver;

public class WorkingWithBrowserHistoryNavigations {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.msedge.driver", "./Drivers/msedgedriver.exe");
		EdgeDriver ed=new EdgeDriver();
		ed.get("https://www.jaguar.in/index.html");
		ed.get("https://www.royalenfield.com/in/en/home/");
		ed.get("https://www.porsche.com/middle-east/_india_/");
		
		Thread.sleep(2000);
		Navigation navigation=ed.navigate();
		navigation.back();
		Thread.sleep(2000);
		navigation.back();
		Thread.sleep(2000);
		navigation.forward();
		Thread.sleep(2000);
		navigation.refresh();
	}

}
