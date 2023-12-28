package dataProvider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

//2D ARRAY; PASSING DATA HERE ONLY

public class workingWithDataProviderMultipleUserRegOnspotDataCreation {
	@DataProvider
	public String[][] RegistrationOf5Users() {
		String[][] details= {
				              {"male","Shreepad","Daundkar","Shree3198@gmail.com","shri$#","shri$#"},
				              {"female","Sayali","Pagare","Sayali3198@gmail.com","sauu$#","sauu$#"},
				              {"female","Saloni","Dhotkar","Saloni3198@gmail.com","slow$#","slow$#"},
				
	                    	};
		return details;
	}
	
	@Test(dataProvider="RegistrationOf5Users")
	public void register(String[] arr) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://demowebshop.tricentis.com/");
	driver.findElement(By.linkText("Register")).click();
	driver.findElement(By.id("gender-"+arr[0].toLowerCase()+"")).click();
	driver.findElement(By.id("FirstName")).sendKeys(arr[1]);
	driver.findElement(By.id("LastName")).sendKeys(arr[2]);
	driver.findElement(By.id("Email")).sendKeys(arr[3]);
	driver.findElement(By.id("Password")).sendKeys(arr[4]);
	driver.findElement(By.id("ConfirmPassword")).sendKeys(arr[5]);
	Thread.sleep(2000);
	driver.findElement(By.id("register-button")).click();
	
	
	
	}
}
