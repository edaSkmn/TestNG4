package Gun01_Annotation_Assertion;

import org.testng.annotations.Test;

public class _01_Giris {

//    public static void main(String[] args) {
//        webSitesiniAc();
//        LoginIsleminiYap();
//        driveriKapat();
//    }
//
//    @Test Junit
//    public void Test1()
//    {
//        webSitesiniAc();
//        LoginIsleminiYap();
//        driveriKapat();
//    }

    //Eger herhangi bir siralama verilmezse method isimlerinin alfabetik sirasina gire calisiyor
    @Test(priority = 1)
    void webSitesiniAc() {
        System.out.println("driver tanimlandi ve web sitesi acildi");
    }

    @Test(priority = 2)
    void loginIsleminiYap() {
        System.out.println("login test islemleri yapildi");

    }
    @Test(priority = 3)
    void  driveriKapat() {
        System.out.println("driver kapatildi ve cikildi");

    }
}