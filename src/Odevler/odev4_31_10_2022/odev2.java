package Odevler.odev4_31_10_2022;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class odev2 extends BaseDriver {

    @Test
    public void Test1()
    {

        driver.get("http://dhtmlgoodies.com/scripts/drag-drop-nodes/drag-drop-nodes.html");

        //öğrenciler

        WebElement a=driver.findElement(By.id("node1"));
        WebElement b=driver.findElement(By.id("node2"));
        WebElement c=driver.findElement(By.id("node3"));
        WebElement d=driver.findElement(By.id("node4"));
        WebElement e=driver.findElement(By.id("node5"));
        WebElement f=driver.findElement(By.id("node6"));
        WebElement g=driver.findElement(By.id("node7"));
        WebElement h=driver.findElement(By.id("node8"));
        WebElement i=driver.findElement(By.id("node9"));
        WebElement j=driver.findElement(By.id("node10"));
        WebElement k=driver.findElement(By.id("node11"));
        WebElement l=driver.findElement(By.id("node12"));
        WebElement m=driver.findElement(By.id("node13"));
        WebElement n=driver.findElement(By.id("node14"));
        WebElement o=driver.findElement(By.id("node15"));
        WebElement p=driver.findElement(By.id("node16"));
        WebElement q=driver.findElement(By.id("node17"));
        WebElement r=driver.findElement(By.id("node18"));
        WebElement s=driver.findElement(By.id("node19"));
        WebElement t=driver.findElement(By.id("node20"));
        WebElement u=driver.findElement(By.id("node21"));

        //sınıflar

        WebElement aTeam=driver.findElement(By.id("box1"));
        WebElement bTeam=driver.findElement(By.id("box2"));
        WebElement cTeam=driver.findElement(By.id("box3"));
        WebElement dTeam=driver.findElement(By.id("box4"));
        WebElement eTeam=driver.findElement(By.id("box5"));

        //Actionss


        Actions actions=new Actions(driver);


        actions.clickAndHold(a).build().perform();
        MyFunc.Bekle(1);
        actions.moveToElement(aTeam).release().build().perform();

        actions.clickAndHold(b).build().perform();
        MyFunc.Bekle(1);
        actions.moveToElement(aTeam).release().build().perform();

        actions.clickAndHold(c).build().perform();
        MyFunc.Bekle(1);
        actions.moveToElement(aTeam).release().build().perform();

        actions.clickAndHold(d).build().perform();
        MyFunc.Bekle(1);
        actions.moveToElement(aTeam).release().build().perform();

        actions.clickAndHold(e).build().perform();
        MyFunc.Bekle(1);
        actions.moveToElement(bTeam).release().build().perform();

        actions.clickAndHold(f).build().perform();
        MyFunc.Bekle(1);
        actions.moveToElement(bTeam).release().build().perform();

        actions.clickAndHold(g).build().perform();
        MyFunc.Bekle(1);
        actions.moveToElement(bTeam).release().build().perform();

        actions.clickAndHold(h).build().perform();
        MyFunc.Bekle(1);
        actions.moveToElement(bTeam).release().build().perform();

        actions.clickAndHold(i).build().perform();
        MyFunc.Bekle(1);
        actions.moveToElement(cTeam).release().build().perform();

        actions.clickAndHold(j).build().perform();
        MyFunc.Bekle(1);
        actions.moveToElement(cTeam).release().build().perform();

        actions.clickAndHold(k).build().perform();
        MyFunc.Bekle(1);
        actions.moveToElement(cTeam).release().build().perform();

        actions.clickAndHold(l).build().perform();
        MyFunc.Bekle(1);
        actions.moveToElement(cTeam).release().build().perform();

        actions.clickAndHold(m).build().perform();
        MyFunc.Bekle(1);
        actions.moveToElement(dTeam).release().build().perform();

        actions.clickAndHold(n).build().perform();
        MyFunc.Bekle(1);
        actions.moveToElement(dTeam).release().build().perform();

        actions.clickAndHold(o).build().perform();
        MyFunc.Bekle(1);
        actions.moveToElement(dTeam).release().build().perform();

        actions.clickAndHold(p).build().perform();
        MyFunc.Bekle(1);
        actions.moveToElement(eTeam).release().build().perform();

        actions.clickAndHold(q).build().perform();
        MyFunc.Bekle(1);
        actions.moveToElement(eTeam).release().build().perform();

        actions.clickAndHold(r).build().perform();
        MyFunc.Bekle(1);
        actions.moveToElement(eTeam).release().build().perform();

        actions.clickAndHold(s).build().perform();
        MyFunc.Bekle(1);
        actions.moveToElement(eTeam).release().build().perform();

        actions.clickAndHold(t).build().perform();
        MyFunc.Bekle(1);
        actions.moveToElement(eTeam).release().build().perform();

        actions.clickAndHold(u).build().perform();
        MyFunc.Bekle(1);
        actions.moveToElement(eTeam).release().build().perform();

        driverBekleKapat();

    }
}
