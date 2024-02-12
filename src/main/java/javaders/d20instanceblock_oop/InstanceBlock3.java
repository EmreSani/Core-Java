package javaders.d20instanceblock_oop;

public class InstanceBlock3 {

    //Ornek 3: Bir araba fabrikasinda her araba siyah renkli ve yakit tipi benzin olsun.

    //(Bunlar ortak ozellikler. Digerleri sonra ayarlansin)

    public String color;
    public String fuelType;

    //instance block - Her obje uretildiginde burasi calisir
    {
        color = "Siyah";
        fuelType = "Benzin";
    }

    public InstanceBlock3(){
        System.out.println("Araba rengi : " + color);
        System.out.println("Araba yakit turu : " + fuelType);
    }

    //Parametreli constructor olusturarak farkli renk ve yakit tipinde araba uretebiliriz.

    public InstanceBlock3(String color, String fuelType) {
        this.color = color;
        this.fuelType = fuelType;
    }
}
