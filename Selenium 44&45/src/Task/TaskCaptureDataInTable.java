package Task;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class TaskCaptureDataInTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		EdgeDriver ed=new EdgeDriver();
		ed.manage().window().maximize();
		ed.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		ed.get("https://groww.in/gold-rates/gold-rate-today-in-bangalore");
		
		//USING FOR LOOP
		for(int i=1; i<5; i++) 
		{
			String tableDetails = ed.findElement(By.xpath("//h2[contains(text(),'22K & 24K Gold Rates')]/../..//table/tbody/tr["+i+"]/td[1]")).getText();
			String goldCost = ed.findElement(By.xpath("//h2[contains(text(),'22K & 24K Gold Rates')]/../..//table/tbody/tr["+i+"]/td[2]/div/div[1]")).getText();
			System.out.println(tableDetails+" - "+goldCost);
		}
		
		for(int i=1; i<11; i++)
		{
			String historicTableDetails = ed.findElement(By.xpath("//h2[contains(text(),'Historical Gold Rates')]/../..//td[@class='tb10Td']/..")).getText();
			String historicGoldCost = ed.findElement(By.xpath("//td[contains(text(),'29th Nov 2023')]/../..//td[2]/div")).getText();
			System.out.println(historicTableDetails+" - "+historicGoldCost);
		}
	}

}
