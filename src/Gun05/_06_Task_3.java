package Gun05;

import Utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

/*
   Senaryo
   1- Siteye gidiniz
   2- Specials tiklayiniz
   3- Cikan urun lerde (bütün ürünlerde indirim var mı eski fiyat yeni fiyattan büyük mü)
   4- Yukarıdaki işlemden sonra her ürünün önceki fiyatının şu andaki fiyattan
      yüksek olduğunu doğrulayınız.
*/
public class _06_Task_3 extends BaseDriver {

    @Test
    void Test1(){

    WebElement specials=driver.findElement(By.linkText("Specials"));
    specials.click();




    }

}
