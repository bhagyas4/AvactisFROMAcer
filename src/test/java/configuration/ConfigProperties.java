package configuration;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigProperties {
	
	private static Properties prop = new Properties ();
	
	public static void loadProperties() {
		try
		{
			prop.load(new FileInputStream("C:\\Users\\Sachin\\eclipse-workspace\\avactis\\config\\avactis.properties"));
		
		}catch(FileNotFoundException e)
		{
			System.out.println("File not found here");
			
		}catch(IOException e)
		{
			System.out.println(" IO exception while accessing config file");
		}
		
	}
	public static String getProperty(String keyValue) {
		return prop.getProperty(keyValue);
	}

}
