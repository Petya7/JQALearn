package Homework8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class FirstTestCase {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","D:\\Selenium jars and drivers\\Drivers\\Chrome drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/text-box");

        driver.manage().window().maximize();

        driver.findElement(By.id("userName")).sendKeys("Petya");
//        driver.close();

    }
}


