package day04_arrays;

public class C04_ArrayinTumElemanlariniKullanma {

    public static void main(String[] args) {

        int[] sayilar = {3,5,6,1,3,5,8,0,2};


        // array'deki tum elemanlarin toplami kactir?

        int toplam = 0;

        for (int i = 0; i < sayilar.length; i++) {

            toplam += sayilar[i] ;

        }

        System.out.println("tum elemanlarin toplami : " + toplam);
        // tum elemanlarin toplami : 33


        // arraydeki cift sayi olan tum elementlerin carpimini yazdirin

        int carpim = 1;

        for (int i = 0; i <sayilar.length ; i++) {

            if ( sayilar[i] % 2 == 0){
                carpim *= sayilar[i];
            }

        }

        System.out.println("arraydeki cift sayilarin carpimi : " + carpim); // 0


        // array'deki tum elementleri sondan basa dogru aralarinda - olarak yazdirin

        for (int i = sayilar.length-1 ; i >=0 ; i--) {

            System.out.print(sayilar[i] + "-");
        }

        System.out.println("");

        // 2-0-8-5-3-1-6-5-3-

        // sadece estetik gorunum icin en sonda - olmayacak sekilde yazdiralim

        for (int i = sayilar.length-1 ; i >0 ; i--) {

            System.out.print(sayilar[i] + "-");
        }

        System.out.print(sayilar[0]);


    }
}
