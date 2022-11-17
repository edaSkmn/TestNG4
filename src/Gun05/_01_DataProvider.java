package Gun05;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class _01_DataProvider {

    @Test(dataProvider = "getData") //benim data sağlayıcım getData fonksiyonudur
    void SearchTest(String searchText)
    {
        System.out.println("searchText = " + searchText);
    }

    @DataProvider // bu metoda dataprovider görevi verildi.
    public Object[] getData(){ // DataProvider olarak kullanılcak metodun tipi Object olmak zorunda.

        // int[] dizi={1,2,3,4}
        Object[] data={"Mac","Samsung","huawei","iphone","pc","Xaomi"}; // 1,3,4,5

        return data;
    }

    /*************************************************************/

    @Test(dataProvider = "aranacaklar") //benim data sağlayıcım getData fonksiyonudur
    void SearchTest2(String searchText)
    {
        System.out.println("searchText = " + searchText);
    }

    @DataProvider(name="aranacaklar") // bu metoda dataprovider görevi verildi.
    public Object[] getData2(){ // DataProvider olarak kullanılcak metodun tipi Object olmak zorunda.

        // int[] dizi={1,2,3,4}
        Object[] data={"Mac","Samsung","huawei","iphone","pc","Xaomi"}; // 1,3,4,5

        return data;
    }
}
