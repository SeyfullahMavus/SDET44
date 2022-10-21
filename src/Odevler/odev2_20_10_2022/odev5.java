package Odevler.odev2_20_10_2022;

import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class odev5 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://testpages.herokuapp.com/styled/index.html");

        WebElement fake = driver.findElement(By.id("fakealerttest"));
        fake.click();

        MyFunc.Bekle(1);

        WebElement show = driver.findElement(By.id("fakealert"));
        show.click();

        MyFunc.Bekle(1);

        WebElement ok = driver.findElement(By.id("dialog-ok"));
        ok.click();

        MyFunc.Bekle(5);
        driver.quit();


    }
}
