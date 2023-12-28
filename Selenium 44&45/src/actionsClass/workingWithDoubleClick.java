package actionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class workingWithDoubleClick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		EdgeDriver ed=new EdgeDriver();
		ed.manage().window().maximize();
		ed.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		ed.get("https://demoapp.skillrary.com/product.php?product=testing");
		WebElement plusSign = ed.findElement(By.id("add"));
		Actions a=new Actions(ed);
		a.doubleClick(plusSign);
		a.doubleClick(plusSign);
		Thread.sleep(2000);
		a.moveToElement(ed.findElement(By.id("minus"))).doubleClick().perform();
		


	}

}
