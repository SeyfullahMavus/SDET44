package Odevler.odev3_25_10_2022;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class css1 extends BaseDriver {
    public static void main(String[] args) {

        driver.get("http://demoqa.com/text-box");

        WebElement fullName=driver.findElement(By.cssSelector("[placeholder='Full Name']"));
        fullName.sendKeys("Automation");
        MyFunc.Bekle(1);

        WebElement email=driver.findElement(By.cssSelector("[placeholder='name@example.com']"));
        email.sendKeys("Testing@gmail.com");
        MyFunc.Bekle(1);

        WebElement address=driver.findElement(By.cssSelector("[placeholder='Current Address']"));
        address.sendKeys("Testing Current Address");
        MyFunc.Bekle(1);

        WebElement perAddress=driver.findElement(By.cssSelector("[id='permanentAddress']"));
        perAddress.sendKeys("Testing Permanent Address");
        MyFunc.Bekle(1);

        WebElement submit=driver.findElement(By.cssSelector("[id='submit']"));
        submit.click();
        MyFunc.Bekle(1);

        WebElement automation=driver.findElement(By.cssSelector("[id='name']"));
        Assert.assertTrue("sonuç bulunamadı",automation.getText().contains("Automation"));

        WebElement Testing=driver.findElement(By.cssSelector("[id='email']"));
        Assert.assertTrue("sonuç bulunamadı",Testing.getText().contains("Testing"));


        driverBekleKapat();
    }
}
