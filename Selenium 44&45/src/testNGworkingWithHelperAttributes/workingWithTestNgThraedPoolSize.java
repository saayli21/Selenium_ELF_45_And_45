package testNGworkingWithHelperAttributes;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class workingWithTestNgThraedPoolSize {
	@Test(priority=1, invocationCount=2, threadPoolSize=3)
	public void letCode() {
		ChromeDriver cd=new ChromeDriver();
	    cd.manage().window().maximize();
	    cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	    cd.get("https://letcode.in/signin"); 
	}
	
	@Test(priority=2, invocationCount=1, threadPoolSize=1)
	public void Vtiger() {
		ChromeDriver cd=new ChromeDriver();
		cd.manage().window().maximize();
	    cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	    cd.get("https://demo.vtiger.com/vtigercrm/index.php"); 
		
	}

}
