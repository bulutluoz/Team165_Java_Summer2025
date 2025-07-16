package day06_farkliPackagedanErisme;

import day06_OOP_Giris.C02_Datalar;

public class C01_FarkliPackageChildClass extends C02_Datalar {

    public void method1(){

        C02_Datalar obje = new C02_Datalar();
        // private access modifier'a sahip olan class uyeleri
        // farkli package icindeki child class'dan da kullanilamaz
        // shortIPri = 23; // 'shortIPri' has private access in 'day06_OOP_Giris.C02_Datalar'
        // strSPri = "ali"; // 'strSPri' has private access in 'day06_OOP_Giris.C02_Datalar'

        // default access modifier'a sahip olan class uyeleri
        // farkli package icindeki child class'dan da kullanilamaz
        // blIDef = false; // 'blIDef' is not public. Cannot be accessed from outside package
        // chrSDef = 'k'; // 'chrSDef' is not public. Cannot be accessed from outside package


        // protected access modifier'a sahip olan class uyeleri
        // farkli package icindeki child class'dan da kullanilabilir
        intIPro = 76;
        intSPro = 23;

        // public access modifier'a sahip olan class uyeleri
        // farkli package icindeki child class'dan da kullanilabilir
        strIPub = "Veli";
        chrSPub = 'l';
    }


}
