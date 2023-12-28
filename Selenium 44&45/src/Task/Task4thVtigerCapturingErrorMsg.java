package Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Task4thVtigerCapturingErrorMsg {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		EdgeDriver ed=new EdgeDriver();
		ed.manage().window().maximize();
		ed.get("https://demo.vtiger.com/vtigercrm/");
		
		WebElement Username = ed.findElement(By.id("username"));
		Username.clear();
		Username.sendKeys("siya");
		
		WebElement Password = ed.findElement(By.id("password"));
		Password.clear();
		Password.sendKeys("8765");
		
		ed.findElement(By.xpath("//button[text()='Sign in']")).click();
		
		Thread.sleep(2000);
		String ErrorMessage = ed.findElement(By.id("validationMessage")).getText();
	
		System.out.println(ErrorMessage);
		
		

	}

}
