package Gun06;
/*
   Senaryo :
   1- Siteyi açınız.
   2- Sitede "ipod" kelimesini aratınız
   3- Çıkan sonuçlardan ilkini sepete atınız.
   4- Shopping Chart a tıklatınız.
   5- Checkout yapınız.
   6- Continue butonalarına tıklatıp bilgileri giriniz.
   7- En confirm ile siparişi verdiğinizi doğrulayınız.
      doğrulamayı çıkan sayfadaki "Your order has been placed" yazısı ile yapınız.
*/

import Utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _01_PlaceOrder extends BaseDriver {

    @Test
    void checkOut() {

        WebElement search = driver.findElement(By.name("search"));
        search.sendKeys("ipod");

        WebElement button = driver.findElement(By.cssSelector("[class='btn btn-default btn-lg']"));
        button.click();

        WebElement addToCart = driver.findElement(By.xpath("//span[text()='Add to Cart']"));
        addToCart.click();

        WebElement shoppingCart = driver.findElement(By.linkText("Shopping Cart"));
        shoppingCart.click();

        WebElement checkOut = driver.findElement(By.linkText("Checkout"));
        checkOut.click();

        WebElement continue1 = wait.until(ExpectedConditions.elementToBeClickable(By.id("button-payment-address")));
        continue1.click();

        WebElement continue2 = wait.until(ExpectedConditions.elementToBeClickable(By.id("button-shipping-address")));
        continue2.click();

        WebElement continue3 = wait.until(ExpectedConditions.elementToBeClickable(By.id("button-shipping-method")));
        continue3.click();

        WebElement agree = driver.findElement(By.cssSelector("[name='agree']"));
        agree.click();

        WebElement continue4 = wait.until(ExpectedConditions.elementToBeClickable(By.id("button-payment-method")));
        continue4.click();

        WebElement confirm = wait.until(ExpectedConditions.elementToBeClickable(By.id("button-confirm")));
        confirm.click();

        wait.until(ExpectedConditions.urlContains("success"));

        WebElement h1 = driver.findElement(By.cssSelector("[id='content']>h1"));

        Assert.assertEquals(h1.getText(), "Your order has been placed!", "Onay texti bulunamadı");
    }

}
