package day08_maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class C01_MapOlusturma {

    public static void main(String[] args) {

        /*
            Map olusturmaya baslamadan once
            bazi kararlar almamiz lazim
            1- Her bir kayit icin hangi bilgiler tutulacak
               no,isim,soyisim,sinif,sube,bolum

            2- hangi bilgi key olacak ?
               key olacak bilginin Unique olmasi zorunlu
               key ==> no

            3- geriye kalan bilgiler
               nasil TEK BIR VALUE haline getirilecek?
               Buna karar verirken olusturma ve sonradan erisip kullanabilme durumunu dikkate almaliyiz
               "simdilik" geriye kalan bilgileri bir String olarak birlestirecegiz
               Key==> 101, value ==> "Ali,Can,10,H,MF"

            4- bu bilgilere erisimi saglikli ve kolay yapabilmek icin
               bilgileri hangi sira ile tutacagiz
               ve aralarinda nasil bir ayirac olacak?
               "Esra Nur-Gul Yilmaz-11-R-TM"
         */

        List<String> isimler = new ArrayList<>();

        Map<Integer, String> ogrenciMap = new HashMap<>();

        ogrenciMap.put(101,"Ali-Can-11-H-MF");
        ogrenciMap.put(102,"Veli-Cem-10-K-TM");
        ogrenciMap.put(103,"Ali-Cem-11-K-TM");
        ogrenciMap.put(104,"Ayse-Can-10-H-MF");
        ogrenciMap.put(105,"Sevgi-Cem-11-M-TM");
        ogrenciMap.put(106,"Sevgi-Can-10-K-MF");
        ogrenciMap.put(107,"Esra-Han-11-M-SOZ");

        System.out.println(ogrenciMap);
        /*
                {
                  101=Ali-Can-11-H-MF,
                  102=Veli-Cem-10-K-TM,
                  103=Ali-Cem-11-K-TM,
                  104=Ayse-Can-10-H-MF,
                  105=Sevgi-Cem-11-M-TM,
                  106=Sevgi-Can-10-K-MF,
                  107=Esra-Han-11-M-SOZ
                  }

         */


        System.out.println(ogrenciMap.get(101)); // Ali-Can-11-H-MF


        // 102 numarali ogrencinin sinifini yazdirin

    }
}
