package Homework11;

import Pages.HomePage;
import junit.framework.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class FindingElementsOnWebsites extends BeforeAfter {

    @Test
    public void findUsername() {
        driver.get("https://demoqa.com/text-box");

        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("userName")));
        driver.findElement(By.id("userName")).sendKeys("Petya");

        String expected = "https://demoqa.com/text-box";
        String actual = "https://demoqa.com/text-box";
        Assert.assertEquals(expected, actual);
        System.out.println("The assertion passed");
    }

    @Test
    public void enterUsernameAndPass() {
        driver.get("https://www.saucedemo.com");

        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("submit-button")));


        HomePage home = new HomePage(driver);

        home.enterUsername("Petya");
        home.enterPassword("1234");
        home.clickSubmit();

    }
}
