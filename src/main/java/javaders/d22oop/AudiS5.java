package javaders.d22oop;
public class AudiS5 implements Motor, Klima, Fren{

    @Override
    public void abs() {
        System.out.println("Audi S5 abs fren sistemi kullanir");
    }

    @Override
    public void esp() {
        System.out.println("Audi S5 esp fren sistemi kullanir");
    }

    @Override
    public void analog() {
        System.out.println("Audi S5 analog klima kullanir");
    }

    @Override
    public void dijital() {
        System.out.println("Audi S5 dijital klima kullanir");
    }

    public void eco() {
        System.out.println("Audi S5 ekonomik motor kullanir");
    }

    @Override
    public void turbo() {
        System.out.println("Audi S5 turbo motor kullanir");
    }

    @Override
    public void gas() {
        System.out.println("Audi S5 benzinli motor kullanir");
    }
}