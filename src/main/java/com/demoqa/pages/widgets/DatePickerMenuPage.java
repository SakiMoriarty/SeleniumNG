package com.demoqa.pages.widgets;

import org.openqa.selenium.By;

import static utilities.DropDownUtility.selectByVisibleText;
import static utilities.JavaScriptUtility.clickJS;

public class DatePickerMenuPage extends WidgetsPage{

    private final By slectedDateField = By.id("datePickerMonthYearInput");
    private final By monthDropDown = By.cssSelector(".react-datepicker__month-select");
    private final By yearDropDown = By.cssSelector(".react-datepicker__year-select");

    private By dayValue(String day){
        return By.xpath("//div[contains(@class,'react-datepicker__day react-datepicker__day--')][text()='"+ day +"']");
    }

    public void clickDay(String day){
        clickJS(dayValue(day));
    }

    public boolean isDayInMonth(String day){
        return find(dayValue(day)).isDisplayed();
    }

    public void clickSelectedDate(){
        click(slectedDateField);
    }

    public String getDate(){
        return find(slectedDateField).getAttribute("value");
    }

    public void selectMonth(String month){
        selectByVisibleText(monthDropDown, month);
    }

    public void selectYear(String year){
        selectByVisibleText(yearDropDown, year);
    }
}
