package popUps;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class workingWithAlertPopUps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.msedge.driver", "./Drivers/msedgedriver.exe");
		EdgeDriver ed=new EdgeDriver();
		ed.manage().window().maximize();
		ed.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		ed.get("https://demowebshop.tricentis.com/");
		ed.findElement(By.xpath("//input[@value='Search']"));
		
		Alert alt=ed.switchTo().alert();
		String text=alt.getText();
		System.out.println(text);
		alt.accept();
//		alt.dismiss();    //HERE BOTH ACCEPT() AND DISMISS() WILL CLICK ON OK BUTTON

	}

}
