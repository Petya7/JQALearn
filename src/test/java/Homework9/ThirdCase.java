package Homework9;

import junit.framework.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ThirdCase extends BeforeAfter {

    @Test
    public void findElementByXpath() {
        driver.get("https://www.saucedemo.com");
//        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("Todorova");

        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='user-name']")));
        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("Todorova");


        String expectedValue = "Todorova";
        String actualValue = driver.findElement(By.xpath("//input[@id='user-name']")).getAttribute("value");
        Assert.assertEquals(expectedValue,actualValue);
        System.out.println("Assertion passed");
    }
}
