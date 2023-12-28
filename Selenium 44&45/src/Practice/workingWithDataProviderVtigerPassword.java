package Practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class workingWithDataProviderVtigerPassword {
	@DataProvider
	public String[] PassTestData() throws EncryptedDocumentException, IOException {
	FileInputStream fis=new FileInputStream(new File("./Resources/Vtiger.xlsx"));
	Workbook workbook=WorkbookFactory.create(fis);
	int colCount = workbook.getSheet("DataProviderPractice").getRow(0).getPhysicalNumberOfCells()-1;
	String[] data=new String [colCount];
	for(int i=0; i<colCount; i++) {
		data[i]=workbook.getSheet("DPPractice").getRow(0).getCell(i+1).toString();
	}
	return data;
}
	
//	@Test(dataProvider = "PassTestData")
	
	
	
}
