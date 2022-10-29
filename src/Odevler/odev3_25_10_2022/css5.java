package Odevler.odev3_25_10_2022;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class css5 extends BaseDriver {
    public static void main(String[] args) {

        driver.get("https://testpages.herokuapp.com/styled/index.html");

        WebElement fake=driver.findElement(By.cssSelector("[id='fakealerttest']"));
        fake.click();
        MyFunc.Bekle(1);

        WebElement show=driver.findElement(By.cssSelector("[id='fakealert']"));
        show.click();
        MyFunc.Bekle(1);

        WebElement ok=driver.findElement(By.cssSelector("[id='dialog-ok']"));
        ok.click();

        driverBekleKapat();


    }
}
