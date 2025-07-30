package day06_OOP_Giris;

public class C08_PublicVeEncapsulationKarsilastirma {

    // bir variable'i public yapmak ile
    // variable'i private yapip hem getter, hem setter olusturmak
    // islevsekl olarak ayni midir?

    public int intPublic = 20;



    private int intPrivate = 50;
    public int getIntPrivate() {
        return intPrivate;
    }
    public void setIntPrivate(int intPrivate) {
        this.intPrivate = intPrivate;
    }

    /*
        Iki durumda da proje kapsamindaki her class'dan
        hem deger atayabiliyor
        hem de degeri goruntuleyebiliyoruz

        aralarindaki tek fark
        getter ve setter method'lari kullanildiginda
        bu islemelere vurgu yapilmis oluyor.
     */




}
