package Odevler.odev2_20_10_2022;

import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class odev6 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://testpages.herokuapp.com/styled/index.html");

        WebElement fak = driver.findElement(By.id("fakealerttest"));
        fak.click();

        MyFunc.Bekle(1);

        WebElement dia = driver.findElement(By.id("modaldialog"));
        dia.click();

        MyFunc.Bekle(1);

        WebElement okk = driver.findElement(By.id("dialog-ok"));
        okk.click();

        MyFunc.Bekle(5);
        driver.quit();


    }
}
