package day03_methodOlusturmaVeKullanma;

public class C05_SayiKontrolu {

    public static void main(String[] args) {

        // verilen sayi1 ve sayi2 icin asagidaki sartlari kontrol edip
        // uymayan durumlarda hata mesaji yazdiran,
        // hic bir sarti saglamiyorsa "sayilar uygun degil" yazdiran
        // eger sayilar tum sartlari saglarsa "sayilar mukemmel" yazdiran
        // bir method olusturun

        sayilariKontrolEt(50,60);
        //birinci sayi daha kucuk
        //birinci sayi sifirdan buyuk
        //ikinci sayi 50'den buyuk
        //ikinci sayi 5'in tam kati
        //sayilar mukemmel
        System.out.println("=========");
        sayilariKontrolEt(5,3);
        // birinci sayi sifirdan buyuk


        System.out.println("=========");
        sayilariKontrolEt(-5,-3);
        // birinci sayi daha kucuk

    }

    public static void sayilariKontrolEt(int sayi1, int sayi2){
        int sayac = 0;

        // 1- sayi1 < sayi2 ise "birinci sayi daha kucuk"
        if (sayi1<sayi2) {
            System.out.println("birinci sayi daha kucuk");
            sayac++;
        }

        // 2- sayi1 pozitif ise "birinci sayi sifirdan buyuk"
        if (sayi1>0) {
            System.out.println("birinci sayi sifirdan buyuk");
            sayac++;
        }

        // 3- sayi2 50'den buyuk ise "ikinci sayi 50'den buyuk"
        if (sayi2>50) {
            System.out.println("ikinci sayi 50'den buyuk");
            sayac++;
        }

        // 4- sayi2 5 ile bolunebiliyorsa "ikinci sayi 5'in tam kati"
        if (sayi2%5==0) {
            System.out.println("ikinci sayi 5'in tam kati");
            sayac++;
        }


        // 5- EGER hic bir if body'si calismadiysa "sayilar uygun degil" yazdirin

        if (sayac == 0) System.out.println("sayilar uygun degil");

        // 6- EGER sayilar tum sartlari saglarsa "sayilar mukemmel" yazdirin
        if (sayac == 4) System.out.println("sayilar mukemmel");

    }
}
