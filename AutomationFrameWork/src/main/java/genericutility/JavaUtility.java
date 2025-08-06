package genericutility;

import java.time.LocalDateTime;
import java.util.Random;
/**
 * @author poornima
 */

public class JavaUtility {
	
	/**
	 * This method will return current system Date and time in String formate
	 * @return string
	 */
	
	public String getSystemTime() {
		return LocalDateTime.now().toString().replace(":", "-");
	}
	
	/**
	 * This method will return random number within 1000
	 * @return 
	 */
	public int getRandomNumber() {
		
		Random ran=new Random();
		return ran.nextInt(1000);
	}

}
