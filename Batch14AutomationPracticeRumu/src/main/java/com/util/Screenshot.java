package com.util;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot {
	public static void getCopy(WebDriver driver,String name) {
		
	
	File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    
	try {
		FileUtils.copyFile(scrFile, new File("./Screenshot"+name+".png"));
	} catch (IOException e) {
		
		e.printStackTrace();
	}
}
}