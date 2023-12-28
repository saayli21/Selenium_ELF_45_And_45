package popUps;

import java.awt.AWTException;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

public class workingWithNotificationPopups {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.Driver", "./Driver/chromedriver.exe");
        ChromeDriver ed=new ChromeDriver();
        ed.manage().window().maximize();
        ed.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        
        ed.get("https://www.mygov.in/");
        Thread.sleep(4000);
        
        Robot robot=new Robot();
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_TAB);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_TAB);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_TAB);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        
        robot.keyRelease(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_ENTER);
        
                
	}

}
