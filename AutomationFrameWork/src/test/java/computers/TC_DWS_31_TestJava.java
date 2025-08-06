package computers;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import genericutility.BaseClass;
import objectrepository.HomePage;

public class TC_DWS_31_TestJava extends BaseClass{
	
	@Test
	
	public void clickOnElectronics() {
		ExtentTest test=ereport.createTest("clickOnElectronics");
		HomePage hp=new HomePage(driver);
		hp.getElectronics().click();
		Assert.assertEquals(driver.getTitle(),"Demo Web Shop. Electronics", "Electronics page is not displayed");
		test.log(Status.PASS, "Electronics page is displayed");
	}

}
