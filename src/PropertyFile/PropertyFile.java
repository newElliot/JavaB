package PropertyFile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;

import Utilities.BasePage;

public class PropertyFile extends BasePage{
	private static Logger logger;
	
	public PropertyFile() {
		logger = Logger.getLogger(this.getClass().getName());
	}
	
	public void loadProperty(String fileName) throws IOException {
		Properties prop = new Properties();
		File file = null;
		BufferedReader bf = null;
		
		try {
			file = new File(fileName);
			bf = new BufferedReader(new FileReader(file));
			prop.load(bf);
			
			logger.info("Username: " + prop.getProperty("db.username"));
			logger.info("Password: " + prop.getProperty("db.password"));
			logger.info("URL: " + prop.getProperty("db.url"));
			
		}catch(Exception e) {
			logger.error("Fail to load properties file");
		}finally {
			if(bf != null) {
				bf.close();
			}
		}
	}
	
	public static void main(String[] args) throws IOException {
		PropertyFile propertyFile = new PropertyFile();
		propertyFile.loadProperty(propertyFile.getCurrentDirectory() + "/src/Resources/configuration.properties");
	}
}
