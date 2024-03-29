package ua.hillel.tests.webDriverActions;

/*написати тест, який виводить юзернейм для кожного користувача*/

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import ua.hillel.listeners.CustomExtentReportListener;

import java.util.List;

@Listeners(CustomExtentReportListener.class)
public class DisplayUsernames {
    static {
        System.setProperty("extent.reporter.html.start", "true");
        System.setProperty("extent.reporter.html.out", "target/extentReport/ExtentHtml.html");
    }
    WebDriver driver = new ChromeDriver();

    @BeforeTest
    public void beforeTest(){
        WebDriverManager.chromedriver().setup();
        driver.get("https://the-internet.herokuapp.com/hovers");
    }
    @Test
    public void displayUsernames() {

        int count = driver.findElements(By.xpath("//*[@class ='example']/div/img[1]")).size();
        Actions actions = new Actions(driver);
        for (int i=1; i<=count; i++) {
            actions.moveToElement(driver.findElement(By.xpath("//*[@class ='example']/div["+i+"]/img[1]"))).perform();

            List<WebElement> userNames = driver.findElements(By.cssSelector(".figure"));
            for (WebElement userName : userNames){
            System.out.println(userName.findElement(By.tagName("h5")).getText());
            }
        }
    }
    @AfterTest
    public void afterTest() {
        driver.quit();
    }
}
