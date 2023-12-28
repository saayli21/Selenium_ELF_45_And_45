package actionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class workingWithDragAndDropTrello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		EdgeDriver ed=new EdgeDriver();
		ed.manage().window().maximize();
		ed.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	//	WebDriverWait explicitWait=new WebDriverWait(ed,Duration.ofSeconds(15));
		
		ed.get("https://trello.com/home");
		ed.findElement(By.linkText("Log in")).click();
		ed.findElement(By.id("username")).sendKeys("sayalipagare99@gmail.com");
		ed.findElement(By.id("login-submit")).click();
//		explicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password")));
		ed.findElement(By.id("password")).sendKeys("Raj@216421");
		ed.findElement(By.id("login-submit")).click();
		
		ed.findElement(By.xpath("//div[.='ELF45']")).click();
		WebElement fromEle = ed.findElement(By.linkText("in progress"));
		WebElement toEle = ed.findElement(By.xpath("//h2[text()='selenium']/../../..//button[text()='Add a card']"));

		Actions a = new Actions(ed);
		a.dragAndDrop(fromEle, toEle).perform();
	}

}


