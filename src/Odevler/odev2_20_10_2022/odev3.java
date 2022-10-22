package Odevler.odev2_20_10_2022;

import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


/*
3-
1) Bu siteye gidin. -> https://www.snapdeal.com/

2) "teddy bear" aratın ve  Search butonuna tıklayın.

3) Bu yazının göründüğünü doğrulayınız. -> (We've got 297 results for 'teddy bear')
Not: Bu yazıdaki sayı değişiklik gösterebilir. Önemli olan cümle kalıbı.
 */

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
