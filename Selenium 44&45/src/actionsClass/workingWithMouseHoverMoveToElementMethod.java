package actionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class workingWithMouseHoverMoveToElementMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		EdgeDriver ed=new EdgeDriver();
		ed.manage().window().maximize();
		ed.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		ed.get("https://www.purplle.com/");
		WebElement clickOnShopCategories = ed.findElement(By.partialLinkText("SHOP CATEGORIES"));
		
	    //ACTIONS CLASS
		Actions a=new Actions(ed);
		a.moveToElement(clickOnShopCategories);
		a.perform();
		
		WebElement clickOnSkinCare = ed.findElement(By.partialLinkText("Skin Care"));
		Actions a1=new Actions(ed);
		a1.moveToElement(clickOnSkinCare);
		a1.perform();
		
		ed.findElement(By.linkText("Cleanser")).click();
		
		ed.findElement(By.xpath("")).click();
		

	}

}
