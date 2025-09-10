package com.demoqa.pages.widgets;

import org.openqa.selenium.By;

import static utilities.DropDownUtility.selectByVisibleText;

public class DatePickerMenuPage extends WidgetsPage{

    private By slectedDateField = By.id("datePickerMonthYearInput");
    private By monthDropDown = By.cssSelector(".react-datepicker__month-select");
    private By yearDropDown = By.cssSelector(".react-datepicker__year-select");

    private By dayValue(String day){
        return By.xpath("//div[contains(@class,'react-datepicker__day react-datepicker__day--')][text()='"+ day +"']");
    }

    public void clickDay(String day){
        click(dayValue(day));
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
