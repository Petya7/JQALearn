package Homework9;

import junit.framework.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class ThirdCase extends BeforeAfter {

    @Test
    public void findElementByXpath() {
        driver.get("https://www.saucedemo.com");
        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("Todorova");
        String expectedValue = "Todorova";
        String actualValue = driver.findElement(By.xpath("//input[@id='user-name']")).getAttribute("value");
        Assert.assertEquals(expectedValue,actualValue);
        System.out.println("Assertion passed");
    }
}
