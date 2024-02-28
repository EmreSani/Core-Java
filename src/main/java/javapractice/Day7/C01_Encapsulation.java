package Day7;

public class C01_Encapsulation {

    //Encapsulation: data hiding

        /*
    bir class oluşturalım.
    private access modifiera sahip variablelar oluşturun: isim, soyisim, yas seklinde
    parametreli ve parametresiz constructor oluşturun
    toString metodunu oluşturun
     */

    private String isim;

    private String soyisim;

    private  int yas;


    //parametreli constructor
    public C01_Encapsulation(String isim, String soyisim, int yas) {
        this.isim = isim;
        this.soyisim = soyisim;
        if (yas>=0){
            this.yas=yas;
        }else{
            System.out.println("Yaş değeri negatif olamaz!!!");
        }

    }

    //parametresiz const
    public  C01_Encapsulation(){

    }

    //getter-setter


    public String getIsim() {
        if (isim!=null) {
            return isim.charAt(0) + "*".repeat(isim.length() - 1);
        }else {
            return null;
        }
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyisim() {
        if(soyisim!=null) {
            return soyisim.charAt(0) + "*".repeat(soyisim.length() - 1);
        }else{
            return null;
        }
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        if (yas>=0){
            this.yas=yas;
        }else{
            System.out.println("Yaş değeri negatif olamaz!!!");
        }
    }

    //toString: Objemizin fieldlarını Stringe dönüştürmek
    @Override
    public String toString() {
        return "{" +
                "isim='" + isim + '\'' +
                ", soyisim='" + soyisim + '\'' +
                ", yas=" + yas +
                '}';
    }

    /*
    POJO:Plain Old Java Object
    1-private access modifier: fields
    2-paramli ve paramsiz const.
    3-getter-setter
    4-toString
     */


}
