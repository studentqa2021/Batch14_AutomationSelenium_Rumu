package com.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MasterPageFactory {
	
	// To remove null pointer exception
	 public  MasterPageFactory(WebDriver driver){
		PageFactory.initElements(driver, this);
		
	}
	 @FindBy(xpath="//*[@class='login']")
	 private WebElement signbtn;
	 
	 @FindBy(xpath="//*[@id='email']")
	 private WebElement email;
	 
	 @FindBy(xpath="//*[@id='passwd']")
	 private WebElement pass;
	 
	 @FindBy(xpath="//*[@id='SubmitLogin']")
	 private WebElement signin;
	 
	 @FindBy(xpath="//*[@class='logout']")
	 private WebElement logout;

	public WebElement getSignbtn() {
		return signbtn;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getSignin() {
		return signin;
	}

	
     
}
