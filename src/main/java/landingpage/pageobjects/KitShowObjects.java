package landingpage.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KitShowObjects {

    WebDriver driver;
    public KitShowObjects(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // KITSHOW WEB ELEMENTS
    @FindBy(id = "kitImg")
    WebElement kitImg;

    @FindBy(id = "kitDesc")
    WebElement kitDesc;

    @FindBy(id = "editBtn")
    WebElement kitEditBtn;

    @FindBy(id = "deleteBtn")
    WebElement kitDeleteBtn;

    // KIT MODAL ELEMENTS
    @FindBy(className = "div.modal-content")
    WebElement kitModal;

    @FindBy(id ="kitModalInfo")
    WebElement kitModalInfo;

    @FindBy(className = "button.button-close")
    WebElement kitModalClose;

    // SAME ID NAME AS EDIT MODAL
    // MUST CLICK EDIT BUTTON TO EDIT
    // MUST CLICK ADD BUTTON TO ADD

    // kit name elements
    @FindBy(id = "kitNameTxt")
    WebElement kitNameTxt;
    @FindBy(id = "kitNameInput")
    WebElement kitNameInput;

    // kit description elements
    @FindBy(id = "kitDescTxt")
    WebElement kitDescTxt;
    @FindBy(id = "kitDescInput")
    WebElement kitDescInput;

    // kit image elements
    @FindBy(id = "kitImgInput")
    WebElement kitImgInput;
    @FindBy(id = "kitModalSub")
    WebElement kitModalSub;

    // GEAR ELEMENTS ON KIT SHOW
    @FindBy(id = "camPartsTxt")
    WebElement camPartsTxt;

    @FindBy(id = "addGearBtn")
    WebElement addGearBtn;

    // gear must be created first
    @FindBy(id ="gearDesc")
    WebElement gearDesc;

    // GEAR MODAL ELEMENTS
    @FindBy(id = "gearInfo")
    WebElement gearInfo;

    @FindBy(className = "button.button-close")
    WebElement gearModalClose;

    //gear name elements
    @FindBy(id = "gearNameTxt")
    WebElement gearNameTxt;
    @FindBy(id = "gearNameInput")
    WebElement gearNameInput;

    // gear make elements
    @FindBy(id ="gearMakeTxt")
    WebElement gearMakeTxt;
    @FindBy(id = "gearMakeInput")
    WebElement gearMakeInput;

    // gear description elements
    @FindBy(id = "gearDescTxt")
    WebElement gearDescTxt;
    @FindBy(id = "gearDescInput")
    WebElement gearDescInput;

    // gear image elements
    @FindBy(id = "gearImgTxt")
    WebElement gearImgTxt;
    @FindBy(id = "gearImgInput")
    WebElement gearImgInput;

    // gear price elements
    @FindBy(id = "gearPriceTxt")
    WebElement gearPriceTxt;
    @FindBy(id = "gearPriceInput")
    WebElement gearPriceInput;

    // gear bought elements
    @FindBy(id = "gearBoughtTxt")
    WebElement gearBoughtTxt;
    @FindBy(id = "gearBoughtInput")
    WebElement gearBoughtInput;

    @FindBy(id = "gearModalSub")
    WebElement gearModalSub;


}
