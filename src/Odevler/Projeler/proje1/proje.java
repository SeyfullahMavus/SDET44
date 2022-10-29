package Odevler.Projeler.proje1;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static Odevler.Projeler.proje1.giris.giriss;


//@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class proje extends BaseDriver {


    @Test
    public void Test1() {

        driver.get("https://www.akakce.com/");

        WebElement ak = driver.findElement(By.xpath("//*[text()='Akakce.com']"));
        //System.out.println(ak.getText());
        Assert.assertTrue(ak.getText().contains("Akakce.com"));

        WebElement hesap = driver.findElement(By.xpath("(//*[text()='Hesap Aç'])[1]"));
        hesap.click();

        MyFunc.Bekle(1);
        WebElement name = driver.findElement(By.id("rnufn"));
        name.sendKeys("Seyf");

        MyFunc.Bekle(1);
        WebElement surName = driver.findElement(By.id("rnufs"));
        surName.sendKeys("Mav");

        MyFunc.Bekle(1);
        WebElement email1 = driver.findElement(By.id("rnufe1"));
        email1.sendKeys("sallama@hotmail.com");

        MyFunc.Bekle(1);
        WebElement email2 = driver.findElement(By.id("rnufe2"));
        email2.sendKeys("sallama@hotmail.com");

        MyFunc.Bekle(1);
        WebElement password1 = driver.findElement(By.id("rnufp1"));
        password1.sendKeys("123456Gs");

        MyFunc.Bekle(1);
        WebElement password2 = driver.findElement(By.id("rnufp2"));
        password2.sendKeys("123456Gs");

        MyFunc.Bekle(1);
        WebElement cinsiyet = driver.findElement(By.id("rngm"));
        cinsiyet.click();

        MyFunc.Bekle(1);
        WebElement il = driver.findElement(By.id("locpr"));
        Select ilSec = new Select(il);
        ilSec.selectByVisibleText("Malatya");

        MyFunc.Bekle(1);
        WebElement ilce = driver.findElement(By.id("locds"));
        Select ilceSec = new Select(ilce);
        ilceSec.selectByVisibleText("Merkez");

        MyFunc.Bekle(1);
        WebElement gun = driver.findElement(By.id("bd"));
        Select gunSec = new Select(gun);
        gunSec.selectByVisibleText("6");

        MyFunc.Bekle(1);
        WebElement ay = driver.findElement(By.id("bm"));
        Select aySec = new Select(ay);
        aySec.selectByVisibleText("3");

        MyFunc.Bekle(1);
        WebElement yil = driver.findElement(By.id("by"));
        Select yilSec = new Select(yil);
        yilSec.selectByVisibleText("1990");

        MyFunc.Bekle(1);
        WebElement tik1 = driver.findElement(By.id("rnufpca"));
        tik1.click();

        MyFunc.Bekle(1);
        WebElement tik2 = driver.findElement(By.id("rnufnee"));
        tik2.click();

        MyFunc.Bekle(1);
        WebElement tik3 = driver.findElement(By.id("rfb"));
        tik3.click();

        /*

        WebElement dogrula = driver.findElement(By.xpath("//*[text()='Seyf']"));
        System.out.println(dogrula);
        Assert.assertTrue(dogrula.getText().contains("Seyf"));

         */


        //driverBekleKapat();
    }

    @Test
    public void Test2()//dogrulama
    {

        MyFunc.Bekle(1);
        giriss();

        //dogrulama

        MyFunc.Bekle(1);
        WebElement test2 = driver.findElement(By.xpath("//*[text()='Seyf']"));
        Assert.assertTrue(test2.getText().contains("Seyf"));
        MyFunc.Bekle(1);

       // driverBekleKapat();
    }

    @Test
    public void Test3() {

        MyFunc.Bekle(1);
        giriss();

        MyFunc.Bekle(1);
        WebElement sip = driver.findElement(By.xpath("//*[text()='Siparişlerim']"));
        sip.click();

        MyFunc.Bekle(1);
        WebElement kayitYok = driver.findElement(By.xpath("//*[text()='Kayıtlı siparişiniz bulunmuyor.']"));
        Assert.assertTrue(kayitYok.getText().contains("Kayıtlı siparişiniz bulunmuyor."));
        MyFunc.Bekle(1);

       // driverBekleKapat();
    }
    @Test
    public void Test4()
    {
        MyFunc.Bekle(1);
        giriss();

        MyFunc.Bekle(1);
        WebElement mes=driver.findElement(By.xpath("//*[text()='Mesajlarım']"));
        mes.click();

        MyFunc.Bekle(1);
        WebElement mesYok=driver.findElement(By.xpath("//*[text()='Listelenecek mesaj bulunamadı.']"));
        Assert.assertTrue(mesYok.getText().contains("Listelenecek mesaj bulunamadı."));
        MyFunc.Bekle(1);

       // driverBekleKapat();
    }
    @Test
    public void Test5()
    {
        MyFunc.Bekle(1);
        giriss();

        MyFunc.Bekle(1);
        WebElement basadon=driver.findElement(By.xpath("//*[text()='Akakce.com']"));
        basadon.click();

        MyFunc.Bekle(1);
        WebElement test5 = driver.findElement(By.xpath("//*[text()='Seyf']"));
        test5.click();

        MyFunc.Bekle(1);
        WebElement hesapSil=driver.findElement(By.xpath("//*[text()='Hesabımı Sil']"));
        hesapSil.click();

        MyFunc.Bekle(1);
        WebElement sifreGir=driver.findElement(By.xpath("//*[@maxlength='16']"));
        sifreGir.sendKeys("123456Gs");

        MyFunc.Bekle(1);
        WebElement sil=driver.findElement(By.xpath("//*[@value='Hesabımı sil']"));
        sil.click();

        driverBekleKapat();
    }
}

//*[text()='Hesabın silindi.']
