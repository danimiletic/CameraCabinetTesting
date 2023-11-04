import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LandingPage {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/Djani/Documents/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://localhost:3000/");
//        driver.findElement(By.id("registerBtn")).click();
////        driver.findElement(By.id("formBasicEmail")).sendKeys("user@user.com");
//        driver.findElement(By.cssSelector("input[name='fname']")).sendKeys("Barley");
//        driver.findElement(By.cssSelector("input[name='lname']")).sendKeys("Dog");
//        driver.findElement(By.cssSelector("input[name='email']")).sendKeys("barleydog@email.com");
//        driver.findElement(By.cssSelector("input[name='password']")).sendKeys("barleydog");
//        driver.findElement(By.cssSelector("input[name='passwordConfirmation']")).sendKeys("barleydog");
//        Thread.sleep(1000);
//        driver.findElement(By.id("submitBtn")).click();

        driver.findElement(By.id("loginBtn")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("formBasicEmail")).sendKeys("barleydog@email.com");
        driver.findElement(By.id("formBasicPassword")).sendKeys("barleydog");
        Thread.sleep(1000);
        driver.findElement(By.id("submitBtn")).click();
    }
}
