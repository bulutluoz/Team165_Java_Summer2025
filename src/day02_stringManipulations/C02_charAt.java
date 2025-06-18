package day02_stringManipulations;

public class C02_charAt {

    public static void main(String[] args) {

        String metin = "Java cok guzel";

        System.out.println(metin.charAt(0)); // metnin ilk harfini verir J

        System.out.println(metin.charAt(3)); // 3.index'deki karakteri verir  a

        System.out.println(metin.charAt(4)); // 4.index'deki karakteri verir  " " space

        // son karakteri yazdirin
        System.out.println(metin.charAt(13)); // l

        metin = "Java                 cok guzel";
        // eger metinde 30 karakter oldugunu biliyorsak
        // son karakteri yazdirin
        System.out.println(  metin.charAt(30 - 1)  ); // l


        System.out.println(  metin.length() ); // metin'deki karakter sayisini verir 30


        metin = "Ben bu ise bas koydum, bu Java ogrenilecek";

        // metin'deki karakter sayisini yazdirin

        System.out.println(metin.length()); // 42

        // son karakteri yazdirin
        System.out.println(  metin.charAt( 42 - 1) ); // k

        // sondan 3. karakteri yazdirin  c
        System.out.println( metin.charAt(  42 - 3   )); // c


        // bastan ve sondan 5.harfleri yazdirin
        System.out.println( "Bastan 5. karakter : " + metin.charAt(4)); // b

        System.out.println( "Sondan 5. karakter : " + metin.charAt(42 -5)); // l



        // metin'de 42 karakter oldugu biliniyorsa
        // 41.index'deki karakteri yazdirin
        System.out.println(metin.charAt(41)); // k


        // 4.index'deki karakteri yazdirin
        // System.out.println(metin.charAt(42)); // StringIndexOutOfBoundsException
                                                 // verilen index sinirlarin disinda


        // metin'de 42 karakter oldugu biliniyorsa
        // 45.index'deki karakteri yazdirin
        System.out.println(metin.charAt(45)); // StringIndexOutOfBoundsException

        // NOT : charAt() index olarak length veya daha buyuk bir sayi girilirsa
        //       StringIndexOutOfBoundsException verir
        //       ve bu satirlar duzeltilmeden hic bir satir veya class calismaz


    }
}
