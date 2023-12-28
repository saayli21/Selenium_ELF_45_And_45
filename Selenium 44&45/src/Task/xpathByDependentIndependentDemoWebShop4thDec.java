package Task;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class xpathByDependentIndependentDemoWebShop4thDec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		EdgeDriver ed=new EdgeDriver();
		ed.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        
		ed.get("https://demowebshop.tricentis.com/");
		ed.findElement(By.xpath("//a[text()='14.1-inch Laptop']/../..//input[contains(@onclick,'AjaxCart')]")).click();
		ed.findElement(By.xpath("//span[text()='Shopping cart']")).click();
		ed.navigate().back();
		ed.findElement(By.xpath("//a[text()='Build your own cheap computer']/../..//input[contains(@onclick,'AjaxCart')]")).click();
		ed.findElement(By.id("add-to-cart-button-72")).click();
		ed.navigate().back();
		ed.findElement(By.xpath("//a[text()='Simple Computer']/../..//input[contains(@onclick,'AjaxCart.addproducttocart')]")).click();
        ed.findElement(By.id("product_attribute_75_5_31_96")).click();
		ed.findElement(By.id("add-to-cart-button-75")).click();
		ed.findElement(By.xpath("//span[text()='Shopping cart']")).click();
		
		//REMOVE FROM CART
		for(int i=1; i<4; i++)
		{
		String shoppingCart = ed.findElement(By.xpath("//div[contains(@class,'page shopping-cart-page')]/../..//table/tbody/tr[1]/td[4]")).getText();
		}
	}
}


