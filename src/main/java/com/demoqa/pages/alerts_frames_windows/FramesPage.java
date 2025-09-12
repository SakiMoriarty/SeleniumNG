package com.demoqa.pages.alerts_frames_windows;

import org.openqa.selenium.By;

import static utilities.SwitchToUtility.*;

public class FramesPage extends Alerts_Frames_WindowsPage{

    private final By textInFrame = By.id("sampleHeading");
    private final String iFrameBigBox = "frame1";
    private final By headerFramesText = By.xpath("//div[@id='app']//h1[text()='Frames']");
    private final By iFrameSmallBox = By.id("frame2");

    public String getTextInBigFrame(){
        switchToBigBox();
        String bigFrameText = find(textInFrame).getText();
        System.out.println("Big Frame Text: " + bigFrameText);
        switchToDefaultContent();
        return bigFrameText;
    }

    private void switchToBigBox(){
        switchToFrameString(iFrameBigBox);
    }

    public String getHeaderFramesText(){
        return find(headerFramesText).getText();
    }

    private void switchToSmallBox(){
        switchToFrameElement(find(iFrameSmallBox));
    }

    public String getTextInSmallFrame(){
        switchToSmallBox();
        String smallFrameText = find(textInFrame).getText();
        System.out.println("Small Frame Text: " + smallFrameText);
        switchToDefaultContent();
        return smallFrameText;
    }
}
