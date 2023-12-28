package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class workingWithGetAttribute {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		EdgeDriver ed=new EdgeDriver();
		ed.manage().window().maximize();
		ed.get("https://www.woodenstreet.com/");
		//TO CAPTURE TOOL TIP TEXT
		String toolTipText = ed.findElement(By.cssSelector("img[title='Wooden TV Unit']")).getAttribute("title");
		System.out.println(toolTipText);
		
		//TO CAPTURE ALTERNATIVE TEXT
		String alternateText = ed.findElement(By.cssSelector("img[alt='Wooden Tv Unit Furniture']")).getAttribute("alt");
		System.out.println(alternateText);
		
		//TO CAPTURE DATA ENTERED
		ed.get("https://www.nykaafashion.com/");
		Thread.sleep(1000);
		WebElement searchBox = ed.findElement(By.xpath("//input[contains(@placeholder,'Search for products, styles, brands')]"));
		searchBox.clear();
		searchBox.sendKeys("Earrings");
		String valueEntered = searchBox.getAttribute("value");
		System.out.println(valueEntered);
		
		
		

	}

}
