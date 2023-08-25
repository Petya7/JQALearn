package Homework9;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.chrome.ChromeDriver;

public class BeforeAfter {
    public static ChromeDriver driver;

    @BeforeClass
    public static void openBrowser() {
        System.setProperty("webdriver.chrome.driver", "D:\\Selenium jars and drivers\\Drivers\\Chrome drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterClass
    public static void closeBrowser() {
        driver.close();
    }
}
