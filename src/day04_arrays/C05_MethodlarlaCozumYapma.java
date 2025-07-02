package day04_arrays;

public class C05_MethodlarlaCozumYapma {

    public static void main(String[] args) {

        // verilen int bir array'de kac tane tek sayi oldugunu donduren bir method olusturun

        int[] sayilar = {3,6,8,3,5,1,6,8,0,2,1,5};

        System.out.println("Array'deki tek sayi adedi : " + tekSayiAdediDondur(sayilar));

        // verilen String bir arrayde, toplam kac karakter kullanildigini donduren
        // bir method olusturun

        String[] metinler = {"a","ali","ali okula gitti","asdfgh"}; // 25

        System.out.println("Array'de kullanilan toplam karakter sayisi : " + kullanilanToplamKarakterSayisi(metinler)); // 25


        // verilen String bir array'de en uzun kelimeyi donduren
        // bir method olusturun

        String[] isimler = {"Mert","Yavuz","Ali","Fadime","Sait","Abdulhakim"};

        System.out.println("en uzun kelime : " + getEnUzunKelime(isimler));


    }

    public static String getEnUzunKelime(String[] metinler){
        String enUzunKelime = metinler[0];

        for (int i = 0; i <metinler.length ; i++) {

            if (metinler[i].length() > enUzunKelime.length()){
                enUzunKelime = metinler[i];
            }

        }

        return enUzunKelime;
    }


    public static int kullanilanToplamKarakterSayisi(String[] metinler){

        int toplamKarakterSayisi = 0;

        for (int i = 0; i < metinler.length ; i++) {

            toplamKarakterSayisi += metinler[i].length();
        }

        return toplamKarakterSayisi;

    }

    public static int tekSayiAdediDondur(int[] sayilar){

        int sayac = 0;


        for (int i = 0; i < sayilar.length ; i++) {

            if (sayilar[i] % 2 != 0 ){
                sayac++;
            }

        }

        return  sayac;

    }



}
