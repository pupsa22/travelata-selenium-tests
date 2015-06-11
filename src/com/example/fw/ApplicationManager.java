package com.example.fw;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ApplicationManager {
	
	public WebDriver driver;
	public String baseUrl;	
	
	private NavigationHelper navigationHelper;
	private TourHelper tourHelper;
	
	public ApplicationManager() {
		driver = new FirefoxDriver();
	    baseUrl = "http://travelata.ru/";
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    
	}
	
	public void stop() {
		driver.quit();	   
	}
	
	public NavigationHelper getNavigationHelper() {
		 if (navigationHelper == null) {
			 navigationHelper = new NavigationHelper(this);
		 }
		return navigationHelper;
	 }
	    
	 public TourHelper getTourHelper() {
		 if (tourHelper == null) {
			 tourHelper = new TourHelper(this);
		 }
		return tourHelper;
	 }
}