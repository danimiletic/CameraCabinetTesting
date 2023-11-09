package landingpage.pageobjects;

import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class KitsPageObjects {

    WebDriver driver;

    public KitsPageObjects(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "kitsHeader")
    WebElement kitsHeader;

    @FindBy(id = "kitsPara")
    WebElement kitsPara;

    @FindBy(id = "addKitBtn")
    WebElement addKitBtn;

    @FindBy(id = "kitName")
    WebElement kitName;


}
