package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class workingWithGetSizeAndGetLocation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		EdgeDriver ed=new EdgeDriver();
		ed.manage().window().maximize();
		ed.get("https://www.facebook.com/");
		
		WebElement emailTextBox = ed.findElement(By.id("email"));
		WebElement passwordTextBox = ed.findElement(By.id("passContainer"));
		
		Point emailTextBoxLoc = emailTextBox.getLocation();
		Point passwordTextBoxLoc = passwordTextBox.getLocation();
		
		System.out.println("X value of email:"+ emailTextBoxLoc.getX());
		System.out.println("X value of password:"+ passwordTextBoxLoc.getX()); 
		
		if(emailTextBoxLoc.getX()==passwordTextBoxLoc.getX())
		{
			System.out.println("Left allignment of emailTextBox and PasswordTextBox is alligned properly");
		}
		else
		{
		   System.out.println("It is not alligned properly towards left");	
		}

	}

}
