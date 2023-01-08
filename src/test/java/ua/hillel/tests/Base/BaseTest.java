package ua.hillel.tests.Base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import ua.hillel.homeTask_16.Base.CrossbrowserTestingSite;
import ua.hillel.homeTask_16.Base.TheInternetSite;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class BaseTest {
    protected WebDriver driver;

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        Map<String, Object> prefs = new HashMap<String, Object>();
        prefs.put("download.default_directory", new File("/target/downloads").getAbsolutePath());
        options.setExperimentalOption("prefs", prefs);

        this.driver = new ChromeDriver(options);
        driver.manage().window().maximize();
    }

/*    @AfterClass(alwaysRun = true)
    public void tearDown() {
        if (driver !=null){
            driver.quit();
        }
    }*/

    public TheInternetSite openMainPageTheInternetSite(){
        driver.get("https://the-internet.herokuapp.com/");
        return new TheInternetSite(driver);
    }
    public CrossbrowserTestingSite openMainPageCrossbrowserTestingSite(){
        driver.get("https://crossbrowsertesting.github.io/");
        return new CrossbrowserTestingSite(driver);
    }
}