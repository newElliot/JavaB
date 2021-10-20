package Random;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import Utilities.BasePage;


public class RandomCharacter extends BasePage{
	private static Logger logger;
	
	public RandomCharacter() {
		logger = Logger.getLogger(this.getClass().getPackageName());
	}
	
	public String getRandomAlphaString(int length) throws Exception {		
		String charset = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";		
		charset = RandomStringUtils.random(length, charset.toCharArray());
		logger.debug("        Returned Random Alpha String: " + charset);
		return charset;		
	}
	
	public static void main(String[] args) throws Exception{
		RandomCharacter randomChar = new RandomCharacter();
		for(int i = 1; i <= 10; ++i) {
			randomChar.getRandomAlphaString(5);
		}
		try {
			 int data = 5 / 0;  
		}catch(Exception e) {
			logger.error("Ahihi nè", e);
		}
	}
}
