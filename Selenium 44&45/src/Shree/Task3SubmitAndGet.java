package Shree;

import org.openqa.selenium.edge.EdgeDriver;

public class Task3SubmitAndGet 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		EdgeDriver driver = new EdgeDriver();
		driver.get("");
	}
}
