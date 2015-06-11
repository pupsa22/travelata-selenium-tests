package com.example.tests;

import org.testng.annotations.Test;

public class TourVerificationTest extends TestBase {
  @Test
  public void testTourVerification() {
    app.getNavigationHelper().openMainPage();
    app.getNavigationHelper().openToursPage();
    app.getTourHelper().selectCountry();    
    app.getTourHelper().selectMealType();
    app.getTourHelper().gotoTourDetails();
    app.getTourHelper().verifyCountry();
    app.getTourHelper().verifyMealType();
  }
}
