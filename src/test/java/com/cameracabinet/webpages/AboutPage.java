package com.cameracabinet.webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AboutPage {
    WebDriver driver;

    // Locators
    @FindBy(id = "teamHeader")
    private WebElement teamHeader;

    @FindBy(id = "daniImg")
    private WebElement daniImg;

    @FindBy(id = "dannyImg")
    private WebElement dannyImg;

    @FindBy(id = "danielImg")
    private WebElement danielImg;

    @FindBy(id = "haileyImg")
    private WebElement haileyImg;

    @FindBy(id = "madiImg")
    private WebElement madiImg;

    // Constructor
    public AboutPage(WebDriver driver) {
        this.driver = driver;

        PageFactory.initElements(driver, this);
    }

}
