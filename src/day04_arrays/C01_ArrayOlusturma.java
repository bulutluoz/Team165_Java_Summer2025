package day04_arrays;

public class C01_ArrayOlusturma {

    public static void main(String[] args) {

        /*
            1- Bir variable'in array oldugunu belirtmek icin data turunun yanina [] konulmalidir
            2- array'in onundeki data turu, array'in icine konulacak elementlerin data turudur
            3- array'in icine isimden once yazilan data turu disinda element eklenemez
            4- array iki sekilde olusturulabilir
               - asagidaki sayilarArrayi, isimler veya harfler gibi
                 elemanlari liste olarak verebiliriz
                 Java, liste olarak yazilan eleman sayisini array'in uzunlugu olarak kabul eder
               - olustururken data turunu ve uzunlugunu veririz
                 elemanlari sonradan atama yapariz
                 bu durumda esitligin sag tarafinda [] icinde eleman sayisini belrtmeliyiz
                 Bu yontem tercih edildiginde, baslangicta deger atanmadigi icin
                 Java kendi belirledigi default degerleri eleman olarak atama yapar
                 default degerler :
                 sayisal primitive'ler icin => 0  byte,short,int,long,float,double
                 char ==> '' char olarak hiclik degeri
                 boolean ==> false
                 String ve diger tum non-primitive'ler icin ==> null
         */

        int sayi = 10;

        int[] sayilarArrayi = {10,3,4,7,0,1} ;
        // sayilar variable'inin array oldugunu belirleyen isaret []

        System.out.println(sayilarArrayi[0]);  // 10
        // array'deki o.index'de bulunan sayiyi yazdirir

        System.out.println(sayilarArrayi[2]); // 4

        String[] isimler = {"ali","veli","mert"};

        char[] harfler = { '3','h','k','a'};


        int[] yaslar = new int[6]; // [0, 0, 0, 0, 0, 0]
        System.out.println(yaslar[0]); //  0
        System.out.println(yaslar[3]); // 0
        System.out.println(yaslar[4]); // 0

        boolean[] cevaplar = new boolean[2];  // [ hiclik, hiclik ]






    }
}
