package day02_stringManipulations;

public class C04_equals {

    public static void main(String[] args) {

        // Java'da = isareti karsilastirma degil atama yapar
        // System.out.println( 5 = 5);

        // karsilastirma yapmak icin == kullanilir

        System.out.println(  5 == 5 ); // true

        System.out.println( 'b' == 98); // true

        // == isareti karsilastirma yapar ancak bu metinler icin gecerli degildir

        System.out.println( "ali" == "ali"); // true


        String s1 = "Ali";
        String s2 = "ali";
        String s3 = "ALI";
        String s4 = " Ali";
        String s5 = "Ali";
        String s6 = new String("Ali");

        System.out.println( s1 == s2); // Ali == ali   false
        System.out.println( s1 == s3); // Ali == ALI   false
        System.out.println(s1 == s5); // Ali == Ali true
        System.out.println(s1 == s6); // Ali == Ali False

        /*
            String'ler == ile karsilastirilmamalidir.
            ikisi de "Ali" olan 2 metni karsilastirdigimizda false verebilir
            Bunun icin metinlerin esitligine bakarken
            == degil eaquals kullanilir
         */

        // equals SADECE metne odaklanir.

        System.out.println(s1.equals(s2)); // Ali <==> ali false
        System.out.println(s1 .equals(s6)); // Ali == Ali True
        System.out.println(s1.equals("Ali")); // Ali <==> Ali true


        // esitligi kontrol ederken,
        // buyuk kucuk harf farketmeksizin karsilastirmak istersek

        System.out.println(s1.equalsIgnoreCase(s2)); // Ali <==> ali ==> true

        System.out.println(s1.equals(" Ali")); // Ali eic " Ali' false
        System.out.println(s1.equalsIgnoreCase(" Ali")); // Ali <==> " Ali" false
    }
}
