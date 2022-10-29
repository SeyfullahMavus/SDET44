package Odevler.odev3_25_10_2022;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class css2 extends BaseDriver {
    public static void main(String[] args) {


        driver.get("https://demo.applitools.com/");

        WebElement site=driver.findElement(By.cssSelector("[id='username']"));
        site.sendKeys("ttechno@gmail.com");
        MyFunc.Bekle(1);

        WebElement sifre=driver.findElement(By.cssSelector("[id='password']"));
        sifre.sendKeys("techno123.");
        MyFunc.Bekle(1);

        WebElement login=driver.findElement(By.cssSelector("[id='log-in']"));
        login.click();

        WebElement test=driver.findElement(By.cssSelector("[id='time']"));
        Assert.assertTrue("hatalı işlem",test.getText().contains("Your nearest branch closes in: 30m 5s"));

        driverBekleKapat();





    }
}
