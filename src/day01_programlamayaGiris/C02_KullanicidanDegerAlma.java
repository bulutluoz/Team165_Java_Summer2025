package day01_programlamayaGiris;

import java.util.Scanner;

public class C02_KullanicidanDegerAlma {

    public static void main(String[] args) {

        // kullanicidan ismini alin

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen isminizi giriniz");

        String kullaniciIsmi = scanner.nextLine();

        // ismini buyuk harf yaparak yazdirin

        System.out.println("Girilen isim : " + kullaniciIsmi.toUpperCase());


    }
}
