package com.demoqa.tests.part3.elements;

import com.demoqa.base.BaseTest;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

public class WebTableTest extends BaseTest {

    @Test
    public void testWebTable(){
        String email = "kierra@example.com";
        String expectedAge = "34";

        var webTablePage = homePage.goToElements().clickWebTables();
        webTablePage.clickEdit(email);
        webTablePage.setAge("34");
        webTablePage.clickSubmitButton();
        String actualAge = webTablePage.getTableAge(email);
        assertEquals(actualAge, expectedAge, "Actual and Expected ages Do Not Match");
    }
}
