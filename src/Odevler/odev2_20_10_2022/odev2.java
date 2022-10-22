package Odevler.odev2_20_10_2022;

import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
2-
1) Bu siteye gidin. -> https://demo.applitools.com/

2) Username kısmına "ttechno@gmail.com" girin.

3) Password kısmına "techno123." girin.

4) "Sign in" buttonunan tıklayınız.

5) "Your nearest branch closes in: 30m 5s" yazısının göründüğünü doğrulayınız.
 */

public class odev2 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.applitools.com/");

        WebElement name=driver.findElement(By.id("username"));
        name.sendKeys("ttechno@gmail.com");

        WebElement password=driver.findElement(By.id("password"));
        password.sendKeys("ttechno123.");

        WebElement sigin=driver.findElement(By.id("log-in"));
        sigin.click();

        MyFunc.Bekle(5);
        driver.quit();


    }
}
