package Task;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class closeParentPages {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		EdgeDriver ed=new EdgeDriver();
		ed.manage().window().maximize();
		ed.get("file:///D:/MultipleWindow.html");
		ed.findElement(By.xpath("//input[@value='Open Food Sites']")).click();
		Thread.sleep(2000);
		
		
			
				ed.close();      //TO CLOSE PARENT WINDOW
			
			
			
	}

}

