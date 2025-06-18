package day02_stringManipulations;

import java.util.Scanner;

public class C05_substring {

    public static void main(String[] args) {

        String str = "Java Guzeldir";


        System.out.println(str.substring(3)); // 3.index'den baslayip, metnin sonuna kadar olan kisim
        // a Guzeldir

        System.out.println(str.substring(7)); // zeldir


        // sodan 3. karakteri yazdirin
        System.out.println(str.charAt( str.length()-3   )); // d


        // son 3 karakteri yazdirin  dir

        System.out.println( str.substring(str.length()-3 ));

        // sondan 5. karakteri yazdirin
        System.out.println(str.charAt( str.length()-5 )); // e

        // sondan 5 karakteri yazdirin "eldir"

        System.out.println(str.substring(str.length()-5));


        str = "Java ile hayat cok guzel";

        // str'da 5.index ile 9.index deki karakterler ve aralarindaki tum karakterleri yazdirin

        System.out.println(str.substring(5,9));
        // StringIndexOutOfBoundsException: begin 5, end 3, length 25
        //  Java da genel olarak baslangic degerleri dahil,
        //                       bitis degerleri dahil degildir
        // ornegi dusunursek 5.index dahil 9.index haric olacaktir.
        // "ile " konsolda goruruz


        str = "gelecegin meslegi yazilim";

        //System.out.println(str.substring(5,3));
        // StringIndexOutOfBoundsException: begin 5, end 3, length 25


        System.out.println(str.substring(6,6)); // hiclik(bos bir satir) yazdirir


        System.out.println(str.length()); // 25

        // asagidaki kod ne yazdirir?

        //System.out.println(str.charAt(str.length())); // StringIndexOutOfBoundsException

        System.out.println(str.substring(str.length()));

        // charAt() ile ayni islevi yapan, asagidaki kodu da kullanabiliriz

        System.out.println(str.charAt(5)); // e
        System.out.println(str.substring(5,6));//e


        // kullanicidan ismini isteyin
        // 3. ve sonuncu harflerini yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz...");
        String isim = scanner.nextLine();

        System.out.println("3.harf : " + isim.charAt(2)); //i
        System.out.println("sondaki harf : "  + isim.charAt(isim.length()-1)); // m


        System.out.println("3.harf : " + isim.substring(2,3)); //i
        System.out.println("sondaki harf : "  + isim.substring(isim.length()-1)); // m


        // charAt() bize char getirdigi icin String ile hazir method kullanamaz
        // ama substring bize string getirir ve hazir method'lar kullanilabilir


        // kullanicinin girdigi ismin 2.harfini buyuk harf olarak yazdirin

        System.out.println(isim.toUpperCase().charAt(1));

        System.out.println(isim.substring(1,2).toUpperCase());
    }
}
