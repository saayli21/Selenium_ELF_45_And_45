package testNGworkingWithHelperAttributes;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class workingWithTestNgEnabled {
	@Test(invocationCount=2, enabled=false)
	public void supra() {
		 ChromeDriver cd=new ChromeDriver();
	     cd.manage().window().maximize();
	     cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	     cd.get("https://www.toyota.com/grsupra/"); 
	}
	
	@Test(invocationCount=1, enabled=true)
	public void bmw() {
		 ChromeDriver cd=new ChromeDriver();
	     cd.manage().window().maximize();
	     cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	     cd.get("https://www.bmw.in/en/index.html"); 
	}
	
	@Test(invocationCount=2, enabled=true)
	public void porsche() {
		 ChromeDriver cd=new ChromeDriver();
	     cd.manage().window().maximize();
	     cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	     cd.get("https://www.porsche.com/middle-east/_india_/"); 
	}
	
	

}
