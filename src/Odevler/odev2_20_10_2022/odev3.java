package Odevler.odev2_20_10_2022;

import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class odev3 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.snapdeal.com/");

        WebElement ara=driver.findElement(By.id("inputValEnter"));
        ara.sendKeys("teddy bear");

        WebElement searc=driver.findElement(By.className("searchTextSpan"));
        searc.click();

        MyFunc.Bekle(5);
        driver.quit();




    }
}
