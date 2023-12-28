package actionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput.ScrollOrigin;

public class workingWithScrollMethodNaukari {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.msedge.driver", "./Drivers/msedgedriver.exe");
		EdgeDriver ed=new EdgeDriver();
		ed.manage().window().maximize();
		ed.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		ed.get("https://www.naukri.com/");
		Actions a=new Actions(ed);
		WebElement resumeWriting = ed.findElement(By.xpath("//span[text()='Resume writing']"));
	//	a.scrollByAmount(0, 3000).perform();
		ScrollOrigin ref= ScrollOrigin.fromElement(resumeWriting);
		a.scrollFromOrigin(ref, 0, 200).perform();
		resumeWriting.click();
		
		
		

	}

}
