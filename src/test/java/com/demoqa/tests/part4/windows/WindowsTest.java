package com.demoqa.tests.part4.windows;

import com.demoqa.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.*;
import static utilities.GetUtility.getURL;

public class WindowsTest extends BaseTest {

    @Test
    public void testNewWindowURL(){
        var windowsPage = homePage.goToAlertsFramesWindowsCard().clickBrowserWindows();
        windowsPage.clickNewWindowButton();
        windowsPage.switchToNewWindow();
        String actualURL = getURL();
        String expectedURL = "https://demoqa.com/sample";
        assertEquals(actualURL, expectedURL,
                "Actual and Expected URL's Do Not Match");
    }
}
