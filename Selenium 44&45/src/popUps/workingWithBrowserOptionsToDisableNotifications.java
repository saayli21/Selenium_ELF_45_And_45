package popUps;

import java.time.Duration;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class workingWithBrowserOptionsToDisableNotifications {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.msedge.driver", "/Drivers.msedgedriver.exe");
		EdgeOptions option=new EdgeOptions();
		option.addArguments("--disable-features");
		
        EdgeDriver ed=new EdgeDriver(option);
        ed.manage().window().maximize();
        ed.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        
        ed.get("https://www.easemytrip.com/");
        
	}

}
