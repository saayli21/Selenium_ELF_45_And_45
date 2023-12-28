package testNGWorkingWithParallelExecution;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class workingWithParallelExecutionRoyalEnfield {
	@Test(priority=2)
	public void RoyalEnfield() {
		 ChromeDriver cd=new ChromeDriver();
	     cd.manage().window().maximize();
	     cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	     cd.get("https://www.royalenfield.com/in/en/home/");
	}

}
