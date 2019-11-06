package tests.Day4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.BrowserFactory;
import utils.BrowserUtils;

public class FindElement {
    public static void main(String[] args) {
        WebDriver driver= BrowserFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/forgot_password");
        String expectedTitle=driver.getTitle();


        WebElement button=driver.findElement(By.id("form_submit"));
        button.click();
        String actualTitle=driver.getTitle();
        if(actualTitle.equals(expectedTitle)){
            System.out.println("Test passed");
        }else{
            System.out.println("Test faild");
            System.out.println("expectedTitle");
            System.out.println("actualTitle");
        }
        BrowserUtils.wait(5);
       // WebElement element=driver.findElement(By.id("value"));
       // element.click();

        driver.close();
    }
}
