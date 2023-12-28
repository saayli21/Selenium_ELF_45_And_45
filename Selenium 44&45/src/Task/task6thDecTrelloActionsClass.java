package Task;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class task6thDecTrelloActionsClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		EdgeDriver ed=new EdgeDriver();
		ed.manage().window().maximize();
		ed.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//		WebDriverWait explicitWait=new WebDriverWait(ed,Duration.ofSeconds(15));
		
		ed.get("https://trello.com/home");
		ed.findElement(By.linkText("Log in")).click();
		ed.findElement(By.id("username")).sendKeys("sayalipagare99@gmail.com");
		ed.findElement(By.id("login-submit")).click();
//		explicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password")));
		ed.findElement(By.id("password")).sendKeys("Raj@216421");
		ed.findElement(By.id("login-submit")).click();
		
		ed.findElement(By.xpath("//a[@class='board-tile']")).click();
		
		WebElement clickOnProjectPlanning = ed.findElement(By.xpath("//a[@class='NdQKKfeqJDDdX3']"));
        Actions a=new Actions(ed);
		a.contextClick(clickOnProjectPlanning).perform();
		
		WebElement openCard = ed.findElement(By.linkText("Open card"));
		System.out.println(openCard.getText());
		
		List<WebElement> allElements = ed.findElements(By.xpath("//button[@class='BppQGb2j7TfyB5 bxgKMAm3lq5BpA SEj5vUdI3VvxDc']"));
		for(WebElement s1:allElements)
		{
			System.out.println(s1.getText());
		}
		
		
		
		

	}

}
