package Task;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class Task5thNov28 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		EdgeDriver ed=new EdgeDriver();
		ed.manage().window().maximize();
		ed.get("https://retail.onlinesbi.sbi/retail/login.htm#");
	    ed.findElement(By.linkText("CONTINUE TO LOGIN")).click();
		ed.findElement(By.partialLinkText("Forgot")).click();
		Thread.sleep(2000);
		Set<String> WindowId = ed.getWindowHandles();
		for(String Window:WindowId)
		{
			ed.switchTo().window(Window);
			if(ed.getCurrentUrl().contains("https://retail.onlinesbi.sbi/retail/troublelogindetails.htm?banlCode=0"))
			{
				ed.findElement(By.id("nextStep")).click();
				break;
				
			}
		}
			
			
			
			
	
	//	ed.findElement(By.id("userName")).sendKeys("Siya");
	//	ed.findElement(By.id("accountNo")).sendKeys("1273654");
	//	ed.findElement(By.id("country_Code1")).sendKeys("+91");
	//	ed.findElement(By.id("mobileNo")).sendKeys("1234567891");
	//	ed.findElement(By.id("datepicker5")).sendKeys("29/12/2018");
	//	ed.findElement(By.name("captchaValue")).sendKeys("EAB67");
	//	ed.findElement(By.id("go")).click();
		

	}

}
