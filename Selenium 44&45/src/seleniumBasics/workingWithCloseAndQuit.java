package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class workingWithCloseAndQuit {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.msedge.driver", "./Drivers/msedgedriver.exe");
		EdgeDriver ed=new EdgeDriver();
		ed.get("https://www.shoppersstack.com/products_page/5");
		Thread.sleep(8000);
		ed.findElement(By.id("compare")).click();
		Thread.sleep(6000);
		ed.close();
        ed.quit();
	}

}
