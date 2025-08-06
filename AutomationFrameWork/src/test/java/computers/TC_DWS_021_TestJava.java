package computers;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import genericutility.BaseClass;
import objectrepository.HomePage;

public class TC_DWS_021_TestJava extends BaseClass{
	
	@Test
	public void clickOnComputers() {
		ExtentTest test=ereport.createTest("clickOnComputers");
		HomePage hp=new HomePage(driver);
		hp.getComputer().click();
		Assert.assertEquals(driver.getTitle(),"Demo Web Shop. Computers", "Computers page is not displayed");
		test.log(Status.PASS, "Computers page is displayed");
	}

}
