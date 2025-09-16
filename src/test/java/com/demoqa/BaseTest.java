package com.demoqa;

import com.demoqa.pages.HomePage;
import com.BasePage;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static com.BasePage.delay;
import static utilities.Utility.setUtilityDriver;

public class BaseTest {

    private WebDriver driver;
    protected BasePage basePage;
    protected HomePage homePage;
    private final String DEMOQA_URL = "https://demoqa.com/";

    @BeforeClass
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @BeforeMethod
    public void loadApplication(){
        driver.get(DEMOQA_URL);
        basePage = new BasePage();
        basePage.setDriver(driver);
        setUtilityDriver();
        homePage = new HomePage();
    }

    @AfterMethod
    public void takeFailedResultScreenshot(ITestResult testResult){
        if(ITestResult.FAILURE == testResult.getStatus()){
            TakesScreenshot screenshot = (TakesScreenshot) driver;
            File source = screenshot.getScreenshotAs(OutputType.FILE);

            String testName = testResult.getTestName();
            if (testName == null || testName.isEmpty()) {
                testName = testResult.getMethod().getMethodName();
            }

            String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yy-MM-dd HH-mm"));
            String fileName = timestamp + " " + testName + ".png";

            File destination = new File(System.getProperty("user.dir") +
                    "/resources/screenshots/" + fileName);
            try {
                Files.copy(source.toPath(), destination.toPath());
            } catch (IOException e){
                throw new RuntimeException(e);
            }
            System.out.println("Screenshot Located At" + destination);
        }
    }

    @AfterClass
    public void tearDown(){
        delay(2000);
        driver.quit();
    }
}
