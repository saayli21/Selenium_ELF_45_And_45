package seleniumBasics;

import org.openqa.selenium.edge.EdgeDriver;

public class LaunchEdgeDriver {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.msedge.driver", "./Drivers/msedgedriver.exe");
		EdgeDriver ed=new EdgeDriver();
		ed.get("https://www.shoppersstack.com/products_page/57");
		
		
		

	}

}
