package Odevler.odev3_25_10_2022;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class css3 extends BaseDriver {
    public static void main(String[] args) {

        driver.get("https://www.snapdeal.com/");

        WebElement ara=driver.findElement(By.cssSelector("[placeholder='Search products & brands']"));
        ara.sendKeys("teddy bear");
        MyFunc.Bekle(1);

       WebElement bas=driver.findElement(By.cssSelector("[class='searchTextSpan']"));
        bas.click();

        WebElement dogrula=driver.findElement(By.cssSelector("span[class='nnn']"));
        Assert.assertTrue("yanlış işlem",dogrula.getText().contains("We've got 254 results for teddy bear"));



        driverBekleKapat();
    }
}
