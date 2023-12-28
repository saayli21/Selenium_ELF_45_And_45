package autoIt;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class workingWithFileUploadNaukari {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.Driver", "./Driver/chromedriver.exe");
        ChromeDriver cd=new ChromeDriver();
        cd.manage().window().maximize();
        cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        
        cd.get("https://www.naukri.com/");
        cd.findElement(By.xpath("//a[text()='Register']")).click();
        cd.findElement(By.xpath("//button[text()='Upload Resume']")).click();
        
        Runtime.getRuntime().exec("./AutoIt/resumeuploadTyss.exe");

	}

}
