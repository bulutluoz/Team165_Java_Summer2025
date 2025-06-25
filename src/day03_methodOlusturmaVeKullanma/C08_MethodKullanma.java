package day03_methodOlusturmaVeKullanma;

public class C08_MethodKullanma {

    public static void main(String[] args) {


        // 5,8,0 'in eskenar ucgen olup olmadigini yazdirin

        C04_EskenarUcgenKontrolu.eskenarUcgenMiYazdir(5,8,0); // girilen degerler gecerli degil
        C04_EskenarUcgenKontrolu.eskenarUcgenMiYazdir(8,8,8); // Eskenar ucgen


        //
        C05_SayiKontrolu.sayilariKontrolEt(67,55);
        //birinci sayi sifirdan buyuk
        //ikinci sayi 50'den buyuk
        //ikinci sayi 5'in tam kati


        C06_Emeklilik.emeklilikKontroluYap(75); // Emekli olabilirsin...

        C06_Emeklilik.emeklilikKontroluYap(64); // Emekli olabilmek icin daha 1 yil daha calismalisin.


        C07_IndirimliFiyatHesaplama.indirimliToplamFiyatYazdir('H',25,40);
        // %15 indirimli toplam fiyat : 850.0
    }
}
