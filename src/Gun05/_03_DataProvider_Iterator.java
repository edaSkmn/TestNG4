package Gun05;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class _03_DataProvider_Iterator {

    @Test(dataProvider = "getData") //benim data sağlayıcım getData fonksiyonudur
    void SearchTest(String searchText)
    {
        System.out.println("searchText = " + searchText);
    }

    @DataProvider // bu metoda dataprovider görevi verildi.
    public Iterator<Object> getData(){ // DataProvider olarak kullanılcak metodun tipi Object olmak zorunda.

        List<Object> data= new ArrayList<>();
        data.add("Mac");
        data.add("Samsung");
        data.add("huawei");

        return data.iterator();
    }

    /**********************************************/

    @Test(dataProvider = "getData2") //benim data sağlayıcım getData fonksiyonudur
    void LoginTest(String username, String password)
    {
        System.out.println("username = " + username+", password="+password);
    }

    @DataProvider // bu metoda dataprovider görevi verildi.
    public Iterator<Object[]> getData2(){ // DataProvider olarak kullanılcak metodun tipi Object olmak zorunda.

        List<Object[]> logins= new ArrayList<>();
        logins.add(new Object[]{"hakan","sdsdsd"});
        logins.add(new Object[]{"mehmet","sdsdsd"});
        logins.add(new Object[]{"ali","sdsdsd"});

        return logins.iterator();
    }
}
