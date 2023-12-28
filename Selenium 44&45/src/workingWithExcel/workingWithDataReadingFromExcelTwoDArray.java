package workingWithExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.chrome.ChromeDriver;

public class workingWithDataReadingFromExcelTwoDArray {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.Driver", "./Driver/chromedriver.exe");
        ChromeDriver cd=new ChromeDriver();
        cd.manage().window().maximize();
        cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        
        File file=new File("./Resources/Vtiger.xlsx");
        FileInputStream fis=new FileInputStream(file);
        
        Workbook workbook = WorkbookFactory.create(fis);
        
        int rowCount = workbook.getSheet("Sheet2").getPhysicalNumberOfRows();
        int cellCount = workbook.getSheet("Sheet2").getRow(0).getPhysicalNumberOfCells();
		
        String[][] arr=new String[rowCount][cellCount];
        
        for(int i=0; i<rowCount; i++)
        {
        	for(int j=0; j<cellCount; j++)
        	{
        		arr[i][j]=workbook.getSheet("Sheet2").getRow(i).getCell(j).toString();
        		
        	}
        }
        for(int i=0; i<rowCount; i++) {
        	
        
         for(int j=0; j<cellCount; j++)
         {
        	 System.out.print(arr[i][j]+" ");
        	 
         }
        	 System.out.println();
         
	}

}
}
