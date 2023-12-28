package Practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class workingWithDataProvider {
	@DataProvider
	public String[] passTestData() throws EncryptedDocumentException, IOException {
	FileInputStream fis = new FileInputStream(new File("./Resources/Vtiger.xlsx"));
	Workbook workbook = WorkbookFactory.create(fis);
	int colCount = workbook.getSheet("DataProviderPractice").getRow(0).getPhysicalNumberOfCells()-1;
	String[] data=new String[colCount];
	for(int i=0; i<colCount; i++) {
		data[i]=workbook.getSheet("DataProviderPractice").getRow(0).getCell(i+1).toString();
	}
	return data;
	}
	
	@Test(dataProvider="passTestData")
	public void testingUserNameTestField(String testData) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://crmaccess.vtiger.com/log-in/?mode=continue");
		
		driver.findElement(By.name("username")).sendKeys(testData);
		driver.findElement(By.xpath("//button[text()='Sign in']")).click();
	}

}
