package genericutility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * @author Poornima
 */
public class FileUtility {
	
	/**
	 * This method will read data from properties file and return value to the caller
	 * @param key
	 * @return
	 * @throws IOException
	 */
	
	public String getDataFromPropertry(String key) throws IOException {
		
		FileInputStream fis=new FileInputStream("./src/test/resources/TestData/CommonData.properties");
		Properties prop=new Properties();
		prop.load(fis);
		return prop.getProperty(key);
	}

}
