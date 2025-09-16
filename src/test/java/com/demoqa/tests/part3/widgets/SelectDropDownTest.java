package com.demoqa.tests.part3.widgets;

import com.demoqa.BaseTest;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

import java.util.List;

public class SelectDropDownTest extends BaseTest {

    @Test
    public void testMultiSelectDropDown(){
        var selectMenuPage = homePage.goToWidgets().clickSelectMenu();
        selectMenuPage.selectStandardMulti("Volvo");
        selectMenuPage.selectStandardMulti(1);
        selectMenuPage.selectStandardMulti("Audi");
        selectMenuPage.selectStandardMulti(2);

        selectMenuPage.deselectStandardMulti("saab");
        List<String> actualSelectedOptions =
                selectMenuPage.getAllSelectedStandardMultiOptions();
        assertTrue(actualSelectedOptions.contains("Volvo"));
        assertTrue(actualSelectedOptions.contains("Opel"));
        assertFalse(actualSelectedOptions.contains("Saab"));
        assertTrue(actualSelectedOptions.contains("Audi"));
    }
}
