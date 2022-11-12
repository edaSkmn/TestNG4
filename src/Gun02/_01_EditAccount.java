package Gun02;

import Utility.BaseDriver;
import Utility.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

/*
  Senaryo
  1- Siteyi açınız.
  2- Edit Account sayfasina ulasiniz
  3- Adi ve soyadi degistirip tekrar kaydediniz

 */
public class _01_EditAccount extends BaseDriver {

    By link = By.linkText("Edit Account");
    By firstName=By.cssSelector("[id='input-firstname']");
    By lastName=By.cssSelector("[id='input-lastname']");
    By submitButton=By.cssSelector("[type='submit']");

    @Test
    void editAccount(){
        editAccountTest("john2", "happy2");
        Tools.bekle(2);
        editAccountTest("john","happy");

    }

    @Test
    void editAccountTest(String ad, String soyad) {
        WebElement editAccount = driver.findElement(link);
        editAccount.click();

        WebElement txtfirstName = driver.findElement(firstName);
        txtfirstName.clear();
        txtfirstName.sendKeys(ad);

        WebElement txtlastName = driver.findElement(lastName);
        txtlastName.clear();
        txtlastName.sendKeys(soyad);

        WebElement submit = driver.findElement(submitButton);
        submit.click();

        Tools.successMessageValidation();
    }
}