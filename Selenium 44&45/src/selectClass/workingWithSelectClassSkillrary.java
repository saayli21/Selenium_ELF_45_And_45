package selectClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class workingWithSelectClassSkillrary {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		EdgeDriver ed=new EdgeDriver();
		ed.manage().window().maximize();
		ed.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		ed.get("https://demoapp.skillrary.com/");
		
		WebElement priceDropdown = ed.findElement(By.id("cars"));
		Select s=new Select(priceDropdown);
		
		s.selectByIndex(0);    //FREE 90
		Thread.sleep(1000);
		s.selectByValue("399");  //INR 300 - INR 399 ( 1 ) 
		Thread.sleep(1000);
		s.selectByVisibleText("INR 200 - INR 299 ( 3 ) ");   //INR 200 - INR 299 ( 3 ) 
		Thread.sleep(1000);
		System.out.println(s.getFirstSelectedOption().getText());
//		System.out.println(s.getAllSelectedOptions());

	}

}
