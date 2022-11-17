package Gun06;

import Utility.BaseDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _03_PlaceOrderPOM extends BaseDriver {

     /* POM (Page Object Model) avantajları
   1- Bütün sayfalarda isimleri aynı olan elemanlar için 1 tanımlama yeterli oluyor.
      Böylece tanımlanan elemanlar tekrar kullanılabilir yani Reusable oluyor.
   2- Kodun içerisinden HTML kodları ayrıldığından kod okunabilirliği artıyor.
   3- Developer locatorlarda bir değişiklik yaptığı zaman, asıl kodla hiç bir şekilde
      uğraşmak zorunda kalmıyoruz, sadece gidip locator ı değiştiriyoruz.
    */

    @Test
    void ProceedToCheckout() {

        _02_PlaceOrderElements elements=new _02_PlaceOrderElements();

        elements.searchBox.sendKeys("ipod");
        elements.searchButton.click();
        elements.addToChart.click();
        elements.shoppingChart.click();
        elements.checkOut.click();

        wait.until(ExpectedConditions.elementToBeClickable(elements.continue1)).click();
        wait.until(ExpectedConditions.elementToBeClickable(elements.continue2)).click();
        wait.until(ExpectedConditions.elementToBeClickable(elements.continue3)).click();
        elements.agree.click();
        wait.until(ExpectedConditions.elementToBeClickable(elements.continue4)).click();
        wait.until(ExpectedConditions.elementToBeClickable(elements.confirm)).click();

        wait.until(ExpectedConditions.urlContains("success"));
        Assert.assertEquals(elements.confirm.getText(), "Your order has been placed!");
    }

}
