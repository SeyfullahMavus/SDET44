package Gun08;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _02_Soru_cozum2 extends BaseDriver {
    @Test
    public void Test1() {
        driver.get("https://www.facebook.com/");

        MyFunc.Bekle(2);
        WebElement cookiesAccept = driver.findElement(By.xpath("//*[text()='Allow essential and optional cookies']"));
        cookiesAccept.click();

        MyFunc.Bekle(2);
        WebElement btnYeniHesap = driver.findElement(By.linkText("Create New Account"));
        btnYeniHesap.click();

        MyFunc.Bekle(1);
        WebElement firstname = driver.findElement(By.name("firstname"));
        firstname.sendKeys("ismet");

        MyFunc.Bekle(1);
        WebElement lastname = driver.findElement(By.name("lastname"));
        lastname.sendKeys("temur");

        // #fullname_field+div+div    -> WebElementi buldu, getattribute ile Class controlü yaptı
        //görünmüyor
        WebElement hiddenElement = driver.findElement(By.cssSelector("#fullname_field+div+div"));
        Assert.assertTrue("Email girmeden önce gizli durumu", hiddenElement.getAttribute("class").equals("hidden_elem"));

        MyFunc.Bekle(1);
        WebElement email = driver.findElement(By.name("reg_email__"));
        email.sendKeys("ismet@hotmail.com");

        //görünüyor
        hiddenElement = driver.findElement(By.cssSelector("#fullname_field+div+div"));
        Assert.assertFalse("Email girdikten sonra gizli durumu", hiddenElement.getAttribute("class").equals("hidden_elem"));

        WebElement email2=driver.findElement(By.name("reg_email_confirmation__")); // 2.email girdik
        email2.sendKeys("ismet@hotmail.com");

        MyFunc.Bekle(1);
        WebElement day = driver.findElement(By.id("day"));
        Select dropDownday = new Select(day);
        dropDownday.selectByValue("4");

        MyFunc.Bekle(1);
        WebElement month = driver.findElement(By.id("month"));
        Select dropDownMonth = new Select(month);
        dropDownMonth.selectByValue("10");

        MyFunc.Bekle(1);
        WebElement year = driver.findElement(By.id("year"));
        Select dropDownYear = new Select(year);
        dropDownYear.selectByValue("2000");

        MyFunc.Bekle(1);
        WebElement sex= driver.findElement(By.cssSelector("input[value='2'][name='sex']"));
        sex.click();

        // #fullname_field+div+div    -> WebElementi buldu, getattribute ile Class controlü yaptı

        //menu.selectByValue("23");
        driverBekleKapat();

    }
}
