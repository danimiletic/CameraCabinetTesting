import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LandingPage {

    public static void main(String[] args) throws InterruptedException {

//        TEST OBJECTIVE

//        OBJECTIVE: User can register a new account, login to their account
//        and create photography kits, edit them as well as delete them,
//        navigate successfully via the nav bar, then logout.

//        SETUP: User navigates to page, enters first name, last name, email, password
//        and password confirmation. User uses credentials to login and create kits.

//        EXECUTION/TEST STEPS: Navigates to landing page, click register button on nav bar,
//        input credentials, click submit button. Click logout on nav bar,
//        click login button on navbar, input login credentials then be automatically
//        navigated to landing page. Click each element on the navbar to ensure
//        they work properly. Navigate to kits page on nav bar, click "Add Kit" button
//        input Kit Name, Description, Image then click Submit button.
//        Click on newly added kit, click Edit button, change kit name, description and image,
//        hen click submit button. Click on newly edited kit, then click the delete button.
//        Once again, click Add Kit button, add 3 new kits, then click the logout button and close page.

//        EXPECTED RESULT: User successfully creates a new account, and is abel to login with credentials.
//        User creates desired kit then proceeds to logout.

//        ACTUAL RESULT: User has successfully logged in with newly created credentials, created a new kit, but was not able
//        to navigate to Profile page on navbar. User can successfully logout of account.

        System.setProperty("webdriver.chrome.driver", "/Users/Djani/Documents/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://localhost:3000/");

//        TESTS THAT USER CAN REGISTER SUCCESSFULLY

//        driver.findElement(By.id("registerBtn")).click();
//        driver.findElement(By.cssSelector("input[name='fname']")).sendKeys("Barley");
//        driver.findElement(By.cssSelector("input[name='lname']")).sendKeys("Dog");
//        driver.findElement(By.cssSelector("input[name='email']")).sendKeys("barleydog@email.com");
//        driver.findElement(By.cssSelector("input[name='password']")).sendKeys("barleydog");
//        driver.findElement(By.cssSelector("input[name='passwordConfirmation']")).sendKeys("barleydog");
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
//        driver.findElement(By.id("submitBtn")).click();


//        TESTS IF USER PASSWORDS DO  NOT MATCH, USER CANNOT REGISTSER

//        driver.findElement(By.id("registerBtn")).click();
//        driver.findElement(By.cssSelector("input[name='fname']")).sendKeys("Barley");
//        driver.findElement(By.cssSelector("input[name='lname']")).sendKeys("Dog");
//        driver.findElement(By.cssSelector("input[name='email']")).sendKeys("barleydog@email.com");
//        driver.findElement(By.cssSelector("input[name='password']")).sendKeys("barleydog");
//        driver.findElement(By.cssSelector("input[name='passwordConfirmation']")).sendKeys("barleypup");
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
//        driver.findElement(By.id("submitBtn")).click();


//        TESTS THAT USER CANNOT LOG IN IF PASSWORD OR EMAIL ARE INCORRECT

//        PASSWORD IS INCORRECT
//        driver.findElement(By.id("loginBtn")).click();
//        driver.findElement(By.id("formBasicEmail")).sendKeys("barleydog@email.com");
//        driver.findElement(By.id("formBasicPassword")).sendKeys("barleypup");
//        driver.findElement(By.id("submitBtn")).click();

//        EMAIL IS INCORRECT
//        driver.findElement(By.id("formBasicEmail")).sendKeys("barleypup@email.com");
//        driver.findElement(By.id("formBasicPassword")).sendKeys("barleydog");
//        driver.findElement(By.id("submitBtn")).click();

//        EMAIL AND PASSWORD ARE INCORRECT
//        driver.findElement(By.id("formBasicEmail")).sendKeys("barkeypup@email.com");
//        driver.findElement(By.id("formBasicPassword")).sendKeys("barleypup");
//        driver.findElement(By.id("submitBtn")).click();


//        TESTS THE USER LOGIN CREDS WORK PROPERLY AFTER REGISTRATION AND USER CAN LOGOUT AND NAVIGATE TO HOME PAGE

        driver.findElement(By.id("loginBtn")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.findElement(By.id("formBasicEmail")).sendKeys("barleydog@email.com");
        driver.findElement(By.id("formBasicPassword")).sendKeys("barleydog");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.findElement(By.id("submitBtn")).click();

//        TEST THAT NAVBAR LINKS WORK PROPERLY
        driver.findElement(By.id("profileBtn")).click();
        driver.navigate().back();
        driver.navigate().refresh();
        driver.findElement(By.id("aboutBtn")).click();
        driver.findElement(By.id("kitsBtn")).click();
//        TEST THAT USER CAN ADD NEW KIT
        driver.findElement(By.id("kitsBtn")).click();
        driver.findElement(By.id("addKitBtn")).click();
        driver.findElement(By.cssSelector("input[name='name']")).sendKeys("Outdoor Kit");
        driver.findElement(By.cssSelector("input[name='description']")).sendKeys("This kit is used for outdoor photography. Mountains, cityscapes- you name it.");
        driver.findElement(By.cssSelector("input[name=image]")).sendKeys("https://images.unsplash.com/photo-1596143800032-d5a8e7e33060?auto=format&fit=crop&q=80&w=1748&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D");
        driver.findElement(By.cssSelector("button[type='submit']")).click();
        driver.findElement(By.cssSelector("button[class='btn-close']")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

//        TEST THAT USER CAN DELETE KIT
        driver.findElement(By.linkText("Outdoor Kit")).click();
        driver.findElement(By.id("editBtn")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.findElement(By.cssSelector("input[name='name']")).clear();
        driver.findElement(By.cssSelector("input[name='name']")).sendKeys("My Outdoor Kit");
        driver.findElement(By.cssSelector("input[name='description']")).sendKeys("This kit is used for outdoor photography. Mountains, cityscapes- you name it.");
        driver.findElement(By.cssSelector("input[name='image']")).sendKeys("https://images.unsplash.com/photo-1519638831568-d9897f54ed69?auto=format&fit=crop&q=80&w=2070&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.findElement(By.cssSelector("button[type='submit']")).click();
        driver.findElement(By.linkText("My Outdoor Kit")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("deleteBtn")).click();
        Thread.sleep(1000);
        Alert ok = driver.switchTo().alert();
        ok.accept();

//        LOOP TO ADD 3 KITS TO USER ACCOUNT
        int i = 0;
        while (i < 3) {
            driver.findElement(By.id("addKitBtn")).click();
            driver.findElement(By.cssSelector("input[name='name']")).sendKeys("Outdoor Kit");
            driver.findElement(By.cssSelector("input[name='description']")).sendKeys("This kit is used for outdoor photography. Mountains, cityscapes- you name it.");
            driver.findElement(By.cssSelector("input[name=image]")).sendKeys("https://images.unsplash.com/photo-1596143800032-d5a8e7e33060?auto=format&fit=crop&q=80&w=1748&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D");
            driver.findElement(By.cssSelector("button[type='submit']")).click();
            driver.findElement(By.cssSelector("button[class='btn-close']")).click();
            Thread.sleep(1000);
            i++;
        }

//        LOOP TO DELETE 3 KITS
        int d = 0;
        while (d < 3) {
            driver.findElement(By.linkText("Outdoor Kit")).click();
            Thread.sleep(1000);
            driver.findElement(By.id("deleteBtn")).click();
            Thread.sleep(1000);
            Alert al = driver.switchTo().alert();
            al.accept();
            d++;
        }

//        ONCE USER HAS ADDED KITS, USER CAN LOGOUT AND CLOSE WINDOW
        driver.findElement(By.id("logoutBtn")).click();
        driver.close();
    }

}
