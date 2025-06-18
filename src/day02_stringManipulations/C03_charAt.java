package day02_stringManipulations;

import java.util.Scanner;

public class C03_charAt {

    public static void main(String[] args) {

        // kullanicidan bir metin isteyip
        // metnin son karakterini yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz...");
        String metin = scanner.nextLine();


        System.out.println("Son karakter : " +  metin.charAt(metin.length()-1) );

        // index'i direkt olarak yazmayip
        // kullanicinin girdigi metnin length'ine gore kodu duzenledigimiz icin
        // kodumuz DINAMIK KOd olmustur
        // yani kullanici ne girerse girsin, kodumuz calisir


    }
}
