package Gun07;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class _02_SenaryoXPath extends BaseDriver {

    @Test
    public void Test1() {

        //        (//*[@class='input_error form_input'])[1]
//         //*[@placeholder='Username']
//        //*[text()='Accepted usernames are:']
//
//        //*[text()='Accepted usernames are:']/..

        //WebElement element=driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/form/div[1]/input"));
        //uzun path oldugundan kullanışsız hem yazım zorluğu ve hem de yolun bozulma ihtimali çok yüksek : ABSOLUTE XPATH

        //WebElement element=driver.findElement(By.xpath("//input[@id='user-name']" )); // Relative XPath

        driver.get("https://www.saucedemo.com/");

        WebElement username=driver.findElement(By.xpath("//*[@placeholder='Username']"));
        username.sendKeys("standard_user");

        MyFunc.Bekle(1);

        WebElement password=driver.findElement(By.xpath("//*[@placeholder='Password']"));
        password.sendKeys("secret_sauce");

        MyFunc.Bekle(1);

        WebElement login=driver.findElement(By.xpath("//*[@type='submit']"));
        login.click();

        MyFunc.Bekle(1);

        WebElement sauce1=driver.findElement(By.xpath("//div[contains(text(),'Sauce Labs Backpack')]"));
        sauce1.click();

        MyFunc.Bekle(1);

        WebElement sepet1=driver.findElement(By.xpath("//button[contains(text(),'Add to cart')]"));
        sepet1.click();

        MyFunc.Bekle(1);

        WebElement geri=driver.findElement(By.xpath("//*[@data-test='back-to-products']"));
        geri.click();

        MyFunc.Bekle(1);

        WebElement sauce2=driver.findElement(By.xpath("//div[text()='Sauce Labs Bolt T-Shirt']"));
        sauce2.click();

        MyFunc.Bekle(1);

        WebElement addcart=driver.findElement(By.xpath("//button[text()='Add to cart']"));
        addcart.click();

        MyFunc.Bekle(1);

        WebElement sepet2=driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
        sepet2.click();

        MyFunc.Bekle(1);

        WebElement check=driver.findElement(By.xpath("//*[@data-test='checkout']"));
        check.click();

        MyFunc.Bekle(1);

        WebElement name=driver.findElement(By.xpath("//*[@placeholder='First Name'][@data-test='firstName']"));
        name.sendKeys("Seyf");

        MyFunc.Bekle(1);

        WebElement surName=driver.findElement(By.xpath("//*[@placeholder='Last Name'][@data-test='lastName']"));
        surName.sendKeys("Mavus");

        MyFunc.Bekle(1);

        WebElement zipCode=driver.findElement(By.xpath("//*[@placeholder='Zip/Postal Code']"));
        zipCode.sendKeys("44110");

        MyFunc.Bekle(1);

        WebElement contine=driver.findElement(By.xpath("//*[@data-test='continue']"));
        contine.click();

        //ürün ücretleri

        List<WebElement> ucretler=driver.findElements(By.xpath("//div[@class='inventory_item_price']"));

        double toplam=0;
        for (WebElement e: ucretler)
        {
            //System.out.println(e.getText());
            toplam +=Double.parseDouble(e.getText().substring(1));
        }
        System.out.println("toplam = " + toplam);

        WebElement webAltToplam=driver.findElement(By.xpath("//div[@class='summary_subtotal_label']"));
        //System.out.println("webAltToplam = " + webAltToplam);
        double altToplam=Double.parseDouble(webAltToplam.getText().substring(13));
        System.out.println("altToplam = " + altToplam);

        Assert.assertTrue("Değerler eşit değil",(toplam==altToplam));


        driverBekleKapat();


    }


}
