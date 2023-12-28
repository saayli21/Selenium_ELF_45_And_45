package seleniumBasics;

import org.openqa.selenium.edge.EdgeDriver;

public class workingWithWebDriverMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.msedge.driver", "./Drivers/msedgedriver.exe");
		EdgeDriver ed=new EdgeDriver();
		ed.get("https://www.jaguar.in/index.html");  //TO NAVIGATE TO THE WEBPAGE
		
		String titleOfWebPage=ed.getTitle();
		System.out.println(titleOfWebPage);          //TO GET TITLE OF THE WEBPAGE
		
		String currentURL=ed.getCurrentUrl();        
		System.out.println(currentURL);              //TO GET URL OF CURRENT WINDOW URL 
        
		String source=ed.getPageSource();
		System.out.println(source);                  //TO GET SOURCE OF THE WEBPAGE
	}

}
