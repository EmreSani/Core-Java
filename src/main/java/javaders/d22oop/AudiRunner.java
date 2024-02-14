package javaders.d22oop;

public class AudiRunner {
    public static void main(String[] args) {


        //Motor m = new Motor(); HATA: Interface'lerden object uretemezsiniz
        AudiA4 a4 = new AudiA4();
        a4.turbo(); //Audi A4 turbo motor kullanir
        a4.analog(); //Audi A4 analog klima kullanir
        a4.esp(); //Audi A4 esp fren sistemi kullanir


    }
}
