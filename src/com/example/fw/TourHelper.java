package com.example.fw;

import static org.testng.AssertJUnit.assertTrue;

//import static org.hamcrest.Matchers.equalTo;
//import static org.junit.Assert.assertThat;
//import org.testng.Assert;

import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;


public class TourHelper extends HelperBase {

	public TourHelper(ApplicationManager manager) {
		super(manager);
	}

	public void selectCountry() {
		click(By.id("check29"));
	}
	
	public void selectMealType() {
		click(By.xpath("//input[@value='Любое']"));
		click(By.id("meal-type-all"));
		click(By.id("meal-type-5"));
	}

	public void gotoTourDetails() {
		click(By.cssSelector("div.serpHotel:nth-of-type(1) a.goToHotel"));
	}

	
	public void verifyCountry() {
		assertTrue(isTextPresent("Египет"));
		
		//Вариант1
		//WebElement country = driver.findElement(By.cssSelector("span[data-bind='text:toCountryLabel']"));
		//String text = country.getText();
		//assertTrue(text.contains("Египет"));
		
		//Вариант2
		//String country = driver.findElement(By.cssSelector("span[data-bind='text:toCountryLabel']")).getText();
		//String countryRequest = "Египет";
		//assertThat(country, equalTo(countryRequest));
	  }
	
	public void verifyMealType() {	
		assertTrue(isTextPresent("HB"));
		
		//WebElement mealType = driver.findElement(By.cssSelector("dd[data-bind*='mealsLabel']"));
		//String text = mealType.getText();
		//assertTrue(text.contains("HB"));
	  }
	protected boolean isTextPresent(String text){
	    try{
	        boolean b = driver.getPageSource().contains(text);
	        return b;
	    }
	    catch(Exception e){
	        return false;
	    }
	  }

}
