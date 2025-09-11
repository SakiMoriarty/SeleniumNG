package com.demoqa.tests.part4.alerts;

import com.demoqa.base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.*;
import static utilities.SwitchToUtility.acceptAlert;
import static utilities.SwitchToUtility.getAlertText;

public class AlertsTest extends BaseTest {

    @Test
    public void testInformationAlert(){
        String expectedAlertText = "You clicked a button";
        var alertsPage = homePage.goToAlertsFramesWindowsCard().clickAlerts();
        alertsPage.clickInformationAlertButton();

        assertEquals(getAlertText(), expectedAlertText,
                "\n Actual and Expected Message Do Not match");
        acceptAlert();
    }
}
