package Gun03_XML;

import Utility.BaseDriver;
import Utility.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class _0_AddressFunctionality extends BaseDriver {

    @Test
    void addAddress()
    {
        WebElement addressBook=driver.findElement(By.linkText("Address Book"));
        addressBook.click();

        WebElement newAddress=driver.findElement(By.linkText("New Address"));
        newAddress.click();

        WebElement firsName=driver.findElement(By.id("input-firstname"));
        firsName.sendKeys("Ahmet");

        WebElement lastname=driver.findElement(By.id("input-lastname"));
        lastname.sendKeys("Demir");

        WebElement company=driver.findElement(By.id("input-company"));
        company.sendKeys("Techno Study");

        WebElement address1=driver.findElement(By.id("input-address-1"));
        address1.sendKeys("21a London Road");

        WebElement address2=driver.findElement(By.id("input-address-2"));
        address2.sendKeys("RG2 5BJ");

        WebElement city=driver.findElement(By.id("input-city"));
        city.sendKeys("Reading");

        WebElement postCode=driver.findElement(By.id("input-postcode"));
        postCode.sendKeys("12345");

        WebElement country=driver.findElement(By.id("input-country"));
        Select countrySelect= new Select(country);
        countrySelect.selectByIndex(10); // selectByVisibleText,selectValue implicitly wait ile çalıştı
        // selectByVisibleText,selectValue ile sorunsuz çalışır ve beklemeye ihtiyacı olmaz

        WebElement option=driver.findElement(By.cssSelector("select[id='input-zone']>option"));
        wait.until(ExpectedConditions.stalenessOf(option)); // stale element durumu düzelene kadar bekle

        WebElement State=driver.findElement(By.id("input-zone"));
        Select StateSelect= new Select(State);

//         System.out.println("StateSelect.ge = " + StateSelect.getOptions().size());
//         for(WebElement e : StateSelect.getOptions())
//             System.out.println("e.getText() = " + e.getText());   // inceleme için geçiş anının fotoğrafı

        StateSelect.selectByIndex(6);  // selectByVisibleText,selectValue implicitly wait ile çalıştı
        // selectByIndex implicitly wait ile çalışmıyor.
        // selectByVisibleText,selectValue ile sorunsuz çalışır ve beklemeye ihtiyacı olmaz

        WebElement defadres=driver.findElement(By.cssSelector("label [name='default'][value='1']"));
        defadres.click();

        WebElement ctn=driver.findElement(By.cssSelector("input[type='submit']"));
        ctn.click();

        Tools.successMessageValidation();
    }

    @Test(dependsOnMethods = {"addAddress"})
    void editAddress()
    {
        WebElement addressBook=driver.findElement(By.linkText("Address Book"));
        addressBook.click();

        List<WebElement> editAll=driver.findElements(By.linkText("Edit"));
        WebElement sonEdit= editAll.get(editAll.size()-1); // son edit
        sonEdit.click();

        WebElement firsName=driver.findElement(By.id("input-firstname"));
        firsName.clear();
        firsName.sendKeys("Mehmet");

        WebElement lastname=driver.findElement(By.id("input-lastname"));
        lastname.clear();
        lastname.sendKeys("Yılmaz");

        WebElement ctn=driver.findElement(By.cssSelector("input[type='submit']"));
        ctn.click();

        Tools.successMessageValidation();
    }

    @Test(dependsOnMethods = {"editAddress"})
    void deleteAddress()
    {
        WebElement addressBook=driver.findElement(By.linkText("Address Book"));
        addressBook.click();

        List<WebElement> deleteAll=driver.findElements(By.linkText("Delete"));
        WebElement silinebilirAdres= deleteAll.get(deleteAll.size()-2); // son edit
        silinebilirAdres.click();

        Tools.successMessageValidation();
    }

    @Test(enabled = false)
    void addAddressAction()
    {
        WebElement name = driver.findElement(By.cssSelector("#input-firstname"));

        Actions aksiyon = new Actions(driver);
        aksiyon.click(name)
                .sendKeys("Birkan")
                .sendKeys(Keys.TAB)
                .sendKeys("Filiz")
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys("babatasi mah.")
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys("Mugla")
                .sendKeys(Keys.TAB)
                .sendKeys("48300")
                .sendKeys(Keys.TAB).build().perform();



        WebElement countrySelect = driver.findElement(By.xpath("(//select[@id='input-country'])[1]"));

        Select slct=new Select(countrySelect);
        slct.selectByVisibleText("Turkey");
        aksiyon.sendKeys(Keys.ENTER).build().perform();

        WebElement regionSelect = driver.findElement(By.xpath("(//select[@id='input-zone'])[1]"));

        Select slct2=new Select(regionSelect);
        slct2.selectByVisibleText("Muğla");
        aksiyon.sendKeys(Keys.ENTER).build().perform();

        WebElement radioButton = driver.findElement(By.cssSelector("input[value='1']"));
        radioButton.click();

        WebElement confirm = driver.findElement(By.cssSelector("input[value='Continue']"));
        confirm.click();

    }

}
