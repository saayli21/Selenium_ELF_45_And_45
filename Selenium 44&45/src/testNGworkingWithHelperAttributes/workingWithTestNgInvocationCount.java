package testNGworkingWithHelperAttributes;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class workingWithTestNgInvocationCount {
	@Test(priority=3, invocationCount=2)
	public void supra() {
		 ChromeDriver cd=new ChromeDriver();
	     cd.manage().window().maximize();
	     cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	     cd.get("https://www.toyota.com/grsupra/"); 
	}
	
	@Test(priority=1, invocationCount=0)
	public void ferrari() {
		 ChromeDriver cd=new ChromeDriver();
	     cd.manage().window().maximize();
	     cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	     cd.get("https://www.ferrari.com/en-IN"); 
	}
	
	@Test(priority=2, invocationCount=-1)
	public void hyundai() {
		 ChromeDriver cd=new ChromeDriver();
	     cd.manage().window().maximize();
	     cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	     cd.get("https://www.hyundai.com/"); 
	}

}
