package Gun09;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _02_isDisplayed extends BaseDriver {

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

        WebElement email2 = driver.findElement(By.name("reg_email_confirmation__"));
        System.out.println("email2.isDisplayed() = " + email2.isDisplayed());
        Assert.assertFalse(email2.isDisplayed());

        MyFunc.Bekle(1);
        WebElement email = driver.findElement(By.name("reg_email__"));
        email.sendKeys("ismet@hotmail.com");

        email2 = driver.findElement(By.name("reg_email_confirmation__"));
        System.out.println("email2.isDisplayed() = " + email2.isDisplayed());
        Assert.assertTrue(email2.isDisplayed());

        driverBekleKapat();
    }

}
