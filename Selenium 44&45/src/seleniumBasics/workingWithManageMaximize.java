package seleniumBasics;

import org.openqa.selenium.edge.EdgeDriver;

public class workingWithManageMaximize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.setProperty("webdriver.msedge.driver", "./Drivers/msedgedriver.exe");
       EdgeDriver ed=new EdgeDriver();
       ed.manage().window().maximize();      //	MAXIMIZE
       
       ed.get("https://www.porsche.com/middle-east/_india_/");
       
       ed.manage().window().fullscreen();     //FULLSCREEN
       
       ed.manage().window().minimize();       //MINIMIZE
       
       
       
       
       
	}

}
