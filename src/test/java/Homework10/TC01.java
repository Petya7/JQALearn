package Homework10;

import Pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TC01 {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\Selenium jars and drivers\\Drivers\\Chrome drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com");

        HomePage home = new HomePage(driver);

        home.enterUsername("Petya");
        home.enterPassword("1234");
        home.clickSubmit();


        driver.quit();
    }
}
