package com.qa.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
		WebDriver ldriver;
		
		public LoginPage(WebDriver rdriver) {
			
			 ldriver=rdriver;
			 PageFactory.initElements(rdriver, this);
		}
		
		@FindBy(id="inputEmail")
		@CacheLookup
		WebElement txtusername;
		
		
		@FindBy(id="inputPassword")
		@CacheLookup
		WebElement txtpassword;
		
		@FindBy(xpath="//input[@name='rememberme']")
		@CacheLookup
		WebElement checkbox;
		
		@FindBy(xpath="//*[@class='recaptcha-checkbox-border']")
		@CacheLookup
		WebElement captcha;
		
		public void setusername(String username) {
			txtusername.sendKeys(username);
		}
		
		public void setpassword(String pwd) {
			txtpassword.sendKeys(pwd);
		}
		
		public void checkbox() {
			checkbox.click();
		}
		
		public void captcha() {
			captcha.click();
		}
		

	

}
