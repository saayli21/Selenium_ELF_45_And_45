package Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Task2nd29N0vworkingWithSubmitAndGetText {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		EdgeDriver ed=new EdgeDriver();
		ed.manage().window().maximize();
		ed.get("https://demowebshop.tricentis.com/");
		
		ed.findElement(By.linkText("Log in")).click();
		WebElement EmailTextBox = ed.findElement(By.id("Email"));
		EmailTextBox.clear();
		EmailTextBox.sendKeys("saya21");
		WebElement PasswordTextBox = ed.findElement(By.id("Password"));
		PasswordTextBox.clear();
		PasswordTextBox.sendKeys("987654");
		ed.findElement(By.cssSelector("input[value='Log in']")).submit();
		Thread.sleep(2000);
		String ErrorMessage = ed.findElement(By.cssSelector("span[class='field-validation-error']")).getText();
	
		System.out.println(ErrorMessage);

	}

}
