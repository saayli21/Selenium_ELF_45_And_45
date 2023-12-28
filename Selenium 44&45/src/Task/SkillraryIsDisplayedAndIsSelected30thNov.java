package Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class SkillraryIsDisplayedAndIsSelected30thNov {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		EdgeDriver ed=new EdgeDriver();
		ed.manage().window().maximize();
		ed.get("https://skillrary.com/");
		ed.findElement(By.linkText("SIGN IN")).click();
		
		//TO CHECK CHECKBOX IS SELECTED OR NOT
		WebElement checkBox = ed.findElement(By.id("usertype_yes"));
		checkBox.click();      //WE SELECTED THE BOX
		
		//TO CHECK WHETHER GROUPCODE IS DISPLAYED OR NOT
		if(checkBox.isSelected())
		{
			System.out.println(ed.findElement(By.id("groupcode")).isDisplayed());
		}
		
		else
		{
			System.out.println(ed.findElement(By.id("groupcode")).isDisplayed());
		}
		
		
		
		

	}

}
