package com.demoqa.tests.part4.interactions;

import com.demoqa.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class KeyboardTest extends BaseTest {

    @Test
    public void testApplicationUsingKeyboard(){
        var textBoxPage = homePage.goToElements().clickTextBox();
        textBoxPage.setFullName("Jack Rich");
        textBoxPage.setEmail("jackson@gmail.com");
        textBoxPage.setCurrentAddress("5892 New York");
        textBoxPage.setCurrentAddress("Washington");
        textBoxPage.clickSubmitButton();

        String actualAddress = textBoxPage.getCurrentAddress();
        assertTrue(actualAddress.contains("5892 New York"));
    }
}
