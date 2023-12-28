package popUps;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class workingWithConfirmationPopUps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.msedge.driver", "./Drivers/msedgedriver.exe");
		EdgeDriver ed=new EdgeDriver();
		ed.manage().window().maximize();
		ed.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		ed.get("https://licindia.in/");
		ed.findElement(By.xpath("//button[text()='Close']")).click();
		ed.findElement(By.partialLinkText("Pay Premium")).click();
		
	    Alert alt = ed.switchTo().alert();
	    String text=alt.getText();
	    System.out.println(text);
	    alt.dismiss();     //DIMISS() WILL CLICK CANCEL BUTTON
//	    alt.accept();      HERE ACCEPT WILL CLICK ON OK BUTTON

	}

}
