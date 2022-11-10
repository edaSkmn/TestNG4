package Gun01;

import Utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

/*
  Senaryo
  1- Siteyi açınız.
  2- Newsletter  Subscribe işlemini abone lunuz(YES)
 */

public class _06_SubscribeNewsletter extends BaseDriver {

    @Test
    void subscribeFunctionYes(){
        WebElement newsletterLink=driver.findElement(By.linkText("Newsletter"));
        newsletterLink.click();

        WebElement subscribeYes=driver.findElement(By.cssSelector("[type='radio'][value='1']"));
        subscribeYes.click();

        WebElement continuebtn=driver.findElement(By.cssSelector("[value='Continue']"));
        continuebtn.click();

        WebElement msgLabel=driver.findElement(By.cssSelector("div[class='alert alert-success alert-dismissible'"));
        Assert.assertTrue(msgLabel.getText().toLowerCase().contains("success"));


    }

}
