package Odevler.odev2;

import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class odev2_20_10_2022_2 {
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



        MyFunc.Bekle(10);
        driver.quit();


    }
}
