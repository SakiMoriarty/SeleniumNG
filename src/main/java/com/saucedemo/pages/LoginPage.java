package com.saucedemo.pages;

import com.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {

    private final By usernameField = By.id("user-name");
    private final By passwordField = By.id("password");
    private final By loginButton = By.id("login-button");
    private final By errorMessage = By.cssSelector("#login_button_container h3");

    public void setUsername(String username){
        set(usernameField, username);
    }

    public void setPassword(String password){
        set(passwordField, password);
    }

    public ProductsPage clickLoginButton(){
        click(loginButton);
        return new ProductsPage();
    }

    public ProductsPage logInApplication(String username, String password){
        setUsername(username);
        setPassword(password);
        return clickLoginButton();
    }

    public String getErrorMessage(){
        try {
            WebElement element = find(errorMessage);
            if(element.isDisplayed()){
                return find(errorMessage).getText();
            } else {
                return "Element Not Visible";
            }
        } catch (NoSuchElementException e){
            System.out.println("Element 'errorMessage Not Found' " + e.getMessage());
            return "Error message Not Found";
        }
    }
}
