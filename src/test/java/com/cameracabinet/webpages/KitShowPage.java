package com.cameracabinet.webpages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;
import java.util.Objects;

public class KitShowPage {

    WebDriver driver;

    // Locators

    @FindBy(id = "homeBtn")
    private WebElement homeBtn;

    @FindBy(id = "kitShowHeader")
    private WebElement kitShowHeader;

    @FindBy(id = "kitShowImg")
    private WebElement kitShowImg;

    @FindBy(id = "kitShowDesc")
    private WebElement kitShowDesc;

    @FindBy(id = "kitEditBtn")
    private WebElement kitEditBtn;

    @FindBy(id = "kitDeleteBtn")
    private WebElement kitDeleteBtn;

    @FindBy(id = "kitModalInfo")
    private WebElement kitModalInfo;

    @FindBy(className = "btn-close")
    private WebElement modalCloseBtn;

    @FindBy(id = "kitNameInput")
    private WebElement kitNameInput;

    @FindBy(id = "kitDescInput")
    private WebElement kitDescInput;

    @FindBy(id = "kitImgInput")
    private WebElement kitImgInput;

    @FindBy(id = "kitModalSub")
    private WebElement kitModalSub;

    @FindBy(id = "camPartsHeader")
    private WebElement camPartsHeader;

    @FindBy(id = "gearDesc")
    private WebElement gearDesc;

    @FindBy(id = "addGearBtn")
    private WebElement addGearBtn;

    @FindBy(id = "gearModalInfo")
    private WebElement gearModalHeader;

    @FindBy(id = "gearNameInput")
    private WebElement gearNameInput;

    @FindBy(id = "gearDescInput")
    private WebElement gearDescInput;

    @FindBy(id = "gearImgInput")
    private WebElement gearImgInput;

    @FindBy(id = "gearPriceInput")
    private WebElement gearPriceInput;

    @FindBy(id = "gearBoughtInput")
    private WebElement gearBoughtInput;

    @FindBy(id = "gearModalSub")
    private WebElement gearModalSub;

    // Constructor
    public KitShowPage(WebDriver driver) {
        this.driver = driver;

        //Initialize elements
        PageFactory.initElements(driver, this);
    }

    public boolean checkKitExists() {
        return kitShowHeader.getText().contains("Outdoor Photography");
    }

    public boolean isPageOpened() {
        return kitShowImg.isDisplayed();
    }

    public boolean isModalOpen() {
        return kitModalInfo.getText().contains("Kit Information");
    }

    public void clickEditButton() {
        kitEditBtn.click();
    }

    public void clickDeleteBtn() {
        kitDeleteBtn.click();
    }

    public void clickHomeBtn() {
        homeBtn.click();
    }

    public void editKitName(String newName) {
        kitNameInput.clear();
        kitNameInput.sendKeys(newName);
    }

    public void editKitDescription(String newDesc) {
        kitDescInput.clear();
        kitDescInput.sendKeys(newDesc);
    }

    public void editKitImg(String img) {
        kitImgInput.clear();
        kitImgInput.sendKeys(img);
    }

    public void clickModalSubButton() {
        kitModalSub.click();
    }

    // Can use for Kit modal and gear modal
    public void closeModal() {
        modalCloseBtn.click();
    }

    public void clickAddGearButton() {
        addGearBtn.click();
    }

    public boolean checkGearModalIsOpen() {
        return gearModalHeader.getText().contains("Gear Information");
    }

    public boolean checkGearExists() {
        return gearDesc.getText().contains("Nikon Film Roll");
    }

    public boolean checkEditedGearExists() {
        return gearDesc.getText().contains("Nikon Roll");
    }

    public void addGearName(String gearName) {
        gearNameInput.clear();
        gearNameInput.sendKeys(gearName);
    }

    public void addGearDescription(String gearDesc) {
        gearDescInput.clear();
        gearDescInput.sendKeys(gearDesc);
    }

    public void addGearImage(String gearImage) {
        gearImgInput.clear();
        gearImgInput.sendKeys(gearImage);
    }

    public void addGearPrice(String gearPrice) {
        gearPriceInput.clear();
        gearPriceInput.sendKeys(gearPrice);
    }

    public void addGearBought(String gearBought) {
        gearBoughtInput.clear();
        gearBoughtInput.sendKeys(gearBought);
    }

    public void clickGearModalSubButton() {
        gearModalSub.click();
    }

    public void clickGearDescLink() {
        gearDesc.click();
    }

    public void clickAlertPopUp() {
        Alert ok = driver.switchTo().alert();
        ok.accept();
    }

    public void waitToRender() throws InterruptedException {
        Thread.sleep(1000);
    }

    public void scrollToAddGear() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", addGearBtn);
    }

    public void scrollToGearDesc() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", gearDesc);
    }
}
