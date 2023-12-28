package Task;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class task2IFrameDream11EnterMobileNumber5thDec {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		EdgeDriver ed=new EdgeDriver();
		ed.manage().window().maximize();
		ed.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebDriverWait explicitWait=new WebDriverWait(ed,Duration.ofSeconds(15));
		
		ed.get("https://www.dream11.com/");
		ed.switchTo().frame(0);     //ONLY ONE FRAME IS THERE, AND WE'RE STARTING FROM 0
		ed.findElement(By.id("regEmail")).sendKeys("1234567898");
	
	}

}

