package day06_OOP_Giris;

public class C03_AyniPackageFarkliClass {

    public void method1(){

        C02_Datalar obje = new C02_Datalar();
        // private access modifier'a sahip olan class uyeleri
        // ayni package icindeki baska class'dan kullanilamaz
        // obje.shortIPri = 23; // 'shortIPri' has private access in 'day06_OOP_Giris.C02_Datalar'
        // obje.strSPri = "ali"; // 'strSPri' has private access in 'day06_OOP_Giris.C02_Datalar'

        // default access modifier'a sahip olan class uyeleri
        // ayni package icindeki baska class'dan kullanilabilir
        obje.blIDef = false;
        obje.chrSDef = 'k';

        // protected access modifier'a sahip olan class uyeleri
        // ayni package icindeki baska class'dan kullanilabilir
        obje.intIPro = 76;
        obje.intSPro = 23;

        // public access modifier'a sahip olan class uyeleri
        // ayni package icindeki baska class'dan kullanilabilir
        obje.strIPub = "Veli";
        obje.chrSPub = 'l';

    }
}
