package day02_stringManipulations;

import java.util.Locale;

public class C01_toUpperCase_toLowerCase {

    public static void main(String[] args) {

        String str = "Java ogrenmek cok guzel.";

        System.out.println(str.toUpperCase()); // JAVA OGRENMEK COK GUZEL.

        System.out.println(str); // Java ogrenmek cok guzel.


        // Kural1 : String hazir method'lari ile yapilan degisiklikler
        //          atama olmadikca KALICI OLMAZ

        str.toLowerCase();

        /*
            17.satirda toLowercase() gorevini yapip str'i kucuk harfe cevirir
             AMMMMAAA yazdirmadigimiz icin console'da gormeyiz
             kaydetmedigimiz icin de yapilan degisiklik kalici olmaz
         */

        System.out.println(str); // Java ogrenmek cok guzel.


        str = "Java ile hersey cok guzel";

        // str'i kalici olarak buyuk harflerden olusan bir metin haline getirin


        str = str.toUpperCase();

        System.out.println(str); // kalici degisiklikten sonra str'in degeri : JAVA ILE HERSEY COK GUZEL


        System.out.println(str.toLowerCase()); // java ile hersey cok guzel


        str= "JAVA CANDIR";

        System.out.println(str); // JAVA CANDIR

        System.out.println(str.toLowerCase()); // java candir


        // Eger kullanilan dilde herhangi bir harfin buyuk-kucuk harf gosterimleri
        // Turkce'den farkli ise
        // Local dili dikkate alarak donusturmesini isteyebiliriz.

        System.out.println( str.toLowerCase()  ); // java candir

        System.out.println("Cince karakter ile kucuk harfe dondurunce : " + str.toLowerCase(Locale.CHINA));
        // java candir


        str = str.toLowerCase(Locale.forLanguageTag("tr"));

        System.out.println(str); // java candır


        str = "Çok çalıştım, ama çalıştığıma değdi.";

        System.out.println(str.toUpperCase()); // ÇOK ÇALIŞTIM, AMA ÇALIŞTIĞIMA DEĞDI.


        // i'yi de Turkce karakter ile kucuk harf yapsin
        str = str.toLowerCase(Locale.forLanguageTag("Tr"));

        System.out.println(str); // çok çalıştım, ama çalıştığıma değdi.

        // i'yi de Turkce karakter ile buyuk harf yapsin
        str = str.toUpperCase(Locale.forLanguageTag("tr"));

        System.out.println(str); // ÇOK ÇALIŞTIM, AMA ÇALIŞTIĞIMA DEĞDİ.



    }
}
