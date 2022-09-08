import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.time.Duration;

public class TestKeybord {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().deleteAllCookies();

        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        WebElement frame = driver.findElement(By.xpath("//iframe[@name=\"callout\"]"));
        driver.switchTo().frame(frame);
        driver.findElement(By.xpath("//button[text()=\"No thanks\"]")).click();

        driver.switchTo().parentFrame();
        driver.findElement(By.name("q")).sendKeys("Automation");


        Actions action = new Actions(driver);
        action.keyDown(Keys.ARROW_DOWN).click().perform();

        driver.quit();


    }
}
