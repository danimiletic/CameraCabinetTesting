package com.cameracabinet.webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class KitsPage {

    private WebDriver driver;

    // Locators
    @FindBy(id = "kitsHeader")
    private WebElement kitsHeader;

    @FindBy(id = "kitsPara")
    private WebElement kitsPara;

    @FindBy(id = "kitImg")
    private WebElement kitImg;

    @FindBy(id = "kitName")
    private WebElement kitName;

    @FindBy(id = "addKitBtn")
    private WebElement addKitBtn;

    @FindBy(className = "modal-content")
    private WebElement modalContent;

    @FindBy(id = "kitInfo")
    private WebElement kitInfo;

    @FindBy(id = "kitNameInput")
    private WebElement kitNameInput;

    @FindBy(id = "kitDescInput")
    private WebElement kitDescInput;

    @FindBy(id = "kitImgInput")
    private WebElement kitImgInput;

    @FindBy(id = "kitModalSub")
    private WebElement kitModalSub;

    @FindBy(className = "btn-close")
    private WebElement closeModalBtn;

    // Constructor
    public KitsPage(WebDriver driver) {
        this.driver = driver;

        // Initialize elements
        PageFactory.initElements(driver, this);

    }

    public boolean isPageOpened() {
        return kitsHeader.getText().contains("YOUR KITS");
    }

    public void clickAddButton() {
        addKitBtn.click();
    }

    public boolean isModalOpen() {
        return kitInfo.getText().contains("Kit Information");
    }

    public void inputKitName(String name) {
        kitNameInput.clear();
        kitNameInput.sendKeys(name);
    }

    public void inputKitDescription(String desc) {
        kitDescInput.clear();
        kitDescInput.sendKeys(desc);
    }

    public void inputKitImage(String image) {
        kitImgInput.clear();
        kitImgInput.sendKeys(image);
    }

    public boolean checkEditedKit() {
        return kitName.getText().contains("City Photography");
    }

    public void clickModalSubmitButton() {
        kitModalSub.click();
    }

    public void closeModal() {
        closeModalBtn.click();
    }

    public void waitToRender() throws InterruptedException {
        Thread.sleep(1000);
    }

    public void clickKitImage() {
        kitImg.click();
    }

    public void addThreeKits(String name, String desc, String image) throws InterruptedException {
        int i = 0;
        while (i < 3) {
            clickAddButton();
            kitNameInput.clear();
            kitNameInput.sendKeys(name);
            kitDescInput.clear();
            kitDescInput.sendKeys(desc);
            kitImgInput.clear();
            kitImgInput.sendKeys(image);
            clickModalSubmitButton();
            closeModal();
            waitToRender();
            Thread.sleep(1000);
            i++;
        }
    }

}
