package com.demoqa.pages.Forms;

import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.clickJS;
import static utilities.JavaScriptUtility.scrollToElementJS;

public class PracticeFormPage extends FormsPage{

    private final By femaleRadioButton = By.id("gender-radio-2");
    private final By sportsHobbyCheckBox = By.id("hobbies-checkbox-1");
    private final By readingHobbyCheckBox = By.id("hobbies-checkbox-2");
    private final By musicHobbyCheckBox = By.id("hobbies-checkbox-3");

    public void clickFemaleRadioButton(){
        scrollToElementJS(femaleRadioButton);
        clickJS(femaleRadioButton);
    }

    public boolean isRadioButtonSelected(){
        return find(femaleRadioButton).isSelected();
    }

    public void clickSportsHobbyCheckBox(){
        if(!find(sportsHobbyCheckBox).isSelected()){
            scrollToElementJS(sportsHobbyCheckBox);
            clickJS(sportsHobbyCheckBox);
        }
    }

    public void clickReadingHobbyCheckBox(){
        if(!find(readingHobbyCheckBox).isSelected()){
            scrollToElementJS(readingHobbyCheckBox);
            clickJS(readingHobbyCheckBox);
        }
    }

    public void clickMusicHobbyCheckBox(){
        if(!find(musicHobbyCheckBox).isSelected()){
            scrollToElementJS(musicHobbyCheckBox);
            clickJS(musicHobbyCheckBox);
        }
    }

    public void unclickReadingHobbyCheckBox(){
        if(find(readingHobbyCheckBox).isSelected()){
            scrollToElementJS(readingHobbyCheckBox);
            clickJS(readingHobbyCheckBox);
        }
    }

    public boolean isReadingSelected(){
        return find(readingHobbyCheckBox).isSelected();
    }
}
