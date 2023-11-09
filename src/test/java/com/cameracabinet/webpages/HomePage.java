package com.cameracabinet.webpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {
    private WebDriver driver;

    // Page URL
    private static String PAGE_URL = "http://localhost:3000/";

    // Locators
    @FindBy(id = "homeBtn")
    private WebElement homeBtn;

    @FindBy(id = "loginBtn")
    private WebElement loginBtn;

    @FindBy(id = "registerBtn")
    private WebElement registerBtn;

    @FindBy(id = "logoutBtn")
    private WebElement logoutBtn;

    @FindBy(id = "kitsBtn")
    private WebElement kitsBtn;

    @FindBy(id = "aboutBtn")
    private WebElement aboutBtn;

    @FindBy(id = "camHeader")
    private WebElement camHeader;

    @FindBy(id = "camPara")
    private WebElement camPara;

    @FindBy(id = "camImg")
    private WebElement camImg;

    @FindBy(id = "logoImg")
    private WebElement logoImg;

    // Constructor
    public HomePage(WebDriver driver) {
        this.driver = driver;
        driver.get(PAGE_URL);
        //Initialise Elements
        PageFactory.initElements(driver, this);
    }

    public boolean isPageOpened() {
        return camHeader.getText().contains("Camera Cabinet");
    }

    public boolean checkUserLoggedIn() {
        return logoutBtn.isDisplayed();
    }

    public boolean checkUserIsLoggedOut() {
        if (loginBtn.isDisplayed()) {
            return true;
        } else {
            return false;
        }
    }

    public void navigateToKitPage() {
        kitsBtn.click();
    }

    public void navigateToAboutUs() {
        aboutBtn.click();
    }

    public void navigateToLogin() {
        loginBtn.click();
    }

    public void navigateToHome() {
        homeBtn.click();
    }

    public void navigateToRegister() {
        registerBtn.click();
    }

    public void logoutOfAccount() {
        logoutBtn.click();
    }

    public void waitToRender() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }
}
