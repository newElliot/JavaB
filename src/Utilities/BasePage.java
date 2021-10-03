package Utilities;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;


public class BasePage {
	private static String LOG4J_PATH = "/src/Resources/log4j.properties";
	Logger logger = Logger.getLogger(this.getClass().getName());
	
	public BasePage() {
		PropertyConfigurator.configure(getCurrentDirectory() + LOG4J_PATH);
	}
	
	public String getCurrentDirectory() {
		return System.getProperty("user.dir");
	}
//	
//	public static void main(String[] abc) {
//		BasePage a = new BasePage();
//		a.getCurrentDirectory();
//	}
}
