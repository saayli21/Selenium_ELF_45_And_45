package Task;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class Task1stNov29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		EdgeDriver ed=new EdgeDriver();
		ed.manage().window().maximize();
		ed.get("https://demowebshop.tricentis.com/login");
		
		ed.findElement(By.linkText("Register")).click();
		ed.findElement(By.id("gender-female")).click();
		ed.findElement(By.id("FirstName")).sendKeys("Siya");
		ed.findElement(By.id("LastName")).sendKeys("Sharma");
		ed.findElement(By.id("Email")).sendKeys("Siya31212@gmail.com");
		ed.findElement(By.id("Password")).sendKeys("Siya@21");
		ed.findElement(By.id("ConfirmPassword")).sendKeys("Siya@21");
		ed.findElement(By.id("register-button")).click();
		
		ed.findElement(By.partialLinkText("Books")).click();
		ed.findElement(By.cssSelector("input[onclick=\"AjaxCart.addproducttocart_catalog('/addproducttocart/catalog/13/1/1    ');return false;\"]")).click();
		ed.findElement(By.linkText("Shopping cart")).click();
		ed.findElement(By.cssSelector("input[name='removefromcart']")).click();
		ed.findElement(By.cssSelector("input[value='Update shopping cart']")).click();
		
		
	


	}

}
