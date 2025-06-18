package day01_programlamayaGiris;

public class C01_VariableOlusturma {

    public static void main(String[] args) {

        System.out.println("Hello World");

        // ogrenci ismini kaydedebilecegimiz bir variable olusturalim
        String ogrenciIsmi = "Ali Can";

        // ogrenci yasini kaydedebilecegimiz bir variable olusturalim
        int ogrenciYasi = 12;


        ogrenciYasi = 13;


        ogrenciYasi = 14;

        // ogrenci notunu kaydedebilecegimiz bir variable olusturalim

        double ogrenciNotu = 5;

        ogrenciNotu = 7.4;

        // 7.6 = ogrenciNotu ;  Variable expected

        // 2 * ogrenciNotu = ogrenciNotu + 5 ; Variable expected

        // esitligin sol tarafinda SADECE variable ismi olabilir

        ogrenciNotu = (ogrenciNotu + 8.1) / 2 ;


        // bankadaki para miktarini kaydedebilecegimiz bir variable olusturalim

        double paraMiktari = 500 ;

        System.out.println("40.satirda hesabinizdaki para miktari : " + paraMiktari); // 500

        // hesaba 100 tl ekleyin

        paraMiktari = paraMiktari + 100;

        System.out.println("46.satirda hesabinizdaki para miktari : " + paraMiktari); // 600


        // hesaptaki paranin yarisini cekin

        paraMiktari = paraMiktari - paraMiktari/2 ;


        System.out.println("55.satirda hesabinizdaki para miktari : " + paraMiktari); // 300


        // sadece hesaptakiPara variable'nin degerini yazdirin

        System.out.println("paraMiktari"); // paraMiktari
        System.out.println(paraMiktari); // 300.0


        String isim = "Ali";
        String soyisim = "Can";

        System.out.println(isim + soyisim); // AliCan   yan yana yazdirir (Concatenation/birlestirme)

        System.out.println(isim + " " + soyisim); // Ali Can







    }

}

