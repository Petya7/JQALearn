package Homework9;

import junit.framework.Assert;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SecondCase {
    private static ChromeDriver driver;

    @BeforeClass
    public static void openBrowser() {
        System.setProperty("webdriver.chrome.driver", "D:\\Selenium jars and drivers\\Drivers\\Chrome drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @Test
    public void findUsernameAndPassword() {
        driver.get("https://www.saucedemo.com");
        driver.findElement(By.className("input_error")).sendKeys("Petya");
        driver.findElement(By.cssSelector("input[name=password]")).sendKeys("1234");
        driver.findElement(By.className("submit-button")).click();
        String expectedUsername = "Petya";
        String expectedPassword = "1234";
        String actualUsername = "Petya";
        String actualPassword = "1234";
        Assert.assertEquals(expectedUsername,actualUsername);
        Assert.assertEquals(expectedPassword,actualPassword);
        System.out.println("Assertions passed");
    }
    @AfterClass
    public static void closeBrowser() {
        driver.close();
    }
}