package genericutility;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import objectrepository.HomePage;
import objectrepository.LoginPage;
import objectrepository.WelcomePage;

public class BaseClass {
	public static ExtentTest test;
	public static ExtentReports ereport;
	public static FileUtility futill=new FileUtility();
	public static JavaUtility jutill=new JavaUtility();
	public static WebDriverUtility wutill=new WebDriverUtility();
	public static ExcelUtility eutill=new ExcelUtility();
	public static WebDriver driver;
	
	
	@BeforeSuite
	public void reportconfig() {
		ExtentSparkReporter spark=new ExtentSparkReporter("./HTML_Reports/ExtentReports_"+jutill.getSystemTime()+".html");
		 ereport=new ExtentReports();
		ereport.attachReporter(spark);
	
	}
	@BeforeClass
	public void openBrowser() throws IOException {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get(futill.getDataFromPropertry("Url"));
	}
	
	@BeforeMethod
	public void login() throws IOException {
		WelcomePage wp=new WelcomePage(driver);
		wp.getLoginLink().click();
		
		LoginPage lp=new LoginPage(driver);
		lp.getEmailTextElement().sendKeys(futill.getDataFromPropertry("Email"));
		lp.getPasswordTextElement().sendKeys(futill.getDataFromPropertry("Password"));
		lp.getLoginButton().click();
	}
	
	@AfterMethod
	public void logout() {
	
		HomePage hp=new HomePage(driver);
		hp.getLogoutButton().click();
	}
	
	@AfterClass
	public void closeBroswer() {
		driver.quit();
	}
	
	
	@AfterSuite
	public void reportbackup() {
		ereport.flush();
		
	}
	

}
