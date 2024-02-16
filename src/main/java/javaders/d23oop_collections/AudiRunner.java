package javaders.d23oop_collections;

public class AudiRunner {
    public static void main(String[] args) {

        //Motor m = new Motor(); HATA: interface'lerden object uretemezsiniz

        AudiA4 a4 = new AudiA4();
        a4.turbo(); //Audi A4 turbo motor kullanir
        a4.analog(); //Audi A4 analog klima kullanir
        a4.esp(); //Audi A4 esp fren sistemi kullanir
        //a4.run(); //Audi A4 havayastigi calistirir
        ((Motor)a4).run(); //Audi A4 havayastigi calistirir
        //Motor interface'inden gelen run() methodu calisti

        //Motor.fiyat = 500; //final ispati.yeni deger atayamazsiniz

        System.out.println(Motor.fiyat); //300
        System.out.println(Klima.fiyat); //200
        System.out.println(Fren.fiyat); //100

        Motor.hiz(); //Saatte 250km
        a4.guc(); //200HP

    }
}
