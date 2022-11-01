package Gun10;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import sun.management.snmp.jvmmib.JVM_MANAGEMENT_MIBOidTable;

public class _02_Soru extends BaseDriver {
        // bir önceki örnekte sürgüyü 200$ ve 400$ arasını gösterecek şekilde konumlandırınız

       // WebElement sagsurgu = driver.findElement(By.cssSelector("[class='ui-slider-handle ui-state-default ui-corner-all'][style='left: 60%;']"));
      // aksiyonlar.dragAndDropBy(sagsurgu, 100, 0).build().perform();
       public static void main(String[] args) {



           driver.get("https://talkerscode.com/webtricks/demo/demo_price-range-slider-using-jquery-css-and-php.php");

           WebElement solSurgu=driver.findElement(By.xpath("//*[@id='slider-range']/span[1]"));
           //2.sürgü div[id='slider-range']>:nth-child(3)
           MyFunc.Bekle(2);
           WebElement sagsurgu = driver.findElement(By.cssSelector("[class='ui-slider-handle ui-state-default ui-corner-all'][style='left: 60%;']"));
           MyFunc.Bekle(2);

           Actions aksiyonlar=new Actions(driver);
           Action aksiyon=aksiyonlar.dragAndDropBy(solSurgu,100,0).build();
           MyFunc.Bekle(2);

           aksiyon.perform();
           aksiyonlar.dragAndDropBy(sagsurgu, 101, 0).build().perform();

           driverBekleKapat();


       }
}
