package com.qa.test;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;



public class BaseClass {

		public static WebDriver driver;
		String baseURL;
		
		@BeforeClass
		public void openBrowser() {
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\I322911\\eclipse-new workspace\\Selenium_Test\\Drivers\\chromedriver.exe" );
			driver = new ChromeDriver();
			
			baseURL="https://phptravels.org/clientarea.php";
			driver.get(baseURL);
		}
		
		@AfterClass
		public void quitBrowser() {
			
			 driver.quit();
		}
		

	}


