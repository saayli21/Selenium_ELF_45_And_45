package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class workingWithGetCSSValue2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		EdgeDriver ed=new EdgeDriver();
		ed.manage().window().maximize();
		ed.get("https://www.ferrari.com/en-IN");
		
	//	ed.findElement(By.xpath("//button[text()='Menu']")).click();   
		ed.findElement(By.xpath("//button[text()='Sports Cars']")).click();
		ed.findElement(By.xpath("//span[text()='All models']")).click();
		WebElement ferrari = ed.findElement(By.xpath("//img[@src='https://cdn.ferrari.com/cms/network/media/img/resize/649ec85da3933d0095d1203f-ferrari-models-menu-2023-cards-sf90-stradale?width=800&height=450']"));
		System.out.println(ferrari.getCssValue("position"));
		System.out.println(ferrari.getCssValue("width"));  
		System.out.println(ferrari.getCssValue("opacity"));

	}

}
