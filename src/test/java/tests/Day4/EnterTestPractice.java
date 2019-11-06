package tests.Day4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.BrowserFactory;

public class EnterTestPractice {
    public static void main(String[] args) {
        WebDriver driver= BrowserFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/forgot_password");
        WebElement inputBox= driver.findElement(By.name("email"));
        inputBox.sendKeys("random@email.com", Keys.ENTER);
        WebElement confirmationMessage =driver.findElement(By.name("confirmation_message"));
        String expectedResult = "Your e-mail's been sent!";
        String actualResult = confirmationMessage.getText();
        if(actualResult.equals(expectedResult)){
            System.out.println("test passed");
        }else{
            System.out.println("test failed");
        }
        driver.close();
    }






}


