package testNGWorkingWithBatchExecution;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class workingWithBatchExecutionPorsche {
	@Test
	public void bmw() {
		 ChromeDriver cd=new ChromeDriver();
	     cd.manage().window().maximize();
	     cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	     cd.get("https://www.porsche.com/middle-east/_india_/");
	}
}
