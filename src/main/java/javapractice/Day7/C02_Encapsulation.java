package Day7;

public class C02_Encapsulation {
    public static void main(String[] args) {

        C01_Encapsulation obj=new C01_Encapsulation();
        //obj.isim


//        Ali,Can,25 özelliklerine sahip bir obje oluşturunuz ve yazdırınız

        C01_Encapsulation objAli=new C01_Encapsulation("Ali","Can",25);
        System.out.println(objAli);

//        yaşı 30 olarak güncelleyiniz

        objAli.setYas(30);
        System.out.println(objAli);

//        değişkenleri set edilmemiş ikinci bir obje oluşturunuz ve yazdırınız

        C01_Encapsulation objAyse=new C01_Encapsulation();
        System.out.println(objAyse);

//        Ayşe,Yılmaz, 40 değerlerini set ediniz ve yazdırınız

        objAyse.setIsim("Ayşe");
        objAyse.setSoyisim("Yılmaz");
        objAyse.setYas(40);
        System.out.println(objAyse);

//        yaşını -5 olarak güncelleyiniz ve yazdırınız

        objAyse.setYas(-5);
        System.out.println(objAyse);

//        yaş negatif değer olmamalı, gerekli düzeltmeyi yapınız.

        //Çözüm 1:setYas metoduna if bloğu ekledik
        //Çözüm 2:paramli constructora da if bloğu ekledik


//        isim ve soyismin sadece ilk harfi okunsun diğerleri * olsun,
//        getter metodunda gerekli düzeltmeyi yapınız.

        System.out.println(objAli.getIsim());
        System.out.println(objAli.getSoyisim());
        System.out.println(objAyse.getIsim()+" "+objAyse.getSoyisim());


    }
}
