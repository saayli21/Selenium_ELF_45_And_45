package Task;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class task7thDecWorkingWithKeyDownKeyUpAndSwitchTo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.msedge.driver", "./Drivers/msedgedriver.exe");
		EdgeDriver ed=new EdgeDriver();
		ed.manage().window().maximize();
		ed.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		ed.get("https://parivahan.gov.in/parivahan/");
		Actions a=new Actions(ed);
		List<WebElement> allNavElements = ed.findElements(By.xpath("//li[@data-level='1']"));
		
		for(WebElement w1:allNavElements)
		{
			a.keyDown(Keys.CONTROL).perform();
			w1.click();
			a.keyUp(Keys.CONTROL).perform();    //USING CONTROL WE CAN OPEN NEW TABS AND USING SHIFT WE CAN OPEN NEW WINDOWS
		}
			
			Set<String> allWindowID = ed.getWindowHandles();
			
			for(String WindowID:allWindowID)
			{
				ed.switchTo().window(WindowID);
				System.out.println(ed.getTitle());
			
			
			//TO CLOSE TAB
			String s1="Site map | Parivahan Sewa | Ministry of Road Transport & Highways, Government of India";
			 String title = ed.switchTo().window(WindowID).getTitle();
			 if(title.contains(s1))
			 {
				 System.out.println(title);
				 ed.close();
			 }
		}
	}
}

