package landingpage.pageobjects;

import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingObjects {
    WebDriver driver;

    public LandingObjects(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // PageFactory
    @FindBy(id = "camHeader")
    WebElement camHeader;

    @FindBy(id = "camPara")
    WebElement camPara;

    @FindBy(id = "camImg")
    WebElement camImg;

    @FindBy(id = "logoImg")
    WebElement logoImg;

//    public void checkElements() {
//        camHeader.contains()
//    }
}
