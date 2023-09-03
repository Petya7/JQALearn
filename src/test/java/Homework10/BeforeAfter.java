package Homework10;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BeforeAfter extends BrowserFactory {

    public static ChromeDriver driver;


    @BeforeClass
    public static void openBrowser() {
        driver = (ChromeDriver) BrowserFactory.getBrowser("Chrome");
        driver.manage().window().maximize();
    }

    @AfterClass
    public static void closeBrowser() {
        closeAllDriver();
    }
}
