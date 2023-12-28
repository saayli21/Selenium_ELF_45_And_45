package Task;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class task3WorkingWithRediffMail5thDec {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		EdgeDriver ed=new EdgeDriver();
		ed.manage().window().maximize();
		ed.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebDriverWait explicitWait=new WebDriverWait(ed,Duration.ofSeconds(15));
		
		ed.get("https://mail.rediff.com/cgi-bin/login.cgi");
		ed.findElement(By.name("login")).sendKeys("sumanthElfBatch@rediffmail.com");
		ed.findElement(By.name("passwd")).sendKeys("Testing@123");
        ed.findElement(By.name("proceed")).click();
        
        ed.findElement(By.linkText("Write mail")).click();
        ed.findElement(By.xpath("//input[@id='TO_IDcmp2']")).sendKeys("sumanthElfBatch@rediffmail.com");
        ed.findElement(By.xpath("//input[contains(@class,'rd_inp_sub rd_subject_datacmp2')]")).sendKeys("Sayali");
        
        //SEND MESSAGE (FRAME)
        WebElement sendMsg = ed.findElement(By.xpath("//iframe[@class='cke_wysiwyg_frame cke_reset']"));
        ed.switchTo().frame(sendMsg);
        ed.findElement(By.xpath("//body[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']")).sendKeys("I live in BLR");
        ed.switchTo().defaultContent();
        
        //SCREENSHOT (EXPLICIT WAIT, INVISIBILITYOF)
        ed.findElement(By.linkText("Send")).click();
        explicitWait.until(ExpectedConditions.invisibilityOf(sendMsg));
        File source=ed.getScreenshotAs(OutputType.FILE);
        File image=new File("./Rediffmail/sendScreenShot.png");
        FileHandler.copy(source, image);
        
        //DELETE FROM SENT
        ed.findElement(By.linkText("Sent")).click();
        ed.findElement(By.xpath("//a[@class='mr_icon2 rd_mail_trash masterTooltip']/../../../..//li[@Subject='Sayali']")).click();
        explicitWait.until(ExpectedConditions.invisibilityOf(sendMsg));
        File source1=ed.getScreenshotAs(OutputType.FILE);
        File image1=new File("./Rediffmail/deleteScreenShot.png");
        FileHandler.copy(source1, image1);
        
        
        
	}

}
