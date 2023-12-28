package Practice;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

public class Dec10 {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.msedge.driver", "./Drivers/msedgedriver.exe");
		EdgeDriver ed=new EdgeDriver();
	//	ed.manage().window().maximize();
		ed.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		ed.get(" https://www.godaddy.com/");
	    Dimension initialSizeOfBrowser = ed.manage().window().getSize();
	    System.out.println("Browser height is:"+initialSizeOfBrowser.getHeight());
	    System.out.println("Browser width is:"+initialSizeOfBrowser.getWidth());
	//    Thread.sleep(2000);
	    Dimension newSizeOfBrowser=new Dimension(1500,2000);
	    ed.manage().window().setSize(newSizeOfBrowser);
	//    Thread.sleep(2000);
	    System.out.println("Browser height is"+newSizeOfBrowser.getHeight());
	    System.out.println("Browser width is"+newSizeOfBrowser.getWidth());
	    
	    String currentUrl = ed.getCurrentUrl();
	    System.out.println(currentUrl);
	    
	    String pageSource = ed.getPageSource();
	    System.out.println(pageSource);
	    
	    String windowHandle = ed.getWindowHandle();
	    System.out.println(windowHandle);
	    
	     File webpageSS = ed.getScreenshotAs(OutputType.FILE);
	     File destFile=new File("./practiceSS/webPagegoDaddy.png");
	     FileHandler.copy(webpageSS, destFile);
	     
	//     Thread.sleep(2000);
	     File elementSS = ed.findElement(By.xpath("//span[text()='Templates designed to sell.']")).getScreenshotAs(OutputType.FILE);
	     File destFile1=new File("./practiceSS/webEleGoDaddy.png");
	     FileHandler.copy(elementSS, destFile1);
	     
	     WebElement fontSize = ed.findElement(By.xpath("//span[text()='Templates designed to sell.']"));
	     System.out.println(fontSize.getCssValue("Font size is"+"font-size"));
	     
	//     Thread.sleep(2000);
	     WebElement hostingAndSecurity = ed.findElement(By.xpath("//button[@aria-label='Hosting and Security']"));
         System.out.println("Tagname is:" +" " +hostingAndSecurity.getTagName());
         
         WebElement domainsButton = ed.findElement(By.xpath("//a[@aria-label='search-domains']"));
         System.out.println("Text between tags is:"+" " +domainsButton.getText());
            
    //     Thread.sleep(2000);
         ed.findElement(By.xpath("//input[@name='searchText']")).sendKeys("engineering");
         ed.findElement(By.xpath("//button[contains(@aria-label,'Search for a domain')]")).click();
         
	}

}
