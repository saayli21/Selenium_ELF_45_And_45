package seleniumAssesment1;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class task1SBI {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.msedge.driver", "./Drivers/msedgedriver.exe");
		EdgeDriver ed=new EdgeDriver();
		//ed.manage().window().maximize();
		ed.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		ed.get("https://retail.onlinesbi.sbi/retail/login.htm");
		ed.findElement(By.linkText("CONTINUE TO LOGIN")).click();
		ed.findElement(By.partialLinkText("Forgot Username")).click();
		
		Dimension size = ed.manage().window().getSize();
		System.out.println("Browser height is:"+ size.getHeight());
		System.out.println("Browser width is:"+ size.getWidth());
		
		Dimension updateSize=new Dimension(88000, 148900);
		ed.manage().window().setSize(updateSize);
	//	System.out.println(updateSize);
		
		Dimension size1 = ed.manage().window().getSize();
		System.out.println("New Browser height is:"+ size1.getHeight());
		System.out.println("New Browser width is:"+ size1.getWidth());
		
		Thread.sleep(2000);
		Set<String> WindowId = ed.getWindowHandles();
		for(String Window:WindowId)
		{
			ed.switchTo().window(Window);
			if(ed.getCurrentUrl().contains("https://retail.onlinesbi.sbi/retail/troubleloginhome.htm?bankCode=0"))
			{
				ed.findElement(By.id("nextStep")).click();
				ed.manage().window().maximize();
				
				
			}
		}
		
		
		ed.findElement(By.id("userName")).sendKeys("");
		ed.findElement(By.id("go")).click();
		Alert usernamePopup=ed.switchTo().alert();
		String usernameText=usernamePopup.getText();
		System.out.println(usernameText);
		usernamePopup.accept();
		ed.findElement(By.id("userName")).sendKeys("Sayali");
		
		ed.findElement(By.id("accountNo")).sendKeys("");
		ed.findElement(By.id("go")).click();
		Alert accountNoPopup=ed.switchTo().alert();
		String accountNoText=accountNoPopup.getText();
		System.out.println(accountNoText);
		accountNoPopup.accept();
		ed.findElement(By.id("accountNo")).sendKeys("42430567883");
		
//		ed.findElement(By.id("go")).click();
//		Alert selectCountryPopup=ed.switchTo().alert();
//		String selectCountryText=selectCountryPopup.getText();
//		System.out.println(selectCountryText);
		
		WebElement selectCountry = ed.findElement(By.name("countryCode"));
		Select s=new Select(selectCountry);
		s.selectByValue("91");

		ed.findElement(By.id("mobileNo")).sendKeys("9961274205");
		ed.findElement(By.id("mobileNo")).sendKeys("");
		ed.findElement(By.id("go")).click();
		Alert mobileNoPopup = ed.switchTo().alert();
		String mobileNoText=mobileNoPopup.getText();
		System.out.println(mobileNoText);
	
		ed.findElement(By.id("datepicker5")).sendKeys();
		ed.findElement(By.id("go")).click();
		Alert datePopup = ed.switchTo().alert();
		String dateText=datePopup.getText();
		System.out.println(dateText);
		ed.findElement(By.id("datepicker5")).sendKeys("29/12/2018");
		
//		ed.findElement(By.xpath("//input[@aria-describedby='basic-addon2']")).sendKeys("21/10/1999");
		
	
		
		
		
		
		

	}

}
