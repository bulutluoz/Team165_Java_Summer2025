package day03_methodOlusturmaVeKullanma;

import java.util.Scanner;

public class C02_KendiSubstringMethodumuz {

    public static void main(String[] args) {

         /*
            Kullanicidan alinan bir metinden
            kullanicinin girdigi baslangic ve bitis indexleri arasindaki kismi yazdirin

            Kurallar :
            1- eger baslangic veya bitis index'i negatif veya metnin sinirlari disinda ise hata verin
            2- baslangic index'i bitis index'inden buyukse hata mesaji verin
            3- baslangic indexindeki karakter dahil, bitis indexindeki karakter haric olmalidir

            ornek : metin ==> Java ne kadar guzel
                   bas.indexi => 3
                   bit.indexi => 8

                   output => "a ne "
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz...");
        String metin = scanner.nextLine();

        System.out.println("Lutfen baslangic index'ini girin..");
        int basIndex = scanner.nextInt();

        System.out.println("Lutfen bitis index'ini girin..");
        int bitIndex = scanner.nextInt();


        if (basIndex<0 || bitIndex<0 || basIndex>=metin.length() || bitIndex>=metin.length()){
            System.out.println("girilen index'ler gecerli degil");
        } else if (basIndex>bitIndex) {
            System.out.println("Baslangic index'i bitis index'inden buyuk olamaz");
        } else{
            for (int i = basIndex; i <bitIndex ; i++) {
                System.out.print(metin.charAt(i));

            }
        }

        System.out.println("");
        System.out.println(metin.substring(basIndex, bitIndex));




    }
}
