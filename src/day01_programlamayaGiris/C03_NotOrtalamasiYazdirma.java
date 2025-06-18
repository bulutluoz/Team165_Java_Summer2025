package day01_programlamayaGiris;

import java.util.Scanner;

public class C03_NotOrtalamasiYazdirma {

    public static void main(String[] args) {

        // kullanicdan vize ve final notlarini isteyin
        // vize notunun %30 ile final notunun %70'ini alip toplayin
        // ve yil sonu notu olarak yazdirin


        // Kullanicidan bilgi almak icin Scanner objesi ile 3 adim atmamiz gerekir
        // 1.adim : scanner objesi olusturmak
        Scanner scanner = new Scanner(System.in);

        // 2.adim : kullaniciya ne istedigimizi yazdirin
        System.out.println("Vize notunuzu giriniz");

        // 3.adim : alinacak bilgiye uygun bir variable olusturup
        //          scanner objesi ile data turune uygun hazir method'u kullanin
        double vizeNotu = scanner.nextDouble();


        // NOT : birden fazla bilgi alinacaksa, yeniden scanner objesi olusturmaya gerek olmaz
        //       2. ve 3. adimlari tekrarlamaniz yeterli olur

        System.out.println("Lutfen final notunuzu giriniz...");

        double finalNotu = scanner.nextDouble();



        double yilSonuPuani = vizeNotu * 30 / 100 + finalNotu * 70 /100 ;

        System.out.println("Yil sonu puaniniz : " + yilSonuPuani);
    }
}
