package workingWithExcel;

	

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class workingWithVtigerExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.Driver", "./Driver/chromedriver.exe");
        ChromeDriver cd=new ChromeDriver();
        cd.manage().window().maximize();
        cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        
        cd.get("https://demo.vtiger.com/vtigercrm/index.php");
		
		File file=new File("./Resources/Vtiger.xlsx");
		FileInputStream fis=new FileInputStream(file);
		
		Workbook workbook = WorkbookFactory.create(fis);
		 
		String Username = workbook.getSheet("Sheet1").getRow(7).getCell(6).getStringCellValue();
		String Password = workbook.getSheet("Sheet1").getRow(8).getCell(6).getStringCellValue();
		
		cd.findElement(By.id("username")).clear();
		cd.findElement(By.id("password")).clear();
		cd.findElement(By.id("username")).sendKeys(Username);
		cd.findElement(By.id("password")).sendKeys(Password);
		cd.findElement(By.xpath("//button[text()='Sign in']")).click();
		
		 
		 
		 
		 

	}

}


