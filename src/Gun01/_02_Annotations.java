package Gun01;

import org.testng.annotations.*;

public class _02_Annotations {

    /*
        @BeforeClass      -->   Class ın başında çalışacak   (driver işlemleri)
           @BeforeMethod  -->   Her metoddan(test metodları) önce çalışacak
               @Test      -->   testlerin çalıştığı metodlar

               @Test      -->   testlerin çalıştığı metodlar
           @AfterMethod   -->   Her metoddan sonra çalışacak
        @AfterClass       -->   Class ın çalışmasının sonunda çalışacak (driver kapat)
     */

    @BeforeClass
    void beforeClass(){
        System.out.println("Her class dan ONCE calisacak"); // driver ve test oncesi butun islemler burada yapilabilir - baslangic islemleri
    }
    @BeforeMethod
    void beforeMethod(){
        System.out.println("Her metod dan ONCE calisacak");
    }

    @AfterMethod
    void afterMethod(){
        System.out.println("Her metod dan SONRA calisacak");
    }

    @AfterClass
    void afterClass(){
        System.out.println("Her class dan SONRA calisacak"); // driver kapat vs.. yazilabilir - bitis islemleri
    }
    @Test
    void test1(){
        System.out.println("test 1 calisti");
    }
    @Test
    void test2(){
        System.out.println("test 2 calisti");
    }
}
