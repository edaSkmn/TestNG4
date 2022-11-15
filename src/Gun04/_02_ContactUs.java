package Gun04;
/*
  1- ContactUs a tıklayınız
  2- Mesaj kutusuna en az 10 karakterlik bir mesaj yazınız.
  3- Submit ettikten sonra Contact US yazısını doğrulayınız.
 */

import Utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class _02_ContactUs extends BaseDriver {

    @Test
    @Parameters("mesaj")  // xml deki parametre adi ile ayni olmak zorunda
    void contactUs(String gelenMesaj){ // metod icin gerekli tanimlama, ayni olmak zorunda degil parametre ile

        WebElement contact=driver.findElement(By.linkText("Contact Us"));
        contact.click();

        driver.findElement(By.cssSelector("#input-enquiry")).sendKeys(gelenMesaj);

        driver.findElement(By.cssSelector("[type='submit']")).click();

        Assert.assertTrue(driver.getCurrentUrl().contains("contact"));


    }
}
