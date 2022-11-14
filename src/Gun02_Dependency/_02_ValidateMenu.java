package Gun02_Dependency;
/*
  Senaryo
  1- Siteyi açınız.
  2- Top Menudeki menu elemanlarının olduğunu doğrulayınız.(menuValidation)
  3- Desktops, Laptops & Notebooks, Components, Tablets, Software, Phones & PDAs, Cameras, MP3 Players
 */

import Utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class _02_ValidateMenu extends BaseDriver {

    @Test
    void menuValidation() {

        List<WebElement> menuActualList = driver.findElements(By.cssSelector("[class='nav navbar-nav'] > li")); // olan listeyi getirdik

//        for (WebElement e : menuActualList)
//            System.out.println(e.getText());


        List<String> menuExpextedList=new ArrayList<>(); // beklenen listeyi olsuturduk
        menuExpextedList.add("Desktops");
        menuExpextedList.add("Laptops & Notebooks");
        menuExpextedList.add("Components");
        menuExpextedList.add("Tablets");
        menuExpextedList.add("Software");
        menuExpextedList.add("Phones & PDAs");
        menuExpextedList.add("Cameras");
        menuExpextedList.add("MP3 Players");

        for (int i = 0; i < menuExpextedList.size(); i++) {
            Assert.assertEquals(menuExpextedList.get(i),menuActualList.get(i).getText(),"Menu beklenen gibi degil"); // karsilastirmayi yaptik burada

        }
    }
}
