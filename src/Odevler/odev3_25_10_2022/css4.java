package Odevler.odev3_25_10_2022;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class css4 extends BaseDriver {
    public static void main(String[] args) {


        driver.get("https://testpages.herokuapp.com/styled/index.html");

        WebElement calcu=driver.findElement(By.cssSelector("[id='calculatetest']"));
        calcu.click();
        MyFunc.Bekle(1);

        WebElement ilkİnput=driver.findElement(By.cssSelector("[id='number1']"));
        ilkİnput.sendKeys("44");
        MyFunc.Bekle(1);

        WebElement ikinciİnput=driver.findElement(By.cssSelector("[id='number2']"));
        ikinciİnput.sendKeys("40");
        MyFunc.Bekle(1);

        WebElement cal=driver.findElement(By.cssSelector("[id='calculate']"));
        cal.click();

        WebElement sonuc=driver.findElement(By.cssSelector("[id='answer']"));
        System.out.println("sonuc = " + sonuc.getText());

        driverBekleKapat();


    }
}
