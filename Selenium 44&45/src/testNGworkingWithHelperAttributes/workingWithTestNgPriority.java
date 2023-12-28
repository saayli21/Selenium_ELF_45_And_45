package testNGworkingWithHelperAttributes;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class workingWithTestNgPriority {
	@Test(priority=2)
	public void porsche() {
		 ChromeDriver cd=new ChromeDriver();
	     cd.manage().window().maximize();
	     cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	     cd.get("https://www.porsche.com/middle-east/_india_/");
	}
	     
	     @Test(priority=1)
	     public void supra() {
	    	 ChromeDriver cd=new ChromeDriver();
		     cd.manage().window().maximize();
		     cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		     cd.get("https://www.toyota.com/grsupra/"); 
	     }
		
	}


