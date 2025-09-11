package com.demoqa.pages.alerts_frames_windows;

import org.openqa.selenium.By;

import java.util.Set;

import static utilities.SwitchToUtility.*;

public class BrowserWindowsPage extends Alerts_Frames_WindowsPage{

    private final By newWindowButton = By.id("windowButton");

    public void clickNewWindowButton(){
        click(newWindowButton);
    }

    public void switchToNewWindow(){
       String currentHandle = driver.getWindowHandle();
       System.out.println("Main Window ID: " + currentHandle);

       Set<String> allHandels = driver.getWindowHandles();
       System.out.println("Number of Open Windows: " + allHandels.size());

       for (String handle : allHandels){
           if(currentHandle.equals(handle)){
               System.out.println("First Window ID: " + handle);
           } else {
               switchToWindow(handle);
               System.out.println("Second Window ID: " + handle);
           }
       }
    }
}
