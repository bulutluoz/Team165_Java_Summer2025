package day03_methodOlusturmaVeKullanma;

public class C07_IndirimliFiyatHesaplama {

    public static void main(String[] args) {
        // Verilen
        // alinan urun adedi, indirimsiz fiyat ve musteri karti olup olmadigi bilgilerini degerlendirip.
        // Musteri karti varsa 10 urunden fazla alirsa %20,
        //                        az alirsa %15 indirim,
        // Musteri karti yoksa 10 urunden fazla alirsa %15,
        //                        az alirsa %10 indirim yapip
        // toplam fiyati yazdiran bir method olusturun

        indirimliToplamFiyatYazdir('E',25,100);
        // %20 indirimli toplam fiyat : 2000.0

    }

    public static void indirimliToplamFiyatYazdir(char kartVarMi,int urunAdedi, double urunFiyati){

        double indirimsizToplamFiyat = urunFiyati*urunAdedi;

        // ana degisken kart var mi olsun

        if (kartVarMi == 'E'){ // karti olanlar bolumu

            if (urunAdedi<0){
                System.out.println("Urun adedi negatif olamaz");
            } else if (urunAdedi >= 10) {
                System.out.println("%20 indirimli toplam fiyat : " + indirimsizToplamFiyat*80/100);
            }else {
                System.out.println("%15 indirimli toplam fiyat : " + indirimsizToplamFiyat*85/100);
            }

        } else if (kartVarMi == 'H') { // karti olmayanlar

            if (urunAdedi<0){
                System.out.println("Urun adedi negatif olamaz");
            } else if (urunAdedi >= 10) {
                System.out.println("%15 indirimli toplam fiyat : " + indirimsizToplamFiyat*85/100);
            }else {
                System.out.println("%10 indirimli toplam fiyat : " + indirimsizToplamFiyat*90/100);
            }

        } else {
            System.out.println("kart var mi icin E veya H girmelisiniz");
        }

    }
}
