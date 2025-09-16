package com.demoqa.tests.part4.modals;

import com.demoqa.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ModalTest extends BaseTest {

    @Test
    public void testModalDialog(){
        var afwPage = homePage.goToAlertsFramesWindowsCard();
        var modalDialogsPage = afwPage.clickModalDialogs();
        modalDialogsPage.clickSmallModalButton();
        String actualText = modalDialogsPage.getSmallModalText();
        assertTrue(actualText.contains("Small Modal"),
                "\n The Message Does Not Contain 'small modal' \n");
        modalDialogsPage.clickCloseButton();
    }
}
