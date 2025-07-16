package day06_farkliPackagedanErisme;

import day06_OOP_Giris.C02_Datalar;

public class C02_FarkliPackageChildOlmayanClass {

    public void method1(){

        C02_Datalar obje = new C02_Datalar();
        // private access modifier'a sahip olan class uyeleri
        // farkli package icindeki child olmayan class'dan da kullanilamaz
        // obje.shortIPri = 23; // 'shortIPri' has private access in 'day06_OOP_Giris.C02_Datalar'
        // obje.strSPri = "ali"; // 'strSPri' has private access in 'day06_OOP_Giris.C02_Datalar'

        // default access modifier'a sahip olan class uyeleri
        // farkli package icindeki child olmayan class'dan da kullanilamaz
        // obje.blIDef = false; // 'blIDef' is not public. Cannot be accessed from outside package
        // obje.chrSDef = 'k'; // 'chrSDef' is not public. Cannot be accessed from outside package

        // protected access modifier'a sahip olan class uyeleri
        // farkli package icindeki child class'dan da kullanilabilir
        // obje.intIPro = 76; // 'intIPro' has protected access in 'day06_OOP_Giris.C02_Datalar'
        // obje.intSPro = 23; // 'intSPro' has protected access in 'day06_OOP_Giris.C02_Datalar'

        // public access modifier'a sahip olan class uyeleri
        // farkli package icindeki child olmayan class'dan da kullanilabilir
        obje.strIPub = "Veli";
        obje.chrSPub = 'l';
    }
}
