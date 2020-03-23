package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Calculator extends Base {
    public Calculator(AppiumDriver<MobileElement> driver) {
        super(driver);
    }
    By number3By = By.id("bt_03");
    By number4By = By.id("bt_04");
    By number5By = By.id("bt_05");
    //operators
    By sumButtonBy = By.id("bt_add");
    By subButtonBy = By.id("bt_sub");
    By mulButtonBy = By.id("bt_mul");
    By divButtonBy = By.id("bt_div");

    By equalButtonBy=By.id("bt_equal");
    By clearButtonBy= By.id("bt_clear");
    By inputBy = By.id("txtCalc");


    public Calculator sum(By number1, By number2){

        click(number1);
        click(sumButtonBy);
        click(number2);
        click(equalButtonBy);
        return this;
    }
    public Calculator sub(By number1, By number2){

        click(number1);
        click(subButtonBy);
        click(number2);
        click(equalButtonBy);
        return this;
    }

    public Calculator mul(By number1, By number2){

        click(number1);
        click(mulButtonBy);
        click(number2);
        click(equalButtonBy);
        return this;
    }

    public Calculator div(By number1, By number2){

        click(number1);
        click(divButtonBy);
        click(number2);
        click(equalButtonBy);
        return this;
    }

    public Calculator clear(){
        click(clearButtonBy);
        return this;
    }

    public Calculator verifyResult (String expectedText) {
        assertEquals(inputBy, expectedText);
        return this;
    }
}
