package Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BaseDriver {

    public static WebDriver driver;

    static {
        //ilk adımda çalışan kod kısmı expentd yapınca

        KalanOncekileriKapat();

        Logger logger=Logger.getLogger("");//sisteme ait bütün logları üreten objeye/servise ulaştım ""
        logger.setLevel(Level.SEVERE);//sadece errorları göster

        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true");// ChromeServici sessiz modda çalıştı
        // çıkan kırmızı hata kodları benzerlerini silme
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        driver = new ChromeDriver(); // web sayfasını kontrol eden görevli

        driver.manage().window().maximize();// ekranı max yapıyor.
        driver.manage().deleteAllCookies();// sitenin senin bilgisayarında yaptığı ayarları siliyor, sayfa başlangıç ayarlarına dönüyor
        //ilk defa siteye giriyon gibi oluyo


        Duration dr = Duration.ofSeconds(30);
        driver.manage().timeouts().pageLoadTimeout(dr);// sadece tüm sayfanın kodlarının bilgisayarınıza inme süresiyle ilgili
        // bu eklenmezse selenium sayfa yüklenene kadar(sonsuza) bekler. : 30 sn süresince sayfanın yüklenmesini bekle yüklenmezse hata ver
        //eğer 2 sn yüklerse 30 sn. beklemez.

        driver.manage().timeouts().implicitlyWait(dr);// bütün webelementlerin element bazında, elemente özel işlem yapılmadan önce
        //hazır hale gelmesi için verilen mühlet yani süre.

    }

    public static void KalanOncekileriKapat() {

        try {
            Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe /T");
        } catch (Exception ignored) {

        }
    }

    public static void driverBekleKapat() {
        MyFunc.Bekle(5);
        driver.quit();

    }
}
