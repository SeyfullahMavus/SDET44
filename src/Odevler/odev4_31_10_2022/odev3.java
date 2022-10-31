package Odevler.odev4_31_10_2022;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class odev3 extends BaseDriver {


    @Test
    public void Test1()
    {

        driver.get("http://dhtmlgoodies.com/scripts/drag-drop-nodes-quiz/drag-drop-nodes-quiz.html");


        //sehirler

        WebElement bigBen=driver.findElement(By.id("node9"));
        WebElement mao=driver.findElement(By.id("node15"));
        WebElement winstonChurchill=driver.findElement(By.id("node14"));
        WebElement nedKelly=driver.findElement(By.id("node17"));
        WebElement fridtjofNansen=driver.findElement(By.id("node12"));
        WebElement notreDame=driver.findElement(By.id("node8"));
        WebElement oslo=driver.findElement(By.id("node1"));
        WebElement mississippi=driver.findElement(By.id("node21"));
        WebElement queensland=driver.findElement(By.id("node11"));
        WebElement paris=driver.findElement(By.id("node2"));
        WebElement rome=driver.findElement(By.id("node18"));
        WebElement johnFKennedy=driver.findElement(By.id("node16"));
        WebElement galileoGalilei=driver.findElement(By.id("node20"));
        WebElement beijing=driver.findElement(By.id("node4"));
        WebElement washington=driver.findElement(By.id("node5"));
        WebElement vaticanCity=driver.findElement(By.id("node19"));
        WebElement geirangerFjord=driver.findElement(By.id("node7"));
        WebElement napoleonBonaparte=driver.findElement(By.id("node13"));
        WebElement london=driver.findElement(By.id("node3"));
        WebElement canberra=driver.findElement(By.id("node6"));
        WebElement theForbiddenCity=driver.findElement(By.id("node10"));

        //Ulkeler

        WebElement italy=driver.findElement(By.id("box1"));
        WebElement norway=driver.findElement(By.id("box2"));
        WebElement unitedKingdom=driver.findElement(By.id("box3"));
        WebElement unitedStates=driver.findElement(By.id("box4"));
        WebElement china=driver.findElement(By.id("box5"));
        WebElement australia=driver.findElement(By.id("box6"));
        WebElement france=driver.findElement(By.id("box7"));

        Actions actions=new Actions(driver);


        MyFunc.Bekle(2);
        actions.clickAndHold(galileoGalilei).build().perform();
        MyFunc.Bekle(2);
        actions.moveToElement(italy).release().build().perform();

        MyFunc.Bekle(2);
        actions.clickAndHold(rome).build().perform();
        MyFunc.Bekle(2);
        actions.moveToElement(italy).release().build().perform();

        MyFunc.Bekle(2);
        actions.clickAndHold(vaticanCity).build().perform();
        MyFunc.Bekle(2);
        actions.moveToElement(italy).release().build().perform();

        actions.clickAndHold(geirangerFjord).build().perform();
        MyFunc.Bekle(1);
        actions.moveToElement(norway).release().build().perform();

        actions.clickAndHold(fridtjofNansen).build().perform();
        MyFunc.Bekle(1);
        actions.moveToElement(norway).release().build().perform();

        actions.clickAndHold(oslo).build().perform();
        MyFunc.Bekle(1);
        actions.moveToElement(norway).release().build().perform();

        actions.clickAndHold(london).build().perform();
        MyFunc.Bekle(1);
        actions.moveToElement(unitedKingdom).release().build().perform();

        actions.clickAndHold(winstonChurchill).build().perform();
        MyFunc.Bekle(1);
        actions.moveToElement(unitedKingdom).release().build().perform();

        actions.clickAndHold(bigBen).build().perform();
        MyFunc.Bekle(1);
        actions.moveToElement(unitedKingdom).release().build().perform();

        actions.clickAndHold(washington).build().perform();
        MyFunc.Bekle(1);
        actions.moveToElement(unitedStates).release().build().perform();

        actions.clickAndHold(mississippi).build().perform();
        MyFunc.Bekle(1);
        actions.moveToElement(unitedStates).release().build().perform();

        actions.clickAndHold(johnFKennedy).build().perform();
        MyFunc.Bekle(1);
        actions.moveToElement(unitedStates).release().build().perform();

        actions.clickAndHold(mao).build().perform();
        MyFunc.Bekle(1);
        actions.moveToElement(china).release().build().perform();

        actions.clickAndHold(theForbiddenCity).build().perform();
        MyFunc.Bekle(1);
        actions.moveToElement(china).release().build().perform();

        actions.clickAndHold(beijing).build().perform();
        MyFunc.Bekle(1);
        actions.moveToElement(china).release().build().perform();

        actions.clickAndHold(queensland).build().perform();
        MyFunc.Bekle(1);
        actions.moveToElement(australia).release().build().perform();

        actions.clickAndHold(canberra).build().perform();
        MyFunc.Bekle(1);
        actions.moveToElement(australia).release().build().perform();

        actions.clickAndHold(nedKelly).build().perform();
        MyFunc.Bekle(1);
        actions.moveToElement(australia).release().build().perform();

        actions.clickAndHold(notreDame).build().perform();
        MyFunc.Bekle(1);
        actions.moveToElement(france).release().build().perform();

        actions.clickAndHold(napoleonBonaparte).build().perform();
        MyFunc.Bekle(1);
        actions.moveToElement(france).release().build().perform();

        actions.clickAndHold(paris).build().perform();
        MyFunc.Bekle(1);
        actions.moveToElement(france).release().build().perform();

       // driverBekleKapat();


    }

}
