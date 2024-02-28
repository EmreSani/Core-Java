package Day7;

public interface GenelMuhasebe {


    //public abstract double ekMesaiHesapla(int calismaSaati);
    //interfacelerde metodlar public ve abstract olmak zorundadır.
    double ekMesaiHesapla(int calismaSaati);

    double vergiHesapla(double brutMaas,int calismaYili);

    double netMaasHesapla(double brutMaas,int calismaYili,int calismaSaati);


}
