package com.cameracabinet.webpages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class GearShowPage {
    WebDriver driver;

    // Locators
    @FindBy(id = "gearName")
    private WebElement gearHeader;

    @FindBy(id = "gearNameInput")
    private WebElement gearNameInput;

    @FindBy(id = "gearImgInput")
    private WebElement gearImgInput;

    @FindBy(id = "gearDescInput")
    private WebElement gearDescInput;

    @FindBy(id = "gearPriceInput")
    private WebElement gearPriceInput;

    @FindBy(id = "gearMakeInput")
    private WebElement gearMakeInput;

    @FindBy(id = "gearBoughtInput")
    private WebElement gearBoughtInput;

    @FindBy(id = "gearEditBtn")
    private WebElement gearEditBtn;

    @FindBy(id = "gearDeleteBtn")
    private WebElement gearDeleteBtn;

    @FindBy(id = "gearModalInfo")
    private WebElement gearModalInfo;

    @FindBy(id = "gearModalSub")
    private WebElement gearModalSub;

    @FindBy(id = "btn-close")
    private WebElement modalCloseBtn;

    // Constructor
    public GearShowPage(WebDriver driver) {
        this.driver = driver;

        //Initialize elements
        PageFactory.initElements(driver, this);
    }

    public boolean checkCurrentPage(String url) {
        String currentUrl = driver.getCurrentUrl();
        if (currentUrl == url) {
            return true;
        } else {
            return false;
        }
    }

    public void clickEditBtn() {
        gearEditBtn.click();
    }

    public boolean checkModalIsOpen() {
        if (gearModalInfo.isDisplayed()) {
            return true;
        } else {
            return false;
        }
    }

    public void editPartName(String newName) {
        gearNameInput.clear();
        gearNameInput.sendKeys(newName);
    }

    public void editPartDesc(String newDesc) {
        gearDescInput.clear();
        gearDescInput.sendKeys(newDesc);
    }

    public void editPartImg(String newImg) {
        gearImgInput.clear();
        gearImgInput.sendKeys(newImg);
    }

    public void clickGearModalSubBtn() {
        gearModalSub.click();
    }

    // -- Come back to this --
    // validate that edited input have successfully updated

    public void closeGearModal() {
        modalCloseBtn.click();
    }
    public void scrollToDeleteBtn() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", gearDeleteBtn);
    }

    public void clickDeleteBtn() {
        gearDeleteBtn.click();
    }

    public void clickAlertPopUp() {
        Alert ok = driver.switchTo().alert();
        ok.accept();
    }

    public void waitToRender() throws InterruptedException {
        Thread.sleep(1000);
    }

    // -- Come back to this --
    // write function to check that if you delete the last kit,
    // you get redirected to KitShow page.
    // if there are a few gear parts, check that the one you
    // deleted was subtracted from the total number of gear parts
}
