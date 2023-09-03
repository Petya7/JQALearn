package Homework10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    By UsernameField = By.className("input_error");
    By PasswordField = By.cssSelector("input[name=password]");
    By SubmitBtn = By.className("submit-button");

    public void clickSubmit() {
        driver.findElement(SubmitBtn).click();
    }
    public void enterUsername(String user) {
        driver.findElement(UsernameField).sendKeys(user);
    }
    public void enterPassword(String pass) {
        driver.findElement(PasswordField).sendKeys(pass);
    }
}
