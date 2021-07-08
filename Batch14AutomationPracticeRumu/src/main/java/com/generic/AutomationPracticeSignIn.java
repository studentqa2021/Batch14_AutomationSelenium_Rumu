package com.generic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.util.BaseConfig;
import com.util.Highlighter;
import com.util.Screenshot;

public class AutomationPracticeSignIn {
	
	 public void getLogin()  {
		 System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.navigate().to(BaseConfig.getConfigValue("URL"));
		 driver.manage().window().maximize();
		 
		 //To bring all the methods present in Masterpagefactory class
		 //New Code
		 MasterPageFactory obj = new  MasterPageFactory(driver);
		 Highlighter.addColor(driver, obj.getSignbtn());
		 Screenshot.getCopy(driver, "homepage");
		 obj.getSignbtn().click();
		 Highlighter.addColor(driver,  obj.getEmail());
		 Screenshot.getCopy(driver, "homepage");
		 obj.getEmail().sendKeys(BaseConfig.getConfigValue("User"));
		 obj.getPass().sendKeys(BaseConfig.getConfigValue("Password"));
		 obj.getSignin().click();
		
		 
		 //Old code
		 
		 /*To click on the sign in button
		  WebElement signbtn = driver.findElement(By.xpath("//*[@class='login']"));
		  signbtn.click();
		 
		  // To enter email
		  WebElement email = driver.findElement(By.xpath("//*[@id='email']"));
		  email.sendKeys("sarowerny@gmail.com");
		  
		  //To enter password
		  WebElement pass = driver.findElement(By.xpath("//*[@id='passwd']"));
		  pass.sendKeys("student");
		  
		  //To click on sign in button
		  WebElement signin = driver.findElement(By.xpath("//*[@id='SubmitLogin']"));
		  signin.click();
		  */
		  
		
	}

}
