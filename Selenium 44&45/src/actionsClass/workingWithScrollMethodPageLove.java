package actionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class workingWithScrollMethodPageLove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.msedge.driver", "./Drivers/msedgedriver.exe");
		EdgeDriver ed=new EdgeDriver();
		ed.manage().window().maximize();
		ed.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		ed.get("https://onepagelove.com/");
		Actions a=new Actions(ed);
		for(;;)
		{
			try
			{
				ed.findElement(By.xpath("//a[text()='Grace Walker']"));
			}
			catch(NoSuchElementException exc)
			{
				a.scrollByAmount(0, 25000).perform();
			    ed.findElement(By.xpath("//a[text()='Grace Walker']")).click();
			}
			catch(ElementClickInterceptedException e)
			{
				ed.findElement(By.xpath("//a[text()='Grace Walker']")).click();
				break;
			}
		}
		

	}

}
