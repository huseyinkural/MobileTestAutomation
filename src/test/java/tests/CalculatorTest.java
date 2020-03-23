package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pages.Calculator;

public class CalculatorTest extends BaseTest {

    //all numbers
    By number1By = By.id("bt_01");
    By number2By = By.id("bt_02");
    By number3By = By.id("bt_03");
    By number4By = By.id("bt_04");
    By number5By = By.id("bt_05");
    By number6By = By.id("bt_06");
    By number7By = By.id("bt_07");
    By number8By = By.id("bt_08");
    By number9By = By.id("bt_09");

    @Test
    public void sumTest(){
        Calculator calc = new Calculator(driver);

        calc.sum(number5By,number3By)
                .verifyResult("8");
    }
}
