package Odevler.Projeler.proje1;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class giris extends BaseDriver {


    public static void giriss()
    {
        driver.get("https://www.akakce.com/");

        MyFunc.Bekle(1);
        WebElement giris2=driver.findElement(By.xpath("//*[text()='Giriş Yap'][1]"));
        giris2.click();

        MyFunc.Bekle(1);
        WebElement email2=driver.findElement(By.id("life"));
        email2.sendKeys("sallama@hotmail.com");

        MyFunc.Bekle(1);
        WebElement sifre2=driver.findElement(By.id("lifp"));
        sifre2.sendKeys("123456Gs");

        MyFunc.Bekle(1);
        WebElement grs=driver.findElement(By.id("lfb"));
        grs.click();

        MyFunc.Bekle(1);
        WebElement test3 = driver.findElement(By.xpath("//*[text()='Seyf']"));
        test3.click();

    }

}
