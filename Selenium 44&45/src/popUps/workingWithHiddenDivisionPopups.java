package popUps;

import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.edge.EdgeDriver;

public class workingWithHiddenDivisionPopups {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		LocalDateTime ldt=LocalDateTime.now();
		String monthName=ldt.getMonth().name();
		monthName=monthName.substring(0, 1).toUpperCase() + monthName.substring(1).toLowerCase();
		int year=ldt.getYear();
		int day=ldt.getDayOfMonth();
		
		System.setProperty("webdriver.msedge.driver", "./Drivers/msedgedriver.exe");
		EdgeDriver ed=new EdgeDriver();
		ed.manage().window().maximize();
		ed.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		
		ed.get("https://www.agoda.com/");
		ed.findElement(By.xpath("//button[@aria-label='Close Message']")).click();
		Thread.sleep(1000);
		ed.findElement(By.xpath("//div[@data-selenium='checkInBox']")).click();
		Thread.sleep(1000);
		for(;;)
		{
			ed.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
			try 
			{
				ed.findElement(By.xpath("//div[text()='"+monthName+" "+(year+1)+"']/..//span[text()='"+(day-4)+"']")).click();
				Thread.sleep(1000);
				ed.findElement(By.xpath("//div[text()='"+monthName+" "+(year+1)+"']/..//span[text()='"+(day-1)+"']")).click();
			     break;
			}catch(NoSuchElementException nse)
			{
			  ed.findElement(By.xpath("//button[@aria-label='Next Month']")).click(); 	
			}
			
	
		}
		
	}

}
