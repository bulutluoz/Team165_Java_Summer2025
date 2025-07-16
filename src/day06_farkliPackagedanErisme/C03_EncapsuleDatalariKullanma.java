package day06_farkliPackagedanErisme;

import day06_OOP_Giris.C08_PublicVeEncapsulationKarsilastirma;

public class C03_EncapsuleDatalariKullanma {

    public static void main(String[] args) {


        C08_PublicVeEncapsulationKarsilastirma obje = new C08_PublicVeEncapsulationKarsilastirma();

        System.out.println(obje.intPublic); // 20

        obje.intPublic = 56;

        System.out.println(obje.intPublic); // 56



        // System.out.println(obje.intPrivate); // 'intPrivate' has private access

        System.out.println(obje.getIntPrivate()); // 50

        // obje.intPrivate = 56; // 'intPrivate' has private access

        obje.setIntPrivate(60);

        System.out.println(obje.getIntPrivate()); // 60

    }
}
