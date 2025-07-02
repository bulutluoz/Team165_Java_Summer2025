package day04_arrays;

import java.util.Arrays;

public class C03_ArrayinElementleriniUpdateEtmeVeElemanEkleme {

    public static void main(String[] args) {

        /*
            9- array olusturulurken icine konulacak elementlerin data turu
               ve array'e kac eleman konulacagi belirtilmelidir.
               Olusturulmus bir array'in uzunlugu sonradan degismez
               YANNNIIII array'e yeni element eklemek veya array'den eleman silmek
               direkt yapilabilecek bir islem degildir
         */

        int[] sayilar = {4,7,9,1,5};

        sayilar[2] = 12;
        sayilar[4] = 0 ;

        System.out.println(Arrays.toString(sayilar)); // [4, 7, 12, 1, 0]


        // sayilar array'ine 6.eleman olarak 15 ekleyin
        sayilar[5] = 15 ;
        // ArrayIndexOutOfBoundsException

        // sayilar array'inin ilk elemanini silin



    }
}
