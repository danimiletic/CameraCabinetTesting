package landingpage.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AboutPageObjects {

    WebDriver driver;
    public AboutPageObjects(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "teamHeader")
    WebElement teamHeader;

    // dani elements
    @FindBy(id = "daniHeader")
    WebElement daniHeader;
    @FindBy(id = "daniImg")
    WebElement daniImg;

    // danny elements
    @FindBy(id = "dannyHeader")
    WebElement dannyHeader;
    @FindBy(id = "dannyImg")
    WebElement dannyImg;

    // daniel elements
    @FindBy(id = "danielHeader")
    WebElement danielHeader;
    @FindBy(id = "danielImg")
    WebElement danielImg;

    // hailey elements
    @FindBy(id = "haileyHeader")
    WebElement haileyHeader;
    @FindBy(id = "haileyImg")
    WebElement haileyImg;

    // madi elements
    @FindBy(id = "madiHeader")
    WebElement madiHeader;
    @FindBy(id = "madiImg")
    WebElement madiImg;

}
