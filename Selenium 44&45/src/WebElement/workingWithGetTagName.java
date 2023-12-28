package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class workingWithGetTagName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		EdgeDriver ed=new EdgeDriver();
		ed.manage().window().maximize();
		ed.get("https://skillrary.com/user/login");
		
		WebElement email = ed.findElement(By.id("email"));
		System.out.println(email.getTagName());
		
		WebElement submit = ed.findElement(By.xpath("//button[text()=' Submit ']"));
        System.out.println(submit.getTagName());
	}

}
