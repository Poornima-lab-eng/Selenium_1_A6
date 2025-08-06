package genericutility;



import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

/**
 * @author Poornima
 */

public class WebDriverUtility {
	

	private Object actalUrl;
	/**
	 * This method will maximize the window
	 * @param driver
	 */
	
	public void maximise(WebDriver driver) {
	driver.manage().window().maximize();
	}
	
	/**
	 * This method will minimise the window
	 * @param driver
	 */
public void minimise(WebDriver driver) {
	driver.manage().window().minimize();
}

/**
 * This method will mouseHover actions the window
 * @param driver
 * @param element
 */

public void mouseHover(WebDriver driver,WebElement element) {
	Actions act=new Actions(driver);
	act.moveToElement(element);
}
/**
 * This method will scrollToElement actions the window
 * @param driver
 * @param element
 */

public void scrollToElement(WebDriver driver,WebElement element) {
	Actions act=new Actions(driver);
	act.scrollToElement(element).perform();
}
/**
 * This method will ScrollBy actions the window
 * @param driver
 * @param x
 * @param y
 */


public void ScrollBy(WebDriver driver,int x,int y) {
	Actions act=new Actions(driver);
	act.scrollByAmount(x, y).perform();
}
/**
 * This method will DragAndDrop actions the window
 * @param driver
 * @param element
 */

public void DragandDrop(WebDriver driver,WebElement element) {
	Actions act=new Actions(driver);
	act.dragAndDrop(element , element );
}

/**
 * This method will RightClick actions the window
 * @param driver
 * @param element
 */

public void RightClick(WebDriver driver,WebElement element) {
	Actions act=new Actions(driver);
	act.contextClick(element).perform();
}
/**
 * This method will DoubleClick actions the window
 * @param driver
 * @param element
 */

public void Doubleclick(WebDriver driver,WebElement element) {
	Actions act=new Actions(driver);
	act.doubleClick(element).perform();
}
/**
 * This method will ClickandHold actions the window
 * @param driver
 * @param element
 */

public void ClickandHold(WebDriver driver,WebElement element) {
	Actions act=new Actions(driver);
	act.clickAndHold(element).perform();
}
/**
 * This method will Release actions the window
 * @param driver
 * @param element
 */

public void Release(WebDriver driver,WebElement element) {
	Actions act=new Actions(driver);
	act.release(element).perform();
}
/**
 * This method will SwitchToFrame intdex the window
 * @param driver
 * @param intFrame
 */

public void SwitchToFrame(WebDriver driver,int intFrame) {
	driver.switchTo().frame(intFrame);
}
/**
 * This method will SwitchToFrame String the window
 * @param driver
 * @param intFrame
 */

public void SwitchToFrame(WebDriver driver,String idFrame) {
	driver.switchTo().frame(idFrame);
}

/**
 * This method will SwitchToFrame webelement the window
 * @param driver
 * @param intFrame
 */

public void SwitchToFrame(WebDriver driver,WebElement elementFrame) {
	driver.switchTo().frame(elementFrame);
}
/**
 * Thismethod will select Dropdown index method the window
 * @param element
 * @param index
 */

public void SelectDropdown(WebElement element,int index) {
	Select sel=new Select(element);
	sel.selectByIndex(index);
}
/**
 * Thismethod will select Dropdown String method the window
 * @param element
 * @param index
 */

public void SelectDropdown(WebElement element,String value) {
	Select sel=new Select(element);
	sel.selectByValue(value);
}
/**
 * This method will select Dropdown Visible method the window(overloadding)
 * @param element
 * @param index
 */

public void SelectDropdown(String text,WebElement element) {
	Select sel=new Select(element);
	sel.selectByVisibleText(text);
}

/**
 * Thismethod will select Alert method the window(dismiss,accept,sendkeys,gettext)
 * @param Alert
 * @param index
 */
public Alert SwitchToAlert(WebDriver driver) {
	return driver.switchTo().alert();
}

/**
 * This method will take screenshot the window
 * @param driver
 * @throws IOException
 */
public void getScreenshot(WebDriver driver) throws IOException {
	JavaUtility jutil=new JavaUtility();
	TakesScreenshot ts=(TakesScreenshot) driver;
	File temp=ts.getScreenshotAs(OutputType.FILE);
	File dest=new File("./Screenshot/"+jutil.getSystemTime()+".png");
	FileHandler.copy(temp, dest);
	
}

/**
 * this method pass window id from multiple windows using windowhandles
 * @param driver
 * @param expUrl
 */
public void SwitchToWindow(WebDriver driver,String expUrl) {
	Set<String> allwindowids = driver.getWindowHandles();
	for(String id:allwindowids) {
		driver.switchTo().window(id);
		String actualUrl = driver.getCurrentUrl();
		if(actualUrl.contains(expUrl));{
			break;
		}
	}
}

/**
 * This method will get title
 * @param expTitle
 * @param driver
 */

public void SwitchToWindow(String expTitle,WebDriver driver) {
	Set<String> allwindowids = driver.getWindowHandles();
	for(String id:allwindowids) {
		driver.switchTo().window(id);
		String actualUrl = driver.getCurrentUrl();
		if(actualUrl.contains(expTitle));{
			break;
		}
	}
}

}
