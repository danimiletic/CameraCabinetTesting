package landingpage.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NavbarObjects {

    WebDriver driver;

    public NavbarObjects(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // ONLY USED WHEN USER IS LOGGED OUT
    @FindBy(id = "loginBtn")
    WebElement loginBtn;

    @FindBy(id = "registerBtn")
    WebElement registerBtn;

    // "Camera Cabinet" home page button
    @FindBy(id = "homeBtn")
    WebElement homeBtn;

    @FindBy(id = "profileBtn")
    WebElement profileBtn;

    @FindBy(id = "kitsBtn")
    WebElement kitsBtn;

    @FindBy(id = "aboutBtn")
    WebElement aboutBtn;

    @FindBy(id = "logoutBtn")
    WebElement logoutBtn;
}
