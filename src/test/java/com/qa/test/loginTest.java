package com.qa.test;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.page.AnnouncementsPage;
import com.qa.page.LoginPage;

public class loginTest extends BaseClass {

	   
	  @Test (priority=1)
	  public void LoginPage() {
		  
		   LoginPage lp = new LoginPage(driver);
		   String username = "ananthu.siva06@gmail.com";
		   String pwd ="test01";
		   lp.setusername(username);
		   lp.setpassword(pwd);
		   lp.checkbox();
		   lp.captcha();
		   String expected="Login Details Incorrect. Please try again. ";
		   String actual=driver.getTitle();
		   Assert.assertEquals(actual, expected);
		    
	  }
	  
	  @Test (priority=2)
	  public void AnnouncementPage() {
		  AnnouncementsPage ap=new AnnouncementsPage(driver);
		  ap.click();
	  }
}
