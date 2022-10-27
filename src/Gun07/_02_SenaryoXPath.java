package Gun07;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

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
        username.sendKeys("problem_user");

        WebElement password=driver.findElement(By.xpath("//*[@placeholder='Password']"));
        password.sendKeys("secret_sauce");

        WebElement login=driver.findElement(By.xpath("//*[@type='submit']"));
        login.click();

        WebElement sauce1=driver.findElement(By.xpath("//div[contains(text(),'Sauce Labs Backpack')]"));
        sauce1.click();

        WebElement sepet1=driver.findElement(By.xpath("//button[contains(text(),'Add to cart')]"));
        sepet1.click();

        WebElement geri=driver.findElement(By.xpath("//*[@data-test='back-to-products']"));
        geri.click();

        WebElement sauce2=driver.findElement(By.xpath("//*[@id='item_1_title_link']"));
        sauce2.click();

        WebElement sepet2=driver.findElement(By.xpath("//*[@class='shopping_cart_link']"));
        sepet2.click();

        WebElement check=driver.findElement(By.xpath("//*[@data-test='checkout']"));
        check.click();

        MyFunc.Bekle(1);
        WebElement name=driver.findElement(By.xpath("//*[@placeholder='First Name'][@data-test='firstName']"));
        name.sendKeys("s");

        MyFunc.Bekle(1);
        WebElement surName=driver.findElement(By.xpath("//*[@placeholder='Last Name'][@data-test='lastName']"));
        surName.sendKeys("m");

        MyFunc.Bekle(1);
        WebElement zipCode=driver.findElement(By.xpath("//*[@placeholder='Zip/Postal Code']"));
        zipCode.sendKeys("44110");

        WebElement contine=driver.findElement(By.xpath("//*[@data-test='continue']"));
        contine.click();


        driverBekleKapat();


    }


}
