package com.saucedemo.tests.login;

import com.saucedemo.BaseTest;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

public class LoginTests extends BaseTest {

    @Test
    public void testLoginErrorMessage(){
        loginPage.setUsername("standard_user");
        loginPage.setPassword("1234567890");
        loginPage.clickLoginButton();
        String actualMessage = loginPage.getErrorMessage();
        assertTrue(actualMessage.contains("Epic sadface"));
    }
}
