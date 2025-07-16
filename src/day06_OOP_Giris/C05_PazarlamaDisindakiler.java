package day06_OOP_Giris;

public class C05_PazarlamaDisindakiler {

    public static void main(String[] args) {

        C04_Pazarlama obje = new C04_Pazarlama();

        // obje.satisMiktariPri = 75; // 'satisMiktariPri' has private access in
        // System.out.println(obje.satisMiktariPri);
        // private olanlari ne goruntuleyebiliyoruz
        // ne de deger atayabiliyoruz

        obje.satisMiktariDef = 5000;
        System.out.println(obje.satisMiktariDef);
        // default access modifier'a sahip  olanlari
        // hem goruntuleyebiliyoruz
        // hem de deger atayabiliyoruz

        obje.satisMiktariPro = 4000;
        System.out.println(obje.satisMiktariPro);
        // protected access modifier'a sahip  olanlari
        // hem goruntuleyebiliyoruz
        // hem de deger atayabiliyoruz

        obje.satisMiktariPub = 8000;
        System.out.println(obje.satisMiktariPub);
        // public access modifier'a sahip  olanlari
        // hem goruntuleyebiliyoruz
        // hem de deger atayabiliyoruz



        /*
            1- satis bolumundeki personel
               rapor’un olusmasi icin gerekli bilgileri girebilmeli
               ancak sonuclari gorememeli.
               degistirebilmeli ama gorememeli

            2- Rapor olusturulduktan sonra,
               izin verilen kullanicilar raporu gorebilmeli
               ancak veriler uzerinde degisiklik yapamamali.
               gorebilmeli ama degistirememeli
         */
    }
}
