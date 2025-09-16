package com.demoqa.tests.part4.screenshot;

import com.demoqa.BaseTest;
import org.testng.annotations.Test;

public class CaptureFailedScreenshot extends BaseTest {

    @Test
    public void testClickingSubmitButtonWithoutJS(){
        var practiceFormPage = homePage.goToForms().clickPracticeForm();
        practiceFormPage.clickSubmitButton();
    }
}
