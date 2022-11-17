package Gun05;

/**
 * Daha önceki derslerde yaptğımız Search fonksiyonunu
 * mac,ipod ve samsung için Dataprovider ile yapınız.
 */


import Utility.BaseDriver;
import Utility.BaseDriverParameter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.List;

public class _04_Task_1 extends BaseDriver {

    @Test(dataProvider = "getData")
    void SearchFunction(String aranacakKelime){

        WebElement searchInput = driver.findElement(By.name("search"));
        searchInput.clear();
        searchInput.sendKeys(aranacakKelime);

        WebElement searchButton =
                driver.findElement(By.cssSelector("button[class='btn btn-default btn-lg']"));
        searchButton.click();

        List<WebElement> captions= driver.findElements(By.cssSelector("div[class='caption']>h4"));

        for(WebElement e: captions)
            Assert.assertTrue(e.getText().toLowerCase().contains(aranacakKelime));
    }

    @DataProvider
    public Object[] getData()
    {
        Object[] data={"mac","ipod","samsung"};
        return  data;
    }
}

