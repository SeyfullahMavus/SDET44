package Gun04;

import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _02_FindingById {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();// web sayfasını kontrol eden görevli
        driver.get("https://form.jotform.com/221934510376353");// web sayfasını aç


        WebElement name=driver.findElement(By.id("first_8"));// elemanı bulma
        name.sendKeys("Seyf");// kutucuklara yazı gönderme

        WebElement surName=driver.findElement(By.id("last_8"));// elemanı bulma
        surName.sendKeys("Mavus");// kutucuklara yazı gönderme


        WebElement lableFirstName=driver.findElement(By.id("sublabel_8_first"));
        System.out.println("lable1.getText() = " + lableFirstName.getText());

        WebElement lableLastName=driver.findElement(By.id("sublabel_8_last"));
        System.out.println("lableLastName.getText() = " + lableLastName.getText());





        MyFunc.Bekle(8);
        driver.quit();


    }
}
