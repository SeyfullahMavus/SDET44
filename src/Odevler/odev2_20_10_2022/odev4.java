package Odevler.odev2_20_10_2022;

import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class odev4 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://testpages.herokuapp.com/styled/index.html");

        WebElement Calculator = driver.findElement(By.id("calculatetest"));

        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Calculator);

        Calculator.click();

        WebElement ilk = driver.findElement(By.id("number1"));
        ilk.sendKeys("44");

        WebElement iki = driver.findElement(By.id("number2"));
        iki.sendKeys("40");

        MyFunc.Bekle(1);

        WebElement calcu = driver.findElement(By.id("calculate"));
        calcu.click();

        WebElement sonuc = driver.findElement(By.id("answer"));
        System.out.println("sonuc.getText() = " + sonuc.getText());

        MyFunc.Bekle(5);
        driver.quit();


    }
}
