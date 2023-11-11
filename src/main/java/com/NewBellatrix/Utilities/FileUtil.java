package com.NewBellatrix.Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class FileUtil {
	public String getProperty(String filepath, String key) throws FileNotFoundException {
		//read property file
		
	String basedir =	System.getProperty("user.dir");
		
		FileInputStream fis = new FileInputStream(basedir+ filepath);
		
		Properties prop = new Properties();
		String value = "";
		try {
			prop.load(fis);
		value=	prop.getProperty(key);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		return value;
	}
	
}
