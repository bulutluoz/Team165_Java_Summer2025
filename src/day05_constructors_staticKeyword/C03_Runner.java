package day05_constructors_staticKeyword;

public class C03_Runner {

    public static void main(String[] args) {

        // bu class'da bir car objesi olusturalim
        // temel amac Car class'inda bulunan ozelliklere sahip bir obje edinmek

        C02_Car car1 = new C02_Car();

        System.out.println(car1.marka); // Deger atanmadi
        System.out.println(car1.model); // null
        System.out.println(car1.fiyat); // 0
        System.out.println(car1.yil); // 1900

        car1.marka = "Audi";
        car1.model = "A4";
        car1.yil = 2010;
        car1.fiyat = 12000;



        System.out.println(car1.marka); // Audi
        System.out.println(car1.model); // A4
        System.out.println(car1.fiyat); // 12000
        System.out.println(car1.yil); // 2010

        C02_Car car2 = new C02_Car();
        System.out.println(car2.marka);
        System.out.println(car2.model);
        System.out.println(car2.yil);
        System.out.println(car2.fiyat);


    }
}
