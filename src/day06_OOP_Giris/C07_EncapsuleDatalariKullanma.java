package day06_OOP_Giris;

public class C07_EncapsuleDatalariKullanma {

    public static void main(String[] args) {

        C06_EncapsuleDatalar obje = new C06_EncapsuleDatalar();

        // satis bolumundekiler
        // satis tutari olarak deger girebilmeli
        // ama girilen degerleri goruntuleyememeli

        obje.setSatisTutari(5000);
        obje.setSatisTutari(2000);
        obje.setSatisTutari(3000);

        // System.out.println(obje.setSatisTutari(3000));
        // Cannot resolve method 'println(void)'

        // int satis = obje.setSatisTutari(200);
        // Required type:int
        // Provided:void


        // toplam satis tutari goruntulenebilir
        // ama kimse toplam satis tutarina deger ATAYAMAMALI

        System.out.println(obje.getToplamSatisTutari()); // 10000

        obje.setSatisTutari(1000);
        obje.setSatisTutari(1500);

        System.out.println(obje.getToplamSatisTutari()); // 12500

        // obje.getToplamSatisTutari() = 45000;
        // Variable expected
        // oysa method int bir sonuc getiriyor


    }
}
