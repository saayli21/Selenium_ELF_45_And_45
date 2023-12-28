package popUps;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class workingWithPromtPopUps {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.msedge.driver", "./Drivers/msedgedriver.exe");
		EdgeDriver ed=new EdgeDriver();
		ed.manage().window().maximize();
		ed.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		ed.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
		ed.switchTo().frame("iframeResult");
		ed.findElement(By.xpath("//button[text()='Try it']")).click();
		
		Alert alt = ed.switchTo().alert();
		String s1 = alt.getText();
		Thread.sleep(2000);
		System.out.println(s1);
		alt.sendKeys("saloni");
		Thread.sleep(2000);
		alt.accept();

	}

}
