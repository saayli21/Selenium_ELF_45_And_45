package testNGworkingWithHelperAttributes;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class workingWithTestNgTimeout {
	@Test(timeOut=15000)
	public void supra() {
		 ChromeDriver cd=new ChromeDriver();
	     cd.manage().window().maximize();
	     cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	     cd.get("https://www.toyota.com/grsupra/"); 
	}

}
