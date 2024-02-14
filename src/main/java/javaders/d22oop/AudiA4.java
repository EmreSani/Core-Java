package javaders.d22oop;

public class AudiA4 implements Motor, Klima, Fren{
    /*
    a) interface’leri parent yapmak icin ‘implements’ keyword’u child icinde kullanilir

    b) extends kullanilmaz cunku bu iki class arasinda kullanilir

    c) AudiA4 Class’i, Motor interface’i icindeki tum methodlari override etmek zorundadir.

    d) AudiA4 Class’i, Motor interface’i icindeki tum methodlari override etmek zorunda
    oldugundan method’larin bas kismina ‘override’ yazmak gerekmez bu yuzden yazmayiz.

    e) Class icinde access modifier yazilmazsa default kabul edildiginden, mecbur public yazariz
    */
    //override mecbur oldugu icin, ustune override yazmayiz
    //Burasi normal class, o yuzden void onune public yazariz yoksa default kabul eder

    //Motor interface'inden override edilenler
    public void eco(){
        System.out.println("Audi A4 ekonomik motor kullanir");
    }
    public void turbo(){
        System.out.println("Audi A4 turbo motor kullanir");
    }
    public void gas(){
        System.out.println("Audi A4 benzinli motor kullanir");
    }
    //Klima interface'inden override edilenler
    public void analog(){
        System.out.println("Audi A4 analog klima kullanir");
    }
    public void dijital(){
        System.out.println("Audi A4 dijital klima kullanir");
    }
    //Fren interface'inden override edilenler
    public void abs(){
        System.out.println("Audi A4 abs fren sistemi kullanir");
    }
    public void esp(){
        System.out.println("Audi A4 esp fren sistemi kullanir");
    }

    //ODEV: AudiS5 class'i olusturup, coklu parent'a child yapsin

}
