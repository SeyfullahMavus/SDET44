package Odevler.odev2_20_10_2022;

import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



/*

    1) Bu siteye gidin. ->  http://demoqa.com/text-box

    2) Full Name kısmına "Automation" girin.

    3) Email kısmına "Testing@gmail.com" girin.

    4) Current Address kısmına "Testing Current Address" girin.

    5) Permanent Address kısmına "Testing Permanent Address" girin.

    6) Submit butonuna tıklayınız.

    7) Full Name'in, "Automation"ı içinde bulundurduğunu doğrulayın.

    8) Email'in, "Testing"ı içinde bulundurduğunu doğrulayın.

 */



public class odev1 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://demoqa.com/text-box");

        WebElement name = driver.findElement(By.id("userName"));
        name.sendKeys("Automation");

        WebElement email = driver.findElement(By.id("userEmail"));
        email.sendKeys("Testing@gmail.com");

        WebElement adress = driver.findElement(By.id("currentAddress"));
        adress.sendKeys("Testing Permanent Address");


        WebElement Submit = driver.findElement(By.id("submit"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Submit);
        Submit.click();

        WebElement namee=driver.findElement(By.id("userEmail-label"));
        WebElement emaill=driver.findElement(By.id("userEmail-label"));

        if (namee.getText().contains("Automation")) {
            System.out.println("Automation = Var");
        } else {
            System.out.println("Automation = Yok");
        }

        if (emaill.getText().contains("Testing")) {
            System.out.println("Testing = Var");
        } else {
            System.out.println("Testing = Yok");
        }

        WebElement label = driver.findElement(By.id("userName-label"));
        System.out.println("label.getText() = " + label.getText());

        WebElement label2 = driver.findElement(By.id("userEmail-label"));
        System.out.println("label2.getText() = " + label2.getText());


        MyFunc.Bekle(5);
        driver.quit();


    }
}
