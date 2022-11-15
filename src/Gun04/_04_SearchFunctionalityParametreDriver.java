package Gun04;
/*
       Senaryo ;
       1- Siteyi açınız.
       2- mac kelimeini göndererek aratınız.
       3- Çıkan sonuçlarda mac kelimesinin geçtiğini doğrulayınız.
       4- aynı işlemi samsung için de yapınız
     */

import Utility.BaseDriver;
import Utility.BaseDriverParameter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.List;

public class _04_SearchFunctionalityParametreDriver extends BaseDriverParameter {

    @Test
    @Parameters("aranacakKelime")
    void Test1(String aranacakKelime){

        WebElement search=driver.findElement(By.name("search"));
        search.sendKeys(aranacakKelime);

        WebElement click=driver.findElement(By.cssSelector("[class='input-group-btn']>button[type='button']"));
        click.click();

        List<WebElement> captions=driver.findElements(By.cssSelector("div[class='caption']>h4"));

        for(WebElement e:captions)
            Assert.assertTrue(e.getText().toLowerCase().contains(aranacakKelime));
    }
}
