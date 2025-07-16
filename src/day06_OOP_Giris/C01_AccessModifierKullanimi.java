package day06_OOP_Giris;

import java.util.SplittableRandom;

public class C01_AccessModifierKullanimi {
    // access modifier class icerisinde olusturulan (Local olmayan)
    // variable, method, constructor vb.. class uyeleri icin KULLANILMAK ZORUNDADIR

    int sayi1 = 23; // Java sayi1'in access modifier'i olarak "default access modifier" atamasi yapar
    private int sayi2 = 34;
    protected int sayi3 = 67;
    public int sayi4 = 89;



    public static void main(String[] args) {
        // local scope'da instance/static kullanilamadigi gibi
        // access modifier da kullanilamaz

        // static int sayi1 = 23; // Modifier 'static' not allowed here
        // public String str = "Ali Can"; // Modifier 'public' not allowed here
    }

    public static void method1(){

    }

    static String method2(){ // default access modifier'a sahip
        return null;
    }

    int method3(){ // default access modifier'a sahip
        return 0;
    }

}
