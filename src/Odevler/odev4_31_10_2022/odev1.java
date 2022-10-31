package Odevler.odev4_31_10_2022;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class odev1 extends BaseDriver {

    @Test
    public void Test1(){






        driver.get("http://dhtmlgoodies.com/scripts/drag-drop-quiz/drag-drop-quiz-d2.html");


        //Ulkeler

        WebElement spain = driver.findElement(By.id("q6"));
        WebElement greece = driver.findElement(By.id("q7"));
        WebElement vietnam = driver.findElement(By.id("q15"));
        WebElement italy = driver.findElement(By.id("q10"));
        WebElement india = driver.findElement(By.id("q12"));
        WebElement unitedKingdom = driver.findElement(By.id("q8"));
        WebElement france = driver.findElement(By.id("q5"));
        WebElement malaysia = driver.findElement(By.id("q14"));
        WebElement kenya = driver.findElement(By.id("q13"));
        WebElement denmark = driver.findElement(By.id("q3"));
        WebElement unitedStates = driver.findElement(By.id("q4"));
        WebElement chile = driver.findElement(By.id("q11"));
        WebElement sweden = driver.findElement(By.id("q2"));
        WebElement austria = driver.findElement(By.id("q9"));
        WebElement norway = driver.findElement(By.id("q1"));

        //Sehirler

        WebElement london = driver.findElement(By.id("a8"));
        WebElement athens = driver.findElement(By.id("a7"));
        WebElement paris = driver.findElement(By.id("a5"));
        WebElement santiago = driver.findElement(By.id("a11"));
        WebElement oslo = driver.findElement(By.id("a1"));
        WebElement newDehli = driver.findElement(By.id("a12"));
        WebElement copenhagen = driver.findElement(By.id("a3"));
        WebElement stockholm = driver.findElement(By.id("a2"));
        WebElement washington = driver.findElement(By.id("a4"));
        WebElement nairobi = driver.findElement(By.id("a13"));
        WebElement kualaLumpur = driver.findElement(By.id("a14"));
        WebElement vienna = driver.findElement(By.id("a9"));
        WebElement madrid = driver.findElement(By.id("a6"));
        WebElement rome = driver.findElement(By.id("a10"));
        WebElement hanoi = driver.findElement(By.id("a15"));


        //Actionss


        Actions actions=new Actions(driver);

       // actions.dragAndDrop(rome,italy).build().perform();

        actions.clickAndHold(madrid).build().perform();
        MyFunc.Bekle(1);
        actions.moveToElement(spain).release().build().perform();


        actions.clickAndHold(santiago).build().perform();
        MyFunc.Bekle(1);
        actions.moveToElement(chile).release().build().perform();


        actions.clickAndHold(washington).build().perform();
        MyFunc.Bekle(1);
        actions.moveToElement(unitedStates).release().build().perform();

        actions.clickAndHold(nairobi).build().perform();
        MyFunc.Bekle(1);
        actions.moveToElement(kenya).release().build().perform();

        actions.clickAndHold(kualaLumpur).build().perform();
        MyFunc.Bekle(1);
        actions.moveToElement(malaysia).release().build().perform();

        actions.clickAndHold(paris).build().perform();
        MyFunc.Bekle(1);
        actions.moveToElement(france).release().build().perform();

        actions.clickAndHold(london).build().perform();
        MyFunc.Bekle(1);
        actions.moveToElement(unitedKingdom).release().build().perform();

        actions.clickAndHold(copenhagen).build().perform();
        MyFunc.Bekle(1);
        actions.moveToElement(denmark).release().build().perform();

        actions.clickAndHold(vienna).build().perform();
        MyFunc.Bekle(1);
        actions.moveToElement(austria).release().build().perform();

        actions.clickAndHold(newDehli).build().perform();
        MyFunc.Bekle(1);
        actions.moveToElement(india).release().build().perform();

        actions.clickAndHold(stockholm).build().perform();
        MyFunc.Bekle(1);
        actions.moveToElement(sweden).release().build().perform();

        actions.clickAndHold(hanoi).build().perform();
        MyFunc.Bekle(1);
        actions.moveToElement(vietnam).release().build().perform();

        actions.clickAndHold(athens).build().perform();
        MyFunc.Bekle(1);
        actions.moveToElement(greece).release().build().perform();

        actions.clickAndHold(oslo).build().perform();
        MyFunc.Bekle(1);
        actions.moveToElement(norway).release().build().perform();

        actions.clickAndHold(rome).build().perform();
        MyFunc.Bekle(1);
        actions.moveToElement(italy).release().build().perform();


        MyFunc.Bekle(2);

        driverBekleKapat();

    }

}
