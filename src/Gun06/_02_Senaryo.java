package Gun06;

import Utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _02_Senaryo extends BaseDriver {
    public static void main(String[] args) {

        driver.get("https://formsmarts.com/form/yu?mode=h5");

        WebElement Bus = driver.findElement(By.cssSelector("[id='u_SSt_4586_0']"));
        Bus.click();

        WebElement dis = driver.findElement(By.cssSelector("[id='u_SSt_4588']"));
        dis.click();
        WebElement diss = driver.findElement(By.cssSelector("#u_SSt_4588 > :nth-child(4)"));
        diss.click();

        WebElement ever = driver.findElement(By.cssSelector("#u_SSt_89585_0"));
        ever.click();

        WebElement good = driver.findElement(By.cssSelector("#u_SSt_4589_0"));
        good.click();

        WebElement usin = driver.findElement(By.cssSelector("#u_SSt_4597"));
        usin.click();
        WebElement using = driver.findElement(By.cssSelector("#u_SSt_4597 > :nth-child(4)"));
        using.click();
        good.click();

        driverBekleKapat();


    }
}
