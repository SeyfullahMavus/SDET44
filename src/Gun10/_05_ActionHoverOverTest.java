package Gun10;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class _05_ActionHoverOverTest extends BaseDriver {

    @Test
    public void Test1()
    {


        driver.get("https://www.etsy.com/");


        //1- isDisplay ve isEnable gibi kontoller, element HTML nini içinde var fakat görünür değil.
        //durumda kullanılır.
        //2- BAZI durumlar element HTML nini içinde hiç yoktur.
/*
        List<WebElement> cookiesAccept=driver.findElements(By.cssSelector("[data-gdpr-single-choice-accept='true']"));
       //elementi bulamazsa imlicitly wait devreye girer ve verilen süre kadar bulmaya çalışır
        if (cookiesAccept.size()>0)// varsa
            cookiesAccept.get(0).click();//kapat

 */

        WebElement element=driver.findElement(By.id("catnav-primary-link-10855"));
        WebElement element1=driver.findElement(By.id("side-nav-category-link-10873"));
        WebElement element2=driver.findElement(By.id("catnav-l3-10881"));

        Actions aksiyonlar=new Actions(driver);

        aksiyonlar.moveToElement(element).build().perform();

        MyFunc.Bekle(2);

        aksiyonlar.moveToElement(element1).build().perform();

        MyFunc.Bekle(2);

        aksiyonlar.moveToElement(element2).click().build().perform();

        //Assert.assertTrue("url de bib kolye varmı",driver.getCurrentUrl().contains("bib"));


        driverBekleKapat();



    }

}
