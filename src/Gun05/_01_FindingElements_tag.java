package Gun05;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class _01_FindingElements_tag extends BaseDriver {
    public static void main(String[] args) {

        //driverBaslat();

        driver.get("https://www.hepsiburada.com/");// web sayfasını aç

        List<WebElement> linkler = driver.findElements(By.tagName("a")); // tag ine göre bulma
        // - s korsan hepsini yoksa ilkini bulur. sayfadaki tüm linkleri verir

        for (WebElement e : linkler)
            if (e.getText().equals(""))// kırık link yani ekranda gözüken kısmı yok
            {
                System.out.println("e.getAttribute(\"href\") = " + e.getAttribute("href"));
                System.out.println("e.getAttribute(\"title\") = " + e.getAttribute("title"));
                System.out.println("e.getAttribute(\"rel\") = " + e.getAttribute("rel"));
            }


        driverBekleKapat();


    }
}
