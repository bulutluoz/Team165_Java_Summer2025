package day05_constructors_staticKeyword;

public class C04_Hastane {

    /*
        Baska class'lardan kullanilabilecek ozelliklere sahip
        bir Hastane class'i olusturdugumuzda

        Bu class'da olusturulacak class level variable'larin
        instance mi yoksa static mi olacagina
        o variable'larin objelerle iliskisine bakarak karar veririz

        EGER variable HER OBJE icin ORTAK bir deger alacaksa (hastane adi, hastane tel, bashekim ismi)
        variable static olarak olusturulur

        EGER variable HER OBJE icin O OBJEYE OZEL bir deger alacaksda (hemsire ismi, hemsire adresi, ....)
        variable instance olarak olusturulur
     */

    static String hastaneIsmi = "Yildiz Hastanesi";
    static String hastaneAdresi = "Cankaya";
    static String hastaneTel = "03123123232";
    static String bashekim = "Ali Can";

    String perIsmi = "Deger atanmadi";
    String perAdresi = "Deger atanmadi";
    String perTel = "Deger atanmadi";
}
