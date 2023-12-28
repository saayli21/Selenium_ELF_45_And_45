package popUps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class workingWithFileUploadPopupNaukari {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.msedge.driver", "./Drivers/msedgedriver.exe");
		EdgeDriver ed=new EdgeDriver();
		ed.manage().window().maximize();
		ed.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		ed.get("https://www.naukri.com/");
		ed.findElement(By.id("register_Layer")).click();
		WebElement uploadButton = ed.findElement(By.id("resumeUpload"));
		Actions a=new Actions(ed);
		a.scrollToElement(uploadButton).scrollByAmount(0, 100).perform();
		Thread.sleep(1000);
		uploadButton.sendKeys("C:\\Users\\Sayali\\Documents\\shubham.pdf");
		

	}

}
