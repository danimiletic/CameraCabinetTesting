package com.cameracabinet.webpages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class RegisterPage {
    private WebDriver driver;

    // Locators
    @FindBy(xpath = "//*[contains(text(), 'Error: Please enter valid email address.')]")
    WebElement invalidEmail;
    @FindBy(id = "registerHeader")
    private WebElement registerHeader;

    @FindBy(id = "firstName")
    private WebElement firstName;

    @FindBy(id = "lastName")
    private WebElement lastName;

    @FindBy(id = "email")
    private WebElement userEmail;

    @FindBy(id = "password")
    private WebElement userPassword;

    @FindBy(id = "passwordConfirmation")
    private WebElement passwordConfirmation;

    @FindBy(id = "submitBtn")
    private WebElement submitBtn;

    @FindBy(id = "logoutBtn")
    private WebElement logoutBtn;

    @FindBy(id = "loginBtn")
    private WebElement loginBtn;

    // Constructor
    public RegisterPage(WebDriver driver) {
        this.driver = driver;

        // Initialize elements
        PageFactory.initElements(driver, this);
    }

    public boolean isPageOpened() {
        return registerHeader.isDisplayed();
    }

    public boolean isUserLoggedIn() {
        return logoutBtn.isDisplayed();
    }

    public boolean checkUserLoggedOut() { return loginBtn.isDisplayed(); }

    public void clickAlertPopUp() {
        Alert ok = driver.switchTo().alert();
        ok.accept();
    }

    public boolean checkEmailIsValid() {
        return invalidEmail.isDisplayed();
    }

    public void setFirstName(String fName) {
        firstName.clear();
        firstName.sendKeys(fName);
    }

    public void setLastName(String lName) {
        lastName.clear();
        lastName.sendKeys(lName);
    }

    public void setEmail(String email) {
        userEmail.clear();
        userEmail.sendKeys(email);
    }

    public void setPassword(String password) {
        userPassword.clear();
        userPassword.sendKeys(password);
    }

    public void setUserPasswordConfirmation(String passwordConf) {
        passwordConfirmation.clear();
        passwordConfirmation.sendKeys(passwordConf);
    }

    public void clickSubmitButton() {
        submitBtn.click();
    }

    public void waitToRender() throws InterruptedException {
        Thread.sleep(1000);
    }
}
