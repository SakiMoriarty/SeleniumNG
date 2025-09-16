package com.demoqa.tests.part3.forms;

import com.demoqa.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class RadioButtonTest extends BaseTest {

    @Test
    public void testRadioButton(){
        var formsPage = homePage.goToForms().clickPracticeForm();
        formsPage.clickFemaleRadioButton();
        boolean isRadioButtonSelected = formsPage.isRadioButtonSelected();
        assertTrue(isRadioButtonSelected, "Button is NOT selected");
    }
}
