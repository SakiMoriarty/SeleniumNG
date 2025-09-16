package com.demoqa.tests.part3.widgets;

import com.demoqa.BaseTest;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

public class DateTest extends BaseTest {

    @Test
    public void testSelectingDate(){
        String month = "October";
        String monthNumber = "10";
        String day = "28";
        String year = "2030";
        var datePickerPage = homePage.goToWidgets().clickDatePicker();
        datePickerPage.clickSelectedDate();
        datePickerPage.selectMonth(month);
        datePickerPage.selectYear(year);
        datePickerPage.clickDay(day);

        String actualDate = datePickerPage.getDate();
        String expectedDate = monthNumber + "/" + day + "/" + year;
        assertEquals(actualDate, expectedDate,
                "Actual and Expected Dates Do Not Match");
    }
}
