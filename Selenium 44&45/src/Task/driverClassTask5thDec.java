package Task;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class driverClassTask5thDec {

	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			EdgeDriver ed=new EdgeDriver();
			ed.manage().window().maximize();
			ed.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			ed.get("https://www.facebook.com/");
			ed.findElement(By.linkText("Create new account")).click();
			
			
			WebElement dayDropdown = ed.findElement(By.id("day"));
			WebElement monthDropdown = ed.findElement(By.id("month"));
			WebElement yearDropdown = ed.findElement(By.id("year"));
			
			task1WorkingWithDropdownMethod5thDec s1=new task1WorkingWithDropdownMethod5thDec();
		    s1.selectLastOptionFromDropdown(dayDropdown);
			s1.selectLastOptionFromDropdown(yearDropdown);
		   
		

	}

}
