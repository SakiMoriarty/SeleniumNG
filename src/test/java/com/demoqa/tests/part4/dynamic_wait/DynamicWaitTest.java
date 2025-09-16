package com.demoqa.tests.part4.dynamic_wait;

import com.demoqa.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

@Test
public class DynamicWaitTest extends BaseTest {

    public void testVisibleAfterButtonText(){
        var dynamicPage = homePage.goToElements().clickDynamicProperties();
        String actualText = dynamicPage.getVisibleAfterButtonText();
        String expectedText = "Visible After 5 Seconds";
        assertEquals(actualText, expectedText,
                "Actual and Expected text Do Not Match");
    }

    public void testProgressBar(){
        var progressBarPage = homePage.goToWidgets().clickProgressBar();
        progressBarPage.clickStartButton();
        String actualValue = progressBarPage.getProgressValue();
        String expectedValue = "100%";
        assertEquals(actualValue, expectedValue,
                "Value Is Not 100%");
    }
}
