package TestNGRevision;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

public class ReadingDataFromPropertyFile {
	public static void main(String[] args) throws IOException {
		
		Properties obj=new Properties();
		
		FileInputStream myfile = new FileInputStream("C:\\Users\\DELL\\eclipse-workspace\\SeleniumRevision1\\myProperties.properties");
		
		obj.load(myfile);
		String value=obj.getProperty("UN");
		System.out.println(value);
		
	}
	
	
	
}

