package Homework11;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;


public class BeforeAfter extends BrowserFactory {

    public static ChromeDriver driver;
    String test1;


    @BeforeClass
    public static void openBrowser() {
        driver = (ChromeDriver) BrowserFactory.getBrowser("Chrome");
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @AfterClass
    public static void closeBrowser() {
        closeAllDriver();
    }
}

