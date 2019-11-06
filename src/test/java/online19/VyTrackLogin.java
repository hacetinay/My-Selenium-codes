package online19;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VyTrackLogin {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://qa2.vytrack.com/user/login");
        driver.manage().window().maximize();
        Thread.sleep(4000);
        WebElement UserNameLocator = driver.findElement(By.name("_username"));
        WebElement PassWordLocator = driver.findElement(By.name("_password"));
        String Vytrack_Username = "user187";
        String Vytrack_Password = "UserUser123";
        UserNameLocator.sendKeys(Vytrack_Username);
        PassWordLocator.sendKeys(Vytrack_Password);
        driver.findElement(By.id("_submit")).click();
        String weburl = driver.getCurrentUrl();
        String title = driver.getTitle();
        System.out.println(weburl);
        System.out.println(title);
        Thread.sleep(8000);
        driver.quit();

    }
}