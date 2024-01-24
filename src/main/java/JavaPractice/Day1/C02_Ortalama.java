package Day1;

public class C02_Ortalama {

    public static void main(String[] args) {

        double num1 = 12.4;
        double num2 = 25.8;
        double num3 = 800;
        double num4 = 8.2;
        double num5 = 32.6;

        // Yukaridaki sayilarin ortalamasini hesaplayan bir kod yaziniz.
        // Ortalama hesaplama: Tum sayilari topla, sayi adedine bol.

        // 1. Yol
        double toplam = num1+num2+num3+num4+num5;
        System.out.println("toplam = " + toplam);

        System.out.println("Ortalama: "+ toplam/5);

        // 2. Yol
        System.out.println("Ortalama2:"+ (num1+num2+num3+num4+num5)/5);

    }

}
