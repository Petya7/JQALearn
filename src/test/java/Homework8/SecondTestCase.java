package Homework8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SecondTestCase {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\Selenium jars and drivers\\Drivers\\Chrome drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com");

        driver.manage().window().maximize();

        driver.findElement(By.className("input_error")).sendKeys("Petya");
        driver.findElement(By.cssSelector("input[name=password]")).sendKeys("1234");
        driver.findElement(By.className("submit-button")).click();

    }
}
