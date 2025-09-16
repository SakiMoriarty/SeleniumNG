package com.demoqa.tests.part4.interactions;

import com.demoqa.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SliderTest extends BaseTest {

    @Test
    public void testSliderResult(){
        int x = 180;
        int y = 0;
        var sliderPage = homePage.goToWidgets().clickSlider();
        sliderPage.moveSlider(x, y);
        String actualValue = sliderPage.getSliderValue();
        String expectedValue = "85";
        assertEquals(actualValue, expectedValue,
                "Actual and Expected value Do Not Match");
    }
}
