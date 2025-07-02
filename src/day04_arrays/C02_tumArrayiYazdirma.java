package day04_arrays;

import java.util.Arrays;

public class C02_tumArrayiYazdirma {

    public static void main(String[] args) {
        /*
            5- array icindeki bir elemani kullanmak veya yazdirmak istersek
               array ismini ve [] icinde kullanmak istedigimiz elemanin index'ini yazabiliriz

            6- eger bir array'in tum elemanlarina ulasmak veya yazdirmak isterseniz
               bir for loop kullanabilirsiniz

            7- eger bir array direkt sout icinde kullanilirsa
               arayin elementlerini degil, array'in stach memory'de tutulan referansini yazdirir

            8- tum array'i bir array olarak yazdirmak icin
               Arrays class'indan hazir method kullanmaliyiz
         */


        int[] sayilar = {3,6,8,9,1};
        String[] isimler = new String[5]; // [null, null, null, null, null]

        // array icindeki bir elemani kullanmak veya yazdirmak istersek
        // array ismini ve [] icinde kullanmak istedigimiz elemanin index'ini yazabiliriz

        System.out.println(sayilar[2]); // 8
        System.out.println(sayilar[4]); // 1

        // son elemana ulasmak icin length kullanilabilir
        System.out.println(sayilar[sayilar.length - 1   ]); // 1

        System.out.println(isimler[3]); // null


        // sayilar array'indeki tum elemanlari yazdirin
        System.out.println(sayilar[0]); // 3
        System.out.println(sayilar[1]); // 6
        System.out.println(sayilar[2]); // 8
        System.out.println(sayilar[3]); // 9
        System.out.println(sayilar[4]); // 1

        // eger bir array'in tum elemanlarina ulasmak veya yazdirmak isterseniz
        // bir for loop kullanabilirsiniz

        for (int i = 0; i < sayilar.length ; i++) {
            System.out.print(sayilar[i] + " ");
        }
        System.out.println("");

        for (int i = 0; i < isimler.length ; i++) {
            System.out.print(isimler[i] + " ");
        }
        System.out.println("");

        // atama icin de index kullanabiliriz
        sayilar[2] = 5;
        sayilar[4] = 7;

        // bir arrayi direkt yazdirmak isterseniz, array'i degil referansini yazdirir

        System.out.println(sayilar); // [I@3fb6a447
        System.out.println(isimler); // [Ljava.lang.String;@79b4d0f




        // tum array'i yazdirin

        System.out.println(Arrays.toString(sayilar)); // [3, 6, 5, 9, 7]
        System.out.println(Arrays.toString(isimler)); // [null, null, null, null, null]





















    }
}
