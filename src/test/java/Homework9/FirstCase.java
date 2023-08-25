package Homework9;

import junit.framework.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class FirstCase extends BeforeAfter {

    @Test
    public void findUsername() {
        driver.get("https://demoqa.com/text-box");
        driver.findElement(By.id("userName")).sendKeys("Petya");
        String expected = "https://demoqa.com/text-box";
        String actual = "https://demoqa.com/text-box";
        Assert.assertEquals(expected, actual);
        System.out.println("The assertion passed");
    }
}
