package popUps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class workingWithFileUploadPopupsILovePdf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.msedge.driver", "./Drivers/msedgedriver.exe");
		EdgeDriver ed=new EdgeDriver();
		ed.manage().window().maximize();
		ed.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		ed.get("https://www.ilovepdf.com/pdf_to_word");
		ed.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\Sayali\\Documents\\shubham.pdf");

	}

}
