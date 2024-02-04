package Day1;

public class C03_KimlikBilgisi {

    public static void main(String[] args) {

            /*

                Isim, soyisim, yas, boy, kilo ozelliklerini yalnizca bir println icerisinde, alt alta yazdirin.

                Ornek:

                    Ali
                    XYZ
                    18
                    180
                    80

            */
        String isim = "Ali";
        String soyisim = "XYZ";
        int yas = 18;
        int boy = 180;
        int kilo = 80;
        System.out.println("Isim: "+isim);
        System.out.println("Soyisim: "+soyisim);
        System.out.println("Yas: "+yas);
        System.out.println("Boy: "+boy);
        System.out.println("Kilo: "+kilo);

        System.out.println("********************************");

        System.out.println(
                "Isim: "+isim
                +"\nSoyisim: "+ soyisim
                + "\nYas: "+yas
                +"\nBoy: "+boy
                +"\nKilo: "+kilo
        );



    }

}
