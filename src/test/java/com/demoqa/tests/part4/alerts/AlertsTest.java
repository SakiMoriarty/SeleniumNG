package com.demoqa.tests.part4.alerts;

import com.demoqa.base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.*;
import static utilities.SwitchToUtility.*;

@Test
public class AlertsTest extends BaseTest {

    public void testInformationAlert(){
        String expectedAlertText = "You clicked a button";
        var alertsPage = homePage.goToAlertsFramesWindowsCard().clickAlerts();
        alertsPage.clickInformationAlertButton();

        assertEquals(getAlertText(), expectedAlertText,
                "\n Actual and Expected Message Do Not match");
        acceptAlert();
    }

    public void testConfirmationAlert(){
        var alertsPage = homePage.goToAlertsFramesWindowsCard().clickAlerts();
        alertsPage.clickConfirmationAlertButton();
        dismissAlert();
        String expectedConfirmationResult = "You selected Cancel";
        String actualConfirmationResult = alertsPage.getConfirmationResult();
        assertEquals(actualConfirmationResult, expectedConfirmationResult,
                "\n Did not selected cancel");
    }
}
