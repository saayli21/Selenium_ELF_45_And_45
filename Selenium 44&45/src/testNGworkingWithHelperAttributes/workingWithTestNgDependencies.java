package testNGworkingWithHelperAttributes;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class workingWithTestNgDependencies {
	@Test(priority=1)
	public void OpenAccount() {
		int i=1/0;
		Reporter.log("Account created", true);
	}

	@Test(priority=5)
	public void DeleteAccount() {
		Reporter.log("Account deleted", true);
	}

	@Test(priority=2)
	public void UpdateMobileNumber() {
		Reporter.log("Mobile number updated", true);
	}
	
	@Test(dependsOnMethods= {"QpenAccount","Addbeneficiary"})
	public void AmmountTransfer() {
		Reporter.log("Ammount is transfered", true);
	}
	
	@Test(priority=3)
	public void Addbeneficiary () {
		Reporter.log("Added benificiary", true);
	}
	
	
}
