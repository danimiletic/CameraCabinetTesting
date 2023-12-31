package com.cameracabinet.tests;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.cameracabinet.webpages.HomePage;
import com.cameracabinet.webpages.RegisterPage;

import java.time.Duration;

public class UserRegisterTest {
    WebDriver driver;

    @Before
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.manage().window().maximize();
    }

    @Ignore
    @Test
    public void UserRegisterTest() {
//        Create HomePage objects
        HomePage home = new HomePage(driver);

//        Check if home page has opened
        Assert.assertTrue(home.isPageOpened());

//        Navigate to RegisterPage
        home.navigateToRegister();

//        Create RegisterPage object
        RegisterPage register = new RegisterPage(driver);

//        Assert page is opened
        Assert.assertTrue(register.isPageOpened());

//        Fill out user info
        register.setFirstName("Bobson");
        register.setLastName("Dugnutt");
        register.setEmail("bobsondugnutt@email.com");
        register.setPassword("bobson123");
        register.setUserPasswordConfirmation("bobson123");
        register.clickSubmitButton();

//        Check that we were navigated to HomePage
        Assert.assertTrue(home.checkUserLoggedIn());
    }

    @Ignore
    @Test
    public void CannotRegisterWithoutEmailUsername() {
//        Create HomePage object
        HomePage home = new HomePage(driver);

//        Check if page has opened
        Assert.assertTrue(home.isPageOpened());

//        Navigate to RegisterPage
        home.navigateToRegister();

//        Create RegisterPage object
        RegisterPage register = new RegisterPage(driver);

//        Assert page is opened
        Assert.assertTrue(register.isPageOpened());

//        Fill out user info
        register.setFirstName("Bobson");
        register.setLastName("Dugnutt");
        register.setEmail("@email.com");
        register.setPassword("bobson123");
        register.setUserPasswordConfirmation("bobson123");
        register.clickSubmitButton();
//        register.waitToRender();
//        This method checks if email alert is present with incorrect email.
//        This is not currently working
//        Assert.assertTrue(register.checkEmailIsValid());

//        Check that login failed by assert login button still exists
        Assert.assertTrue(register.checkUserLoggedOut());
    }

    @Ignore
    @Test
    public void CannotRegisterWithoutEmailDomainName() {
//        Create HomePage object
        HomePage home = new HomePage(driver);

//        Check if page has opened
        Assert.assertTrue(home.isPageOpened());

//        Navigate to RegisterPage
        home.navigateToRegister();

//        Create RegisterPage object
        RegisterPage register = new RegisterPage(driver);

//        Assert page is opened
        Assert.assertTrue(register.isPageOpened());

//        Fill out user info
        register.setFirstName("Bobson");
        register.setLastName("Dugnutt");
        register.setEmail("bobsondugnutt.com");
        register.setPassword("bobson123");
        register.setUserPasswordConfirmation("bobson123");
        register.clickSubmitButton();

//        Check that login failed by assert login button still exists
        Assert.assertTrue(register.checkUserLoggedOut());

    }

    @Ignore
    @Test
    public void CannotRegisterWithOnlyNumbersInEmail() {
//        Create HomePage objects
        HomePage home = new HomePage(driver);

//        Check if home page has opened
        Assert.assertTrue(home.isPageOpened());

//        Navigate to RegisterPage
        home.navigateToRegister();

//        Create RegisterPage object
        RegisterPage register = new RegisterPage(driver);

//        Assert page is opened
        Assert.assertTrue(register.isPageOpened());

//        Fill out user info
        register.setFirstName("Bobson");
        register.setLastName("Dugnutt");
        register.setEmail("12345");
        register.setPassword("bobson123");
        register.setUserPasswordConfirmation("bobson123");
        register.clickSubmitButton();

//        Check that we were navigated to HomePage
        Assert.assertTrue(register.checkUserLoggedOut());

    }

    @Test
    public void CannotRegisterIfPasswordsDoNotMatch() throws InterruptedException {
//        Create HomePage objects
        HomePage home = new HomePage(driver);

//        Check if home page has opened
        Assert.assertTrue(home.isPageOpened());

//        Navigate to RegisterPage
        home.navigateToRegister();

//        Create RegisterPage object
        RegisterPage register = new RegisterPage(driver);

//        Assert page is opened
        Assert.assertTrue(register.isPageOpened());

//        Fill out user info
        register.setFirstName("Bobson");
        register.setLastName("Dugnutt");
        register.setEmail("bobsondugnutt@email.com");
        register.setPassword("bobson123");
        register.setUserPasswordConfirmation("bobson1111");
        register.clickSubmitButton();
        register.waitToRender();

//        Write method to check if popup is displayed

//        Click popup
        register.clickAlertPopUp();

//        Check that we were navigated to HomePage
        Assert.assertTrue(register.checkUserLoggedOut());


    }

//      @After
//      public void close() {
//          driver.close();
//      }
}
