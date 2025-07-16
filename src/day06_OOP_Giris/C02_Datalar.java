package day06_OOP_Giris;

public class C02_Datalar {



    public String strIPub = "Java";
    protected int intIPro;
    boolean blIDef;
    private short shortIPri;

    private static String strSPri ;
    static char chrSDef = 'a';
    static protected int intSPro = 20;
    public static char chrSPub ;

    // class icinden kullanim
    public void method1(){
        // private access modifier'a sahip olan class uyeleri
        // SADECE icinde bulundugu class'dan kullanilabilir
        shortIPri = 23;
        strSPri = "ali";

        // default access modifier'a sahip olan class uyeleri
        // icinde bulundugu class'dan ve icinde bulundugu package'dan kullanilabilir
        blIDef = false;
        chrSDef = 'k';

        // protected access modifier'a sahip olan class uyeleri
        // icinde bulundugu class'dan kullanilabilir
        // protected class uyelerine SADECE baska package icindeki
        // child olmayan class'lar ULASAMAZ,
        // kendi class'i, kendi package'i ve baska package'daki child class'lar ulasabilir
        intIPro = 76;
        intSPro = 23;

        // public access modifier'a sahip olan class uyeleri
        // icinde bulundugu class'dan kullanilabilir
        // hicbir sinirlama olmadan proje kapsamindaki tum class'lardan ulasilabilir
        strIPub = "Veli";
        chrSPub = 'l';
    }

}
