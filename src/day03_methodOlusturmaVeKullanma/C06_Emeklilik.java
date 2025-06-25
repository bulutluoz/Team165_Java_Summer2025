package day03_methodOlusturmaVeKullanma;

public class C06_Emeklilik {

    public static void main(String[] args) {

        //Soru 3- verilen yasi kontrol edip,
        //        65 yas ve uzeri ise ”Emekli olabilirsin” ,
        //        65 yas alti ise emekli olmasi icin calismasi gereken yil sayisini yazdiran
        //        bir method olusturun.

        emeklilikKontroluYap(57);
        // Emekli olabilmek icin daha 8 yil daha calismalisin.

        emeklilikKontroluYap(66); // Emekli olabilirsin...

    }

    public static void emeklilikKontroluYap(int yas){
        if (yas >= 65) {
            System.out.println("Emekli olabilirsin...");
        } else {
            System.out.println( "Emekli olabilmek icin daha " +  (65-yas)  + " yil daha calismalisin."    );
        }
    }
}
