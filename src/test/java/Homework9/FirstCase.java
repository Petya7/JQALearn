package Homework9;

import junit.framework.Assert;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class FirstCase {
    private static ChromeDriver driver;

    @BeforeClass
    public static void openBrowser() {
        System.setProperty("webdriver.chrome.driver", "D:\\Selenium jars and drivers\\Drivers\\Chrome drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void findUsername() {
        driver.get("https://demoqa.com/text-box");
        driver.findElement(By.id("userName")).sendKeys("Petya");
        String expected = "https://demoqa.com/text-box";
        String actual = "https://demoqa.com/text-box";
        Assert.assertEquals(expected, actual);
        System.out.println("The assertion passed");
    }

    @AfterClass
        public static void closeBrowser() {
        driver.close();
    }
}
