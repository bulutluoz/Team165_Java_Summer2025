package day05_constructors_staticKeyword;

public class Runner {
    public static void main(String[] args) {


        C04_Hastane hem1 = new C04_Hastane();

        System.out.println(hem1.perIsmi); // DA
        System.out.println(hem1.perAdresi); // DA
        System.out.println(C04_Hastane.bashekim);// Ali Can

        C04_Hastane hem2 = new C04_Hastane();
        hem2.perIsmi = "Veli";
        hem2.perAdresi = "Kizilay";
        hem2.hastaneAdresi = "Kizilay";

        System.out.println(hem2.perIsmi); // Veli
        System.out.println(hem1.perIsmi); // DA

        System.out.println(hem1.hastaneAdresi);
        // Static member 'day05_constructors_staticKeyword.C04_Hastane.hastaneAdresi' accessed via instance reference
        // static variable'lara class icinden heryerden direkt olarak erisilebilir
        // baska class'lardan static variable'lara ulasmak icin
        // classIsmi.staticVaribleIsmi (class ismi ile cagirma)yontemi kullanilir
        // obje uzerinden static variable'i kullanirsaniz
        // Java altini kirmizi cizmez ama sari yaparak bizi uyarir
        // static member olan hastaneAdresi variable'ina static olmayan, instance yontemle ulasildi

        System.out.println(hem2.hastaneAdresi);
        System.out.println(C04_Hastane.hastaneAdresi);

    /*
    static variable'lar erisim acisindan ayricaliklidir
    cunku class'icinde her yerden kullanilabilir

    ANCAKKKK
    veri takibi acisindan static keyword dezavantajlidir
    Cunku tum objeler ve method'lar
    static variable'lari kullanabilir
    ve DEGISTIREBILIR

    herkesin static variable'lari degistirebilir olmasi
    variable'in degerini takip etmek
    ve degisimlere karsi korumak gerektiginde
    isimizi zorlastirir

     */
    }
}
