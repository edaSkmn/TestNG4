package Gun01;

import Utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _04_Ornek extends BaseDriver {

    @Test
    void loginTest() {

        driver.get("https://opencart.abstracta.us/index.php?route=account/login");

        System.out.println("Login test");

        WebElement inputEmail=driver.findElement(By.id("input-email"));
        inputEmail.sendKeys("xyz@gmail.com");

        WebElement password= driver.findElement(By.id("input-password"));
        password.sendKeys("12345xyz");

        WebElement loginBtn= driver.findElement(By.cssSelector("input[type='submit']"));
        loginBtn.click();

        Assert.assertEquals(driver.getTitle(),"My Account","Login başarısız");

    }
}
