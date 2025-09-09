package com.demoqa.tests.part3.forms;

import com.demoqa.base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;

public class CheckBoxTest extends BaseTest {

    @Test
    public void testCheckBox(){
        var formsPage = homePage.goToForms().clickPracticeForm();
        formsPage.clickSportsHobbyCheckBox();
        formsPage.clickReadingHobbyCheckBox();
        formsPage.clickMusicHobbyCheckBox();
        formsPage.unclickReadingHobbyCheckBox();

        boolean isReadingCheckBoxSelected = formsPage.isReadingSelected();
        assertFalse(isReadingCheckBoxSelected, "Reading Checkbox is Selected");
    }
}
