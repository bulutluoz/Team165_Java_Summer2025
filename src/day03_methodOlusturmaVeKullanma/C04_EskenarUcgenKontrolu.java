package day03_methodOlusturmaVeKullanma;

public class C04_EskenarUcgenKontrolu {

    public static void main(String[] args) {

        // verilen 3 kenar uzunlugunu karsilastirip
        // kenar uzunluklari birbirine esit ise "Eskenar ucgen",
        // kenar uzunluklari esit degilse "Eskenar ucgen degil" yazdiran
        // bir method olusturun
        // NOT : girilen kenarlardan negatif veya sifir olan varsa
        //       girilen degerler gecerli degil yazdirmali

        eskenarUcgenMiYazdir(5,7,9); // Eskenar ucgen degil
        eskenarUcgenMiYazdir(8,8,9); // Eskenar ucgen degil
        eskenarUcgenMiYazdir(6,6,6); // Eskenar ucgen
        eskenarUcgenMiYazdir(0,5,6); // girilen degerler gecerli degil
        eskenarUcgenMiYazdir(-4,-4,-4); // girilen degerler gecerli degil


    }

    // gorevde "yazdiran" dedigi icin method'un void oldugunu anliyoruz

    public static void eskenarUcgenMiYazdir(int kenar1, int kenar2, int kenar3 ){

        if (kenar1<=0 || kenar2<=0 || kenar3<=0){
            System.out.println("girilen degerler gecerli degil");
        } else if (kenar1 == kenar2 && kenar2==kenar3) {
            System.out.println("Eskenar ucgen");
        } else {
            System.out.println("Eskenar ucgen degil");
        }

    }


}
