package Task;

import java.util.Scanner;

import org.openqa.selenium.edge.EdgeDriver;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
 //TO PASS PAGE SOURCE IN EXTERNAL FILE

public class passingPageTitleAndUrlToFile2ExternalFile {
	public static void main(String[]args) throws IOException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter file name with extension");
		String s=sc.next();
		File f=new File(s);
		if(!f.exists()) {
			System.out.println("File is created");
			f.createNewFile();
		}
		else 
			System.out.println("File is already created");
			
			System.setProperty("webdriver.msedge.driver", "./Drivers/msedgedriver.exe");
			EdgeDriver ed=new EdgeDriver();
			ed.get("https://www.jaguar.in/index.html");
			String pageSource=ed.getPageSource();
			FileOutputStream fos=new FileOutputStream(f);
			String source=pageSource;
			fos.write(source.getBytes());
		
		
	}
    
     
	
		

	}


