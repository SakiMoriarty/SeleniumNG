package com.demoqa.pages.alerts_frames_windows;

import org.openqa.selenium.By;

public class AlertsPage extends Alerts_Frames_WindowsPage{

    private final By informationAlertButton = By.id("alertButton");
    private final By confirmationAlertButton = By.id("confirmButton");
    private final By confirmationResult = By.id("confirmResult");
    private final By promptAlertButton = By.id("promtButton");
    private final By promptResult = By.id("promptResult");

    public void clickInformationAlertButton(){
        click(informationAlertButton);
    }

    public void clickConfirmationAlertButton(){
        click(confirmationAlertButton);
    }

    public String getConfirmationResult(){
        return find(confirmationResult).getText();
    }

    public void clickPromptAlertButton(){
        click(promptAlertButton);
    }

    public String getPromptAlertResult(){
        return find(promptResult).getText();
    }
}
