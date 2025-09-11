package com.demoqa.pages.elements;

import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.scrollToElementJS;

public class LinksPage extends ElementsPage{

    private final By badRequestLink = By.id("bad-request");
    private final By responseLink = By.id("linkResponse");

    public void clickBadRequestLink(){
        scrollToElementJS(badRequestLink);
        click(badRequestLink);
    }

    public String getResponse(){
        delay(2000);
        return find(responseLink).getText();
    }
}
