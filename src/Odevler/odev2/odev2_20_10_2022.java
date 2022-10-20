package Odevler.odev2;

import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class odev2_20_10_2022 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://demoqa.com/text-box");

        WebElement name=driver.findElement(By.id("userName"));
        name.sendKeys("Automation");

        WebElement email=driver.findElement(By.id("userEmail"));
        email.sendKeys("Testing@gmail.com");

        WebElement adress=driver.findElement(By.id("currentAddress"));
        adress.sendKeys("Testing Permanent Address");

        WebElement click=driver.findElement(By.id("submit"));
        click.click();

        WebElement label=driver.findElement(By.id("userName-label"));
        System.out.println("label.getText() = " + label.getText());

        WebElement label2=driver.findElement(By.id("userEmail-label"));
        System.out.println("label2.getText() = " + label2.getText());

        MyFunc.Bekle(10);
        driver.quit();

        //sSs


    }
}
