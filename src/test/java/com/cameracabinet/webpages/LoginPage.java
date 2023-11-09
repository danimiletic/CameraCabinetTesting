package com.cameracabinet.webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {
    WebDriver driver;

    // Locators

    @FindBy(id ="camHeader")
    private WebElement camHeader;

    @FindBy(id = "loginHeader")
    private WebElement loginHeader;

    @FindBy(id = "email")
    private WebElement userEmail;

    @FindBy(id = "password")
    private WebElement userPassword;

    @FindBy(id = "submitBtn")
    private WebElement submitBtn;

    // Constructor
    public LoginPage(WebDriver driver) {
        this.driver = driver;

        PageFactory.initElements(driver, this);
    }

    public void inputUserEmail(String email) {
        userEmail.clear();
        userEmail.sendKeys(email);
    }

    public void inputUserPassword(String password) {
        userPassword.clear();
        userPassword.sendKeys(password);
    }

    public void clickSubmitButton() {
        submitBtn.click();
    }

    public boolean isPageOpened() {
        return loginHeader.getText().contains("Login");
    }

    public void waitToRender() {
        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(d -> camHeader.isDisplayed());
    }
}
