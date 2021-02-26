package com.qa.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AnnouncementsPage {

	 WebDriver ldriver;
	 public AnnouncementsPage(WebDriver rdriver) {
		 ldriver =rdriver;
		 PageFactory.initElements(rdriver, this);
	 }
	 
	 @FindBy(xpath="//li[@id='Primary_Navbar-Announcements']/child::a[contains(text(), 'Announcements')]")
	 @CacheLookup
	 WebElement Announcements;
	 
	 public void click() {
		 Announcements.click();
	 }
	 
	 
}
