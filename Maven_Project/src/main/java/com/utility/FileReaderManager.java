package com.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileReaderManager {
	
	private static FileInputStream fileinputstream;
	private static Properties property;
	
	private static void setupProperty() throws IOException {
		
		File file = new File("C:\\Users\\saikr\\eclipse-workspace\\Maven_Project\\src\\main\\resources\\TestData.properties");
		fileinputstream = new FileInputStream(file);
		property = new Properties();
		property.load(fileinputstream);
		
		
	}
	
	public static  String getDataProperty(String value) throws IOException {
		setupProperty();
		String data = property.getProperty(value);
		return data;	
		
	}
	
	
	
	

}
