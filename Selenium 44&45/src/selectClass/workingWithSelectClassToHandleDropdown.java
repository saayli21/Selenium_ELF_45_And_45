package selectClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class workingWithSelectClassToHandleDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		EdgeDriver ed=new EdgeDriver();
		ed.manage().window().maximize();
		ed.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		ed.get("https://letcode.in/dropdowns");
		
		WebElement fruitDropdown = ed.findElement(By.id("fruits"));
		Select s=new Select(fruitDropdown);
		System.out.println(s.isMultiple());
		s.selectByIndex(1);
		s.selectByVisibleText("Mango");
		s.selectByValue("3");		
		
		
		

	}

}
