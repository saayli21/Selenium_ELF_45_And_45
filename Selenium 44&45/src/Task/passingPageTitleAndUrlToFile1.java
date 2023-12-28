package Task;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.openqa.selenium.edge.EdgeDriver;

public class passingPageTitleAndUrlToFile1 {
	public static void main(String[]args) throws IOException {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter file name with extension:");
	String s1=sc.next();
	File f=new File(s1);
	if(!f.exists())
	{
		f.createNewFile();
		System.out.println("File is created");
		
	}
	else
		System.out.println("File is already created");
	
	System.setProperty("webdriver.edge.driver", "./Drivers/msedgedriver.exe");
	EdgeDriver ed=new EdgeDriver();
	ed.get("https://www.jaguar.in/index.html");
	String url=ed.getCurrentUrl()+"\n";
	String title=ed.getTitle();
	
	FileOutputStream fos=new FileOutputStream(f);
	fos.write(url.getBytes());
	fos.write(title.getBytes());
	
	
	
}

	private static String getTitle() {
		// TODO Auto-generated method stub
		return null;
	}
}
