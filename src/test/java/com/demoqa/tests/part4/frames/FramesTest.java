package com.demoqa.tests.part4.frames;

import com.demoqa.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

@Test
public class FramesTest extends BaseTest {

    public void testFramesBigBox(){
        var framesPage = homePage.goToAlertsFramesWindowsCard().clickFrames();

        String actualBigBoxText = framesPage.getTextInBigFrame();
        String expectedBigBoxText = "This is a sample page";
        assertEquals(actualBigBoxText, expectedBigBoxText,
                "Actual and Expected text Do Not Match");

        String actualHeaderText = framesPage.getHeaderFramesText();
        String expectedHeaderText = "Frames";
        assertEquals(actualHeaderText, expectedHeaderText,
                "Actual and Expected Header text Do Not match");
    }

    public void testFramesSmallBox(){
        var framesPage = homePage.goToAlertsFramesWindowsCard().clickFrames();

        String actualSmallBoxText = framesPage.getTextInSmallFrame();
        String expectedSmallBoxText = "This is a sample page";
        assertEquals(actualSmallBoxText, expectedSmallBoxText,
                "Actual and Expected Text Do Not Match");

        String actualHeaderText = framesPage.getHeaderFramesText();
        String expectedHeaderText = "Frames";
        assertEquals(actualHeaderText, expectedHeaderText,
                "Actual and Expected header text Do Not match");
    }
}
