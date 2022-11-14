package Gun02_Dependency;

import org.testng.annotations.Test;

public class _03_Dependency {

    // arabanin hareketleri : start, drive, park, stop - hareket sirasi bu sekildedir

    @Test
    void startCar(){
        System.out.println("startCar");
       // Assert.fail(); // burasi calismasi bir sonraki adim veya buna bagli adimlar da calismaz

    }
    @Test(dependsOnMethods = {"startCar"}) // bu testin calismasi, startCar in hatasiz calismasina bagli
    void driveCar(){
        System.out.println("driveCar");
    }
    @Test(dependsOnMethods = {"startCar","driveCar"}) // birden fazla baglilik yapilabiliyor
    void parkCar(){
        System.out.println("parkCar");
    }
    @Test(dependsOnMethods= {"parkCar"}, alwaysRun = true)  //alwaysRun=true bagimliliklari var ama hata cikarsa yine de calistir
    void stopCar(){
        System.out.println("stopCar");
    }
    // aynı seviyedeki testleri için priority verilebilir.
    // bağımlı testler, direk metodundan çalıştırdığınızda bağımlı olduğu metod zincirinde 2 üste kadar ototmatik çağırıp çalışabilir.

}
