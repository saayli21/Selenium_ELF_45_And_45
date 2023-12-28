package Practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class automatingMTTCLetCodeWithKaushik {

	public static void main(String[] args) throws EncryptedDocumentException, FileNotFoundException, IOException {
		// TODO Auto-generated method stub
        Workbook workbook = WorkbookFactory.create(new FileInputStream(new File("./Resources/Vtiger.xlsx")));
        String emailIdTextField = workbook.getSheet("Sheet3").getRow(6).getCell(6).toString();
        String passwordTextField = workbook.getSheet("Sheet3").getRow(7).getCell(6).toString();
        
      //Expected data
      String welcomePageTitle = "";
  	//  String homePageTitle = "";
  	  String homePageUrl="";
  	  
  	  //test step 1: Launch the browser and  Enter test URL.

  	 System.setProperty("webdriver.chrome.Driver", "./Driver/chromedriver.exe");
     ChromeDriver cd=new ChromeDriver();
     cd.manage().window().maximize();
     cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
     WebDriverWait explicitWait=new WebDriverWait(cd,Duration.ofSeconds(15));
     
     cd.get("https://letcode.in/signin");
     
     String actualWelcomePageTitle = cd.getTitle();
     if(actualWelcomePageTitle.equals(actualWelcomePageTitle))
     {
    	 System.out.println("Welcome page is displayed");
     }else
     {
    	 System.out.println("Welcome page is not displayed");
     }
     
     //test step 2: Enter valid email in Email Text Field
     WebElement emailTF = cd.findElement(By.name("email"));
     emailTF.clear();
     emailTF.sendKeys(emailIdTextField);
     String emailEntered = emailTF.getAttribute("value");
     if(emailEntered.equals(emailIdTextField))
    {
	System.out.println("Valid email is entered");
    }else
    {
    	System.out.println("Valid email is not entered");
    }
     
     //test step 3: Enter valid Password in Password Text Field
     WebElement passwordTF = cd.findElement(By.name("password"));
     passwordTF.clear();
     passwordTF.sendKeys(passwordTextField);
     String passwordEntered = passwordTF.getAttribute("value");
     if(passwordEntered.equals(passwordTextField))
     {
    	 System.out.println("Valid password is entered");
     }else
     {
    	 System.out.println("Valid password is not entered");
     }

     //test step 4: Click on Sign In button
     cd.findElement(By.xpath("//button[text()='LOGIN']")).click();
  //   wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("New Course!")));
//     String actualHomePageTitle = cd.getTitle();
//     System.out.println(actualHomePageTitle);
     String actualHomePageUrl = cd.getCurrentUrl();
     System.out.println(actualHomePageUrl);
     if(actualHomePageUrl.equals(homePageUrl))
     {
    	 System.out.println("Home page is displayed");
     }else
     {
    	 System.out.println("Home page is not displayed");
     }
  	  
  	  
	}

}
