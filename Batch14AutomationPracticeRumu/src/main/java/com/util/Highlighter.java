package com.util;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Highlighter {
	public static void addColor(WebDriver driver, WebElement element){
		
		JavascriptExecutor obj = (JavascriptExecutor)driver;
		   obj.executeScript("arguments[0].setAttribute('style', arguments[1]);",element, "color: teal; border: 2px solid black;");
	
	}

}


