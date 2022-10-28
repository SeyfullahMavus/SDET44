package Gun08;

//        Test Senaryosu
//        1- https://www.facebook.com/  sayfasına gidiniz
//        2- CreateNewAccount a tıklatınız.
//        3- Açılan yeni pencerede isim, soyisim ve emaili giriniz.
//        4- Doüum tarihinizi Select sınıfı ile seçiniz
//        5- Email i tekrar girmenizi isteyen bir input daha açıldığını
//        öncesinde de görünmediğini assert ile doğrulayınız.

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class _02_Soru extends BaseDriver {


    @Test
    public void Test1()
    {

     driver.get("https://www.facebook.com/");
     driver.manage().deleteAllCookies();// girildikten sonra cookies ler silindi

        WebElement create=driver.findElement(By.cssSelector("a[id^='u_0_0'][data-testid='open-registration-form-button']"));
        create.click();
        MyFunc.Bekle(1);

        WebElement name=driver.findElement(By.name("firstname"));
        name.sendKeys("Seyf");
        MyFunc.Bekle(1);

        WebElement surname=driver.findElement(By.name("lastname"));
        surname.sendKeys("Mavus");
        MyFunc.Bekle(1);

        WebElement email=driver.findElement(By.name("reg_email__"));
        email.sendKeys("seyfullahmavus@hotmail.com");
        MyFunc.Bekle(1);

        WebElement email2=driver.findElement(By.xpath("//*[@aria-label='E-posta adresini tekrar gir']"));
        email2.sendKeys("seyfullahmavus@hotmail.com");
        MyFunc.Bekle(1);

        WebElement dogumGunu=driver.findElement(By.id("day"));

        Select gun=new Select(dogumGunu);
        gun.selectByVisibleText("6");
        MyFunc.Bekle(1);

        WebElement dogumayi=driver.findElement(By.id("month"));

        Select ay=new Select(dogumayi);
        ay.selectByVisibleText("Mar");
        MyFunc.Bekle(1);

        WebElement dogumyili=driver.findElement(By.id("year"));

        Select yil=new Select(dogumyili);
        yil.selectByVisibleText("1990");
        MyFunc.Bekle(1);

        WebElement cinsiyet=driver.findElement(By.xpath("//*[@class='_8esa'][@value='2']"));
        cinsiyet.click();

        Assert.assertFalse(email2.getText().contains("adresini tekrar gir"));

        driverBekleKapat();








    }
}
