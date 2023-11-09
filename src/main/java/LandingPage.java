import landingpage.pageobjects.*;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class LandingPage {

    public static void main(String[] args) throws InterruptedException {

        // DO NOT RUN THIS ONE. THIS WAS FOR PRACTICE/EXPERIMENTING. RUN TESTS IN COM.CAMERCABINET PACKAGE















//        System.setProperty("webdriver.chrome.driver", "/Users/Djani/Documents/chromedriver");
//        WebDriver driver = new ChromeDriver();
//        LandingObjects landingObjects = new LandingObjects(driver);
//        KitsPageObjects kitsPageObjects = new KitsPageObjects(driver);
//        AboutPageObjects aboutPageObjects = new AboutPageObjects(driver);
//        KitShowObjects kitShowObjects = new KitShowObjects(driver);
//        GearShowObjects gearShowObjects = new GearShowObjects(driver);
//        NavbarObjects navbarObjects = new NavbarObjects(driver);
//        driver.manage().window().maximize();
//        driver.get("http://localhost:3000/");

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

//        driver.findElement(By.id("loginBtn")).click();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
//        driver.findElement(By.id("email")).sendKeys("barleydog@email.com");
//        driver.findElement(By.id("password")).sendKeys("barleydog");
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
//        driver.findElement(By.id("submitBtn")).click();

//        TEST THAT NAVBAR LINKS WORK PROPERLY
//        driver.findElement(By.id("profileBtn")).click();
//        driver.navigate().back();
//        driver.navigate().refresh();
//        driver.findElement(By.id("aboutBtn")).click();
//        driver.findElement(By.id("kitsBtn")).click();
//        TEST THAT USER CAN ADD NEW KIT
//        driver.findElement(By.id("kitsBtn")).click();
//        driver.findElement(By.id("addKitBtn")).click();
//        driver.findElement(By.cssSelector("input[name='name']")).sendKeys("Outdoor Kit");
//        driver.findElement(By.cssSelector("input[name='description']")).sendKeys("This kit is used for outdoor photography. Mountains, cityscapes- you name it.");
//        driver.findElement(By.cssSelector("input[name=image]")).sendKeys("https://images.unsplash.com/photo-1596143800032-d5a8e7e33060?auto=format&fit=crop&q=80&w=1748&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D");
//        driver.findElement(By.cssSelector("button[type='submit']")).click();
//        driver.findElement(By.cssSelector("button[class='btn-close']")).click();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

//        TEST THAT USER CAN DELETE KIT
//        driver.findElement(By.linkText("Outdoor Kit")).click();
//        driver.findElement(By.id("kitEditBtn")).click();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
//        driver.findElement(By.cssSelector("input[name='name']")).clear();
//        driver.findElement(By.cssSelector("input[name='name']")).sendKeys("My Outdoor Kit");
//        driver.findElement(By.cssSelector("input[name='description']")).sendKeys("This kit is used for outdoor photography. Mountains, cityscapes- you name it.");
//        driver.findElement(By.cssSelector("input[name='image']")).sendKeys("https://images.unsplash.com/photo-1519638831568-d9897f54ed69?auto=format&fit=crop&q=80&w=2070&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D");
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
//        driver.findElement(By.cssSelector("button[type='submit']")).click();
//        driver.findElement(By.linkText("My Outdoor Kit")).click();
//        Thread.sleep(1000);
//        driver.findElement(By.id("kitDeleteBtn")).click();
//        Thread.sleep(1000);
//        Alert ok = driver.switchTo().alert();
//        ok.accept();

//        LOOP TO ADD 3 KITS TO USER ACCOUNT
//        int i = 0;
//        while (i < 3) {
//            driver.findElement(By.id("addKitBtn")).click();
//            driver.findElement(By.cssSelector("input[name='name']")).sendKeys("Outdoor Kit");
//            driver.findElement(By.cssSelector("input[name='description']")).sendKeys("This kit is used for outdoor photography. Mountains, cityscapes- you name it.");
//            driver.findElement(By.cssSelector("input[name=image]")).sendKeys("https://images.unsplash.com/photo-1596143800032-d5a8e7e33060?auto=format&fit=crop&q=80&w=1748&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D");
//            driver.findElement(By.cssSelector("button[type='submit']")).click();
//            driver.findElement(By.cssSelector("button[class='btn-close']")).click();
//            Thread.sleep(1000);
//            i++;
//        }

//        LOOP TO DELETE 3 KITS
//        int d = 0;
//        while (d < 3) {
//            driver.findElement(By.linkText("Outdoor Kit")).click();
//            Thread.sleep(1000);
//            driver.findElement(By.id("deleteBtn")).click();
//            Thread.sleep(1000);
//            Alert al = driver.switchTo().alert();
//            al.accept();
//            d++;
//        }

//        ONCE USER HAS ADDED KITS, USER CAN LOGOUT AND CLOSE WINDOW
//        driver.findElement(By.id("logoutBtn")).click();
//        driver.close();
    }

}
