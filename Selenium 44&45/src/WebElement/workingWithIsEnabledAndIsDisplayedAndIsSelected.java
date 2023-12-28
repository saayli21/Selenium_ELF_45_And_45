package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class workingWithIsEnabledAndIsDisplayedAndIsSelected {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		EdgeDriver ed=new EdgeDriver();
		ed.manage().window().maximize();
		
		//IS ENABLED
		ed.get("https://www.instagram.com");
		Thread.sleep(2000);
		WebElement Login = ed.findElement(By.xpath("//button[.='Log in']"));
		System.out.println(Login.isEnabled());
		
		//IS DISPLAYED
		WebElement Login1 = ed.findElement(By.xpath("//button[.='Log in']"));
		System.out.println(Login1.isDisplayed());
		
		//IS SELECTED
		ed.get("https://skillrary.com/user/login");
		WebElement checkBox = ed.findElement(By.id("usertype_yes"));
		checkBox.click();
		System.out.println(checkBox.isSelected());
		
	}

}

//	TO RUN

