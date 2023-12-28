package actionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class workingWithDragAndDropandClickHoldRelease {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.msedge.driver", "./drivers/msedgedriver.exe");
		EdgeDriver ed=new EdgeDriver();
		ed.manage().window().maximize();
		ed.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		ed.get("https://www.paiinternational.in/shop/categories/furniture-2/");
		WebElement fromElement = ed.findElement(By.xpath("//span[@class='slider from']"));
		WebElement toElement = ed.findElement(By.xpath("//span[@class='slider to']"));

		Actions a=new Actions(ed);
		a.clickAndHold(fromElement).moveByOffset(10, 0).release(toElement).perform();
		
		//a.dragAndDrop(fromElement, toElement);
	}

}
