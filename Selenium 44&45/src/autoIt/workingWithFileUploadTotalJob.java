package autoIt;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class workingWithFileUploadTotalJob {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.Driver", "./Driver/chromedriver.exe");
	        ChromeDriver cd=new ChromeDriver();
	        cd.manage().window().maximize();
	        cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	        
	        cd.get("https://www.totaljobs.com/Account/Register");
	        cd.findElement(By.xpath("//div[text()='Accept All']")).click();
	        cd.findElement(By.id("btnCVUpload")).click();
	        cd.findElement(By.xpath("//label[text()='from this device']")).click();
	        
	        Runtime.getRuntime().exec("./AutoIt/fileUploadUsingAutoIt.exe");
	}

}
