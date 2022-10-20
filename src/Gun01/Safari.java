package Gun01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Safari {
    public static void main(String[] args) {


        WebDriver driver=new SafariDriver();
       // driver.manage().window().maximize();
        driver.get("https://www.google.com");
    }
}
