package day01_programlamayaGiris;

import java.util.Scanner;

public class C04_KullaniciBilgileriniYazdirma {

    public static void main(String[] args) {

        //Soru 3- Kullanicidan ismini, soyismini ve yasini alip, asagidaki formmatta yazdirin.
        //		Isminiz : John
        //		Soyisminiz : Doe
        //		Yasiniz : 44
        //		Kaydiniz basariyla tamamlanmistir.


        Scanner scanner = new Scanner(System.in);

        System.out.println("Isminizi girin...");
        String isim = scanner.nextLine();

        System.out.println("Soyisminizi giriniz...");
        String soyisim = scanner.nextLine();

        System.out.println("Yasinizi giriniz...");
        int yas = scanner.nextInt();

//        System.out.println("Isminiz : " + isim);
//        System.out.println("Soyisminiz : " + soyisim);
//        System.out.println("Yasiniz : " + yas);
//        System.out.println("Kaydiniz basariyla tamamlanmistir.");



        System.out.println("Isminiz : " + isim +
                           "\nSoyisminiz : " + soyisim +
                           "\nYasiniz : " + yas +
                           "\nKaydiniz basariyla tamamlanmistir.");


    }
}
