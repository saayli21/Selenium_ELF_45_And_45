package Task;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class task1WorkingWithDropdownMethod5thDec {
	
	public void selectLastOptionFromDropdown(WebElement dropDownElement)
	{
	  Select listbox=new Select(dropDownElement);
	  int totalNoOfOptions= listbox.getOptions().size();
	  listbox.selectByIndex(totalNoOfOptions-1);
	}
	
	
	
	
	
	
	
	

	
		

	}
