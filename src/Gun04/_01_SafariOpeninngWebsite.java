package Gun04;

import Utility.MyFunc;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class _01_SafariOpeninngWebsite {
    public static void main(String[] args) {


        WebDriver driver=new SafariDriver();
        driver.get("https://www.google.com");

        MyFunc.Bekle(8);
        driver.quit();


    }
}
