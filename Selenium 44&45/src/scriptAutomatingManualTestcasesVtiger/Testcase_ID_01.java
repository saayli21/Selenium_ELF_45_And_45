package scriptAutomatingManualTestcasesVtiger;

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

/***
 * 
 * @author Sayali
 *
 */

public class Testcase_ID_01 {
	

	public static void main(String[] args) throws EncryptedDocumentException, FileNotFoundException, IOException {
		
		//Steps to read data from Excel
		Workbook workbook=WorkbookFactory.create(new FileInputStream(new File("./Resources/Vtiger.xlsx")));
      String userName = workbook.getSheet("Sheet1").getRow(8).getCell(7).toString();
      String passWord = workbook.getSheet("Sheet1").getRow(9).getCell(7).toString();
      
      //Expected data
      String welcomePageTitle = "";
	  String homePageTitle = "";
      
      
      //Test step 1: Launch the browser and  Enter test URL
      System.setProperty("webdriver.chrome.Driver", "./Driver/chromedriver.exe");
      ChromeDriver cd=new ChromeDriver();
      cd.manage().window().maximize();
      cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
      cd.get("https://demo.vtiger.com/vtigercrm/index.php");
      
      String actualWelComePageTitle = cd.getTitle();
      if(actualWelComePageTitle.equals(actualWelComePageTitle))
      {
    	  System.out.println("Welcome page is displayed");
      }
      else
      {
          System.out.println("Welcome page is not displayed");
      }
      
      //Test step 2: Enter valid username in Username Text Field.
      WebElement usernameTextField = cd.findElement(By.id("username"));
      usernameTextField.clear();
      usernameTextField.sendKeys(userName);
      String usernameEntered = usernameTextField.getAttribute("value");
      if(usernameEntered.equals(userName))
      {
    	  System.out.println("Valid username was entered");
      }else
      {
    	  System.out.println("Valid username was not entered");
      }
      
      //Test step 3: Enter valid Password in Password Text Field.
      WebElement passwordTextField = cd.findElement(By.id("password"));
      passwordTextField.clear();
      passwordTextField.sendKeys(passWord);
      String passwordEntered = passwordTextField.getAttribute("value");
      if(passwordEntered.equals(passWord))
      {
    	  System.out.println("Valid password was entered");
      }else
      {
    	  System.out.println("Valid password was not entered");
      }
      
      //Test step 4: .Click on Sign In button
      cd.findElement(By.xpath("//button[text()='Sign in']")).click();
      String actualHomePageTitle = cd.getTitle();
      if(actualHomePageTitle.equals(homePageTitle))
      {
    	  System.out.println("Home page is displayed");
      }else
      {
    	  System.out.println("Home page is not displayed");
      }
      
     }

}
