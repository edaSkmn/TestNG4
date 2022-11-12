package Gun01_Annotation_Assertion;

import Utility.BaseDriver;
import Utility.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

/*
  Senaryo
  1- Siteyi açınız.
  2- Newsletter Subscribe işlemini abone olunuz(YES)
  3- Newsletter Subscribe işlemini abonelikten cikiniz(NO)
  4- Newsletter Subscribe durumunu kontrol ediniz YES ise NO, NO ise YES yapiniz.

 */

public class _06_SubscribeNewsletter extends BaseDriver {

    By link=By.linkText("Newsletter");
    By yes=By.cssSelector("[type='radio'][value='1']");
    By no=By.cssSelector("[type='radio'][value='0']");
    By ctn=By.cssSelector("[value='Continue']");
    @Test (priority = 1)
    void subscribeFunctionYes() {
        WebElement newsletterLink = driver.findElement(link);
        newsletterLink.click();

        WebElement subscribeYes = driver.findElement(yes);
        subscribeYes.click();

        WebElement continuebtn = driver.findElement(ctn);
        continuebtn.click();

        Tools.successMessageValidation();
    }
    @Test (priority =2)
    void subscribeFunctionNo() {
        WebElement newsletterLink = driver.findElement(link);
        newsletterLink.click();

        WebElement subscribeNo = driver.findElement(no);
        subscribeNo.click();

        WebElement continuebtn = driver.findElement(ctn);
        continuebtn.click();

        Tools.successMessageValidation();
    }
    @Test (priority = 3)
    void subscribeFunctionforBoth () {
        WebElement newsletterLink = driver.findElement(link);
        newsletterLink.click();

        WebElement subscribeYes = driver.findElement(yes);
        WebElement subscribeNo = driver.findElement(no);

        if (subscribeYes.isSelected())
            subscribeNo.click();
        else
            subscribeYes.click();

        WebElement continuebtn = driver.findElement(ctn);
        continuebtn.click();

        Tools.successMessageValidation();
    }
}