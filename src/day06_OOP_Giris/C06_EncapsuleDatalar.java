package day06_OOP_Giris;

public class C06_EncapsuleDatalar {
    /*
        Encapsulation'in tek bir amaci vardir
        read ve write yetkilerini ayirabilmek

        bu yetkileri ayirabilmek icin
        ozel bir yapilandirma gerekiyor

        ilk yapilacak is
        access modifier ile erisimi KAPATMAK
        (private yaparak)

        sonra verilen goreve uygun getter ve setter method'lari olusturup
        gerekli izinleri veririz

        getter() : bilgiyi getirmek yani read yetkisi icin kullanilir
        setter() : bilgiyi guncelleme yani write yetkisi icin kullanilir
     */

    private int satisTutari;
    // atama yapilabilmeli ama atanan degerler goruntulenememeli
    // setter method'u olusturacagiz


    public void setSatisTutari(int satisTutari) {
        this.satisTutari = satisTutari;
        toplamSatisTutari += satisTutari;
    }

    private int toplamSatisTutari ;
    // goruntulenebilir ama deger atanamamali
    // read yekisi, getter() olusturacagiz

    public int getToplamSatisTutari() {
        return toplamSatisTutari;
    }
}
