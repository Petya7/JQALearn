package Homework9;

import junit.framework.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class SecondCase extends BeforeAfter {

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
  }
