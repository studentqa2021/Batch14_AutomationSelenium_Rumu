package com.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class BaseConfig {
	public static String getConfigValue(String value){
		//file location
		File file = new File("./config.properties");
		
		// file data>>>stream convert the file into stream
		FileInputStream fis = null;
		try {
			fis = new FileInputStream (file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Properties pro = new Properties();
		try {
			pro.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(pro.getProperty(value));
		return pro.getProperty(value);
		
		
		

}
	
}