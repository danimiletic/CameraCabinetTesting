package com.cameracabinet.webpages;

import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class RegisterPage {
    private WebDriver driver;

    // Locators
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

    //  More concise syntax
    //  public boolean isPageOpened() {
    //  return registerHeader.getText().toString().contains("Register");
    // }

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

    public void waitToRender() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }
}
