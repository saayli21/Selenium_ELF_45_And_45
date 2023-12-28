package Task;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class task7thDecFoodPanda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.msedge.driver", "./Drivers/msedgedriver.exe");
		EdgeDriver ed=new EdgeDriver();
		ed.manage().window().maximize();
		ed.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		ed.get("https://www.foodpanda.com/");
		Actions a=new Actions(ed);
		 List<WebElement> allNavEle = ed.findElements(By.xpath("//ul[@id='menu-primary']/li[not(contains(.,'choose-location'))]"));
		 
		 for(WebElement w1:allNavEle)
		 {
			a.keyDown(Keys.CONTROL).perform();
			w1.click();
			a.keyUp(Keys.CONTROL).perform();
		 }
		 
         
	}

}
