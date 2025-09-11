package com.demoqa.pages.alerts_frames_windows;

import com.demoqa.pages.HomePage;
import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.scrollToElementJS;

public class Alerts_Frames_WindowsPage extends HomePage {

    private final By modalDialogsMenuItem = By.xpath("//li[@id='item-4']/span[text()='Modal Dialogs']");
    private final By alertsMenuItem = By.xpath("//li[@id='item-1']/span[text()='Alerts']");
    private final By framesMenuItem = By.xpath("//li[@id='item-2']/span[text()='Frames']");
    private final By browserWindowsMenuItem = By.xpath("//li[@id='item-0']/span[text()='Browser Windows']");

    public AlertsPage clickAlerts(){
        scrollToElementJS(alertsMenuItem);
        click(alertsMenuItem);
        return new AlertsPage();
    }

    public ModalDialogsPage clickModalDialogs(){
        scrollToElementJS(modalDialogsMenuItem);
        click(modalDialogsMenuItem);
        return new ModalDialogsPage();
    }

    public FramesPage clickFrames(){
        scrollToElementJS(framesMenuItem);
        click(framesMenuItem);
        return new FramesPage();
    }

    public BrowserWindowsPage clickBrowserWindows(){
        scrollToElementJS(browserWindowsMenuItem);
        click(browserWindowsMenuItem);
        return new BrowserWindowsPage();
    }
}
