package Day7;
//    çalışan işçi ise;
//            1-Çalışanın aylık çalışma saatine göre 160 saat üstü her saat için brüt maaşı 10 dolar artır
//            2-Çalışanın çalışma süresi 10 yıl ve üzeri ise maaşından %30;
//            daha az ise maaşından %20 vergi kesintisi yapılıyor
public class IsciMuhasebe implements GenelMuhasebe {

    @Override
    public double ekMesaiHesapla(int calismaSaati) {
        if (calismaSaati>160){
            double ekMesai=(calismaSaati-160)*10;
            System.out.println("Aylık ek mesai ücreti: "+ekMesai);
            return ekMesai;
        }else {
            return 0;
        }
    }

    @Override
    public double vergiHesapla(double brutMaas, int calismaYili) {
        double vergi;
        if (calismaYili>10){
            vergi=brutMaas*30/100;
        }else {
            vergi=brutMaas*20/100;
        }
        System.out.println("Vergi : "+vergi);
        return vergi;
    }

    @Override
    public double netMaasHesapla(double brutMaas, int calismaYili, int calismaSaati) {
        return brutMaas+ekMesaiHesapla(calismaSaati)-vergiHesapla(brutMaas,calismaYili);
    }
}
