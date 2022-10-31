package Gun09;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _04_ActionClickTest extends BaseDriver {


    @Test
    public void Test1()
    {
        driver.get("https://demoqa.com/buttons");
        WebElement element=driver.findElement(By.xpath("//button[text()='Click Me']"));

        Actions aksiyonlar=new Actions(driver); //1
        System.out.println("aksiyon öncesi tüm aksiyonları çalıştıracağımız ana Aksiyonları sınıfı oluştuldu");

        Action aksiyon=aksiyonlar.moveToElement(element).click().build();
        //elementin üzerine gidildi, Click aksiyonu hazırda bekliyor, henüz click olmadı.
        System.out.println("Aksiyon hazırlandı");

        MyFunc.Bekle(2);
        aksiyon.perform();// aksiyonu gerçekleştir
        System.out.println("Aksiyon gerçekleşti");

        //aksiyonlar.moveToElement(element).click().build().perform(); // kısa hali.
        driverBekleKapat();

    }


}
