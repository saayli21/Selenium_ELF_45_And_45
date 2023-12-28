package dataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
 
//2D ARRAY; FETCHING DATA FROM EXCEL

public class workingWithDataProviderMultipleUserLoginExcel {
  @DataProvider
  public String[][] loginDetails() throws IOException{
	  FileInputStream fis=new FileInputStream(new File("./Resources/Vtiger.xlsx"));
	  Workbook workbook = WorkbookFactory.create(fis);
	  Sheet dataSheet = workbook.getSheet("DWS");
	 int totalNoOfUsers = dataSheet.getPhysicalNumberOfRows();
	 int totalNoOfUserInfo = dataSheet.getRow(0).getPhysicalNumberOfCells();
	 String [][] detailsArr=new String[totalNoOfUsers][totalNoOfUserInfo];
	 for(int i=0; i<totalNoOfUsers; i++) {
		 for(int j=0; j<totalNoOfUserInfo; j++) {
			detailsArr[i][j]= dataSheet.getRow(i).getCell(j).toString();
			 
		 }
	 }
	 return detailsArr;
	  
  }
  
  @Test(dataProvider="loginDetails")
  public void login(String [] arr) throws InterruptedException {
	  System.setProperty("webdriver/chrome.driver", "./Drivers/chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	  driver.get("https://demowebshop.tricentis.com/");
	  driver.findElement(By.linkText("Log in")).click();
	  driver.findElement(By.id("Email")).sendKeys(arr[0]);
	  driver.findElement(By.id("Password")).sendKeys(arr[1]);
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//input[@value='Log in']")).click();
  }

}
