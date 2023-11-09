package landingpage.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebElement;

public class GearShowObjects {

    WebDriver driver;

    public GearShowObjects(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // GEARSHOW PAGE ELEMENTS
    @FindBy(id = "gearName")
    WebElement gearName;

    @FindBy(id = "gearDesc")
    WebElement gearDesc;

    @FindBy(id = "gearPrice")
    WebElement gearPrice;

    @FindBy(id = "gearMake")
    WebElement gearMake;

    @FindBy(id = "gearBought")
    WebElement gearBought;

    @FindBy(id = "gearEditBtn")
    WebElement gearEditBtn;

    @FindBy(id = "gearDeleteBtn")
    WebElement gearDeleteBtn;

    // GEAR MODAL ELEMENTS

    // SAME ID NAME AS EDIT MODAL
    // MUST CLICK EDIT BUTTON TO EDIT
    // MUST CLICK ADD BUTTON TO ADD

    @FindBy(id = "gearModalInfo")
    WebElement gearModalInfo;

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
