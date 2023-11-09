package com.cameracabinet.tests;

import com.cameracabinet.webpages.HomePage;
import com.cameracabinet.webpages.GearShowPage;
import com.cameracabinet.webpages.KitShowPage;
import com.cameracabinet.webpages.KitsPage;
import com.cameracabinet.webpages.LoginPage;
import com.cameracabinet.webpages.RegisterPage;
import com.cameracabinet.webpages.AboutPage;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;


public class UserEndToEndTest {
    WebDriver driver;

    @Before
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.manage().window().maximize();
    }

    @Test
    public void UserEndToEndTest() throws InterruptedException {

//        OBJECTIVE: User can register a new account, login to their account
//        and create photography kits, edit them as well as delete them,
//        navigate successfully via the nav bar, then logout.

//        SETUP: User navigates to page, enters first name, last name, email, password
//        and password confirmation. User uses credentials to login and create kits.

//        EXECUTION/TEST STEPS: Navigates to landing page, click register button on nav bar,
//        input credentials, click submit button. Click logout on nav bar,
//        click login button on navbar, input login credentials then be automatically
//        navigated to landing page. Navigate to kits page on nav bar, click "Add Kit" button
//        input Kit Name, Description, Image then click Submit button. Verify Kit exists.
//        Click on newly added kit, click Edit button, change kit name, description and image,
//        then click submit button. Verify kit was edited. Then click on add gear button, add gear information into input
//        fields, submit and verify gear exists. Click gear description to navigate to GearShow, click edit button, edit gear
//        information then click submit. Verify gear was edited. Navigate back to GearShow, click delete button and confirm alert popup.
//        Auto navigate back to kitshow, click delete button, confirm alert popup. Navigate back to HomePage,
//        verify it loaded, then logout. Verify user is logged out.

//        EXPECTED RESULT: User successfully creates a new account, and is able to login with credentials.
//        User creates desired kit then proceeds to logout.

//        ACTUAL RESULT: User has successfully logged in with newly created credentials, created a new kit, but was not able
//        to navigate to Profile page on navbar. User can successfully logout of account.

//        Create HomePage objects
        HomePage home = new HomePage(driver);

//        Check if home page has opened
        Assert.assertTrue(home.isPageOpened());

//        Navigate to login page
        home.navigateToLogin();

//        Create LoginPage object
        LoginPage login = new LoginPage(driver);

//        User can log in
        login.inputUserEmail("bobsondugnutt@email.com");
        login.inputUserPassword("bobson123");
        login.clickSubmitButton();

//        Assert user is logged in by checking logout button is displayed
        Assert.assertTrue(home.checkUserLoggedIn());

//        Navigate to KitsPage
        home.navigateToKitPage();

//        Create KitsPage object
        KitsPage kits = new KitsPage(driver);

//        Check if page has opened
        Assert.assertTrue(kits.isPageOpened());

//        Add new kit
        kits.clickAddButton();

//        Check that modal is open
        Assert.assertTrue(kits.isModalOpen());

//        Input kit info
        kits.inputKitName("Outdoor Photography");
        kits.inputKitDescription("This kit is great for outdoor photos-- mountain ranges, wooded areas, etc.");
        kits.inputKitImage("https://images.unsplash.com/photo-1542124292-60272943a355?q=80&w=2071&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D");
        kits.clickModalSubmitButton();
        kits.closeModal();
        kits.waitToRender();

//        Navigate to KitShow page
        kits.clickKitImage();

//        Create KitShowPage object
        KitShowPage kitShow = new KitShowPage(driver);

//        Check if page was found
        Assert.assertTrue(kitShow.isPageOpened());
        kitShow.waitToRender();

//        Assert kit was created
        Assert.assertTrue(kitShow.checkKitExists());

//        Edit kit to check functionality
        kitShow.clickEditButton();
        kitShow.waitToRender();

//        Assert kit model is open
        Assert.assertTrue(kitShow.isModalOpen());
        kitShow.editKitName("City Photography");
        kitShow.editKitDescription("This camera is great for urban photography. Cityscapes, moving vehicles, etc.");
        kitShow.editKitImg(("https://images.unsplash.com/photo-1452780212940-6f5c0d14d848?q=80&w=2076&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"));
        kitShow.clickModalSubButton();
        kitShow.closeModal();

//        Assert kit was edited
        Assert.assertTrue(kits.checkEditedKit());

//        Navigate to KitShow page
        kits.clickKitImage();
        kitShow.waitToRender();
        kitShow.scrollToAddGear();
        kitShow.waitToRender();

        // Add new camera gear
        kitShow.clickAddGearButton();

//        Assert gear modal is open
        Assert.assertTrue(kitShow.checkGearModalIsOpen());
        kitShow.addGearName("Nikon Film Roll");
        kitShow.addGearDescription("35mm film roll for prints.");
        kitShow.addGearImage("https://images.unsplash.com/photo-1541966712669-03c3a01172bc?q=80&w=2370&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D");
        kitShow.addGearPrice("10");
        kitShow.addGearBought("09/22/2023");
        kitShow.clickGearModalSubButton();
        kitShow.closeModal();
//        Assert gear was created
        Assert.assertTrue(kitShow.checkGearExists());
//        kitShow.waitToRender();

//        // Navigate to GearShow page
        kitShow.scrollToGearDesc();
        kitShow.waitToRender();
        kitShow.clickGearDescLink();
//
//        // CreateGearShowPage object
        GearShowPage gearShow = new GearShowPage(driver);

//        Edit gear
        gearShow.clickEditBtn();
        gearShow.waitToRender();

//        Assert gear modal is open
        Assert.assertTrue(gearShow.checkModalIsOpen());
        gearShow.editPartName("Nikon Roll");
        gearShow.editPartDesc("35mm Nikon roll.");
        gearShow.editPartImg("https://images.unsplash.com/photo-1496335588652-e319a73b55b6?q=80&w=2226&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D");
        gearShow.clickGearModalSubBtn();
        kitShow.scrollToGearDesc();
        kitShow.waitToRender();

//        Assert the edited gear exists
        Assert.assertTrue(kitShow.checkEditedGearExists());

        // Navigate to GearShow
        kitShow.clickGearDescLink();

//        Delete gear
        gearShow.clickDeleteBtn();
        gearShow.waitToRender();
        gearShow.clickAlertPopUp();
        kitShow.waitToRender();

//        Delete Kit
        kitShow.clickDeleteBtn();
        kitShow.waitToRender();
        kitShow.clickAlertPopUp();

//          Validate that we are back on the home page and logged out
        kitShow.clickHomeBtn();
        Assert.assertTrue(home.isPageOpened());
        home.logoutOfAccount();

//        Check user is logged out by asserting the login button is present
        Assert.assertTrue(home.checkUserIsLoggedOut());
    }
    @After
    public void close() {
        driver.close();
    }
}
