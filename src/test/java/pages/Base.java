package pages;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Base {

    public AppiumDriver<MobileElement> driver;

    public WebDriverWait wait;


    public Base (AppiumDriver<MobileElement> driver){
        this.driver = driver;
        wait = new WebDriverWait(driver,20);
    }

    public void waitVisibility(By elementBy) {
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(elementBy));
    }

    //Click Method
    public void click (By elementBy) {
        waitVisibility(elementBy);
        driver.findElement(elementBy).click();
    }


    public void writeText (By elementBy, String text) {
        waitVisibility(elementBy);
        driver.findElement(elementBy).sendKeys(text);
    }


    public String getText(By elementBy) {
        waitVisibility(elementBy);
        return driver.findElement(elementBy).getText();
    }


    public void assertEquals (By elementBy, String expectedText) {
        waitVisibility(elementBy);
        Assert.assertEquals(getText(elementBy), expectedText);

    }
}
