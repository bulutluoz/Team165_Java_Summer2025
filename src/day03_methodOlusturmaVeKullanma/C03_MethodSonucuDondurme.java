package day03_methodOlusturmaVeKullanma;

public class C03_MethodSonucuDondurme {

    public static void main(String[] args) {

        String str = "Java Candir";

        str.toUpperCase();

        /*
            9.satirdaki toUpperCase() calismis
            ve str'in buyuk harfe cevrilmis halini dondurmustur

            toUpperCase() inceledigimizde bize bir String dondurdugunu goruyoruz
            ama bu sonuc yazdirilmadigi icin konsolda goremeyiz

            ayni sekilde atama yapilmadigi icin
            str kalici olarak degismez

            method calisti, gorevini yapti
            ve bize "JAVA CANDIR" dondurdu
            artik bu method'u calistirirken
            dondurdugu sonucu ne yapacagimizi da dusunmeliyiz

            sadece yazdirmak istiyorsak
            System.out.println(str.toUpperCase());

            ya da str'i kalici olarak degistirmek istiyorsak
            str = str.toUpperCase()  yazabiliriz

         */

        System.out.println(str.toUpperCase());

        str= str.toLowerCase() + ".";


    }
}
