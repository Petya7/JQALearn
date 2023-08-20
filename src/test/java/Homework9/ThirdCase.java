package Homework9;

import junit.framework.Assert;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ThirdCase {
    private static ChromeDriver driver;

    @BeforeClass
    public static void openBrowser() {
        System.setProperty("webdriver.chrome.driver", "D:\\Selenium jars and drivers\\Drivers\\Chrome drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void findElementByXpath() {
        driver.get("https://www.saucedemo.com");
        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("Todorova");
        String expectedValue = "Todorova";
        String actualValue = driver.findElement(By.xpath("//input[@id='user-name']")).getAttribute("value");
        Assert.assertEquals(expectedValue,actualValue);
        System.out.println("Assertion passed");
    }
    @AfterClass
    public static void closeBrowser() {
        driver.close();
    }
}
