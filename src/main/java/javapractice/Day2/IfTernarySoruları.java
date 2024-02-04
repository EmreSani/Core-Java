package javapractice.Day2;

public class IfTernarySoruları {
     /*
     Soru-1: Kullanicidan alacaginiz iki sayiyi yine kullaniciya sectireceginiz dort islemden biri ile isleme koyup sonucun yazdiriniz
     Soru-2: Kullanicidan 3 tane pozitif  tam sayi alniz. Bu uc sayinin ucgen olusturma durumunu kontrol ediniz
	         Eger ucgen olabiliyor ise, es kenar ucgen olma durumunu da  kontrol edniz
	        INFO-->üçgen olma sarti :herhangi iki kenar toplami diger kenardan büyük, herhangi iki kenar farkı diger kenardan büyük olmali
		          a+b>c>a-b
		          a+c>b>a-c
	              b+c>a>b-c
		          a=b=c ise es kenar ucgen
     Soru-3: Kullanicinin boyunu  m  ve kilosunu kg alarak  BMI (VKE) hesaplayiniz
	        INFO : BMI = kilo(kg) /(boy*boy)(m)
		           BMI <=20 oldukca zayifsiniz
		           20<BMI<=25 Normal sinirlardasiniz
		           25<BMI<=30 Sisman kategorisindesiniz
		           30<BMI ==> Obez grubundasiniz.
	Soru-4: Kullanicidan IT alanini bilgisini alarak console'a  meslegi için;
	        qa ==> Quality Analyst
		    dev ==> Developer
			ba ==> Busines Analyst
			pm ==> Project Manager
		    seklinde bilgilerini yazdiriniz
    Soru-5: Kullanicidan  yasini ve kilosunu alaliniz
		    18 yasindan kucuk ise kan bagisi yapamaz
		    18 yasindann buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz.
		    18 yasindan buyuk ve 50 kilodan agir ise kan bagisi yapabilir.
	Soru-6: Kullanıcıdan aldığınız koordinat noktasının hangi bölgede olduğunu yazdıran bir kod yazınız.
	Soru-7: Kullanicidan 1 harf (karakter) aliniz ve bunun buyuk harf, kucuk harf yada hatali giris seklinde code create ediniz
	Soru-8: Kullanicidan aldigi urunun adedini ve liste fiyatini alin, kullaniciya musteri karti olup olmadigini sorun.
            Musteri karti varsa ve 10 urunden fazla alirsa %20, yoksa %15 indirim yapin
            Musteri karti yoksa ve 10 urunden fazla alirsa %15, 10 urunden az alirsa %10 indirim yapan code create ediniz
    Soru-9: Kulanıcıdan aracının hızını alınız.Trafik cezasının değerini hesaplayın. 54 hız sınırıdır.
            Eğer hızınız 55-74 arasında ise:Ceza 100 $'dır.
            Eğer hızınız 75 - 84 arasında ise:Ceza 150 $'dır.
            Eğer hızınız 85 -94 arasında ise:Ceza 320 $'dır.
            Eğer hızınız 94'den daha fazla ise: Ceza 500 $'dır.
            ve ayrıca,
            Eğer sürücünün ehliyeti yoksa cezaya 200 $ eklenir.
            Örn: Hızınız 77 iken cezanız 150$'dır ama ehliyetiniz yoksa ceza 350 $ olur.
            Örn;
            currentSpeed(Hızınız) 87
            ve isDriverLicenceAvailable(Ehliyeti var mı?) = true;  sonuç 320 olmalıdır.
            currentSpeed(Hızınız) 65
            ve isDriverLicenceAvailable(Ehliyeti var mı?) = false; sonuç 300 olmalıdır.
    Soru-10:Girilen 3 basamaklı bir sayıyı yazı ile yazdırınız
    Soru-11:Kullanıcının yasadıgı güne  göre 100 gün sonra hangi gün olduğunuz yazdırınız.(pazartesi hafta başlangıcı)
    Soru-12:Bankamatik Sorusu-->Bakıye (başlangıç bakıyesi 1000 tl) öğrenme, para yatırma ve cekme, çıkış işlemlerinin yapıldıgı bie ATM app. code create ediniz
    Soru-13:Seyahat Projesi-->Bulundugunuz yerden, bir yere yolculuk edeceksiniz.
            A. Köln veya Frankfurta gidebilirsiniz.
            B. Bilet fiyatı hesabı = Her 20 Km başına 5 euro. örn: (100 km yol. Bilet parası  (100/20)* 5 =25 euro
              İPUCU:  toplamTutar, işlem, FrankfurtKm, KmBirimFiyat   gibi sabit veri tipleri oluşturabilirsiniz.
              İşlemlerde direkt bunları cağırabilirsiniz.
              todo İLK OLARAK;
             "Nereye yolculuk etmek istiyorsunuz? (Frankfurt :60KM---Köln:80 KM---(20 KM başına 5 euro bilet parası alınmaktadir..)yazısı gelsin.
       1.Frankfurt veya Köln olarak bir giriş yapın. (Girdiğiniz sehrin harfleri , girildikten sonra büyük hale gelsin.
              todo Frankfurt girildiyse,
                 örn: girdi= Frankfurt
                 case=FRANKFURT:
                 Rota = Frankfurt yazdırın.
                 Frankfurt km hesabı işlemi yapın. son olarak konsolda: Frankfurt 15 Euro yazsın.
              todo case: KÖLN ise
                 "Rota = Köln" yazdırın. km hesabına göre işlemi yapınız.son olarak konsolda:  Köln   20 Euro yazsın.
       2.Sistem bize "Kaç kişilik bilet istiyorsunuz? (Max 2 kişilik olabilir):" sorusunu sorsun.
             case:1 ise" 1 kişilik " yazdırın. (1 kişilik seçerseniz bir işlem yapmanıza gerek kalmaz, bilet ücreti yukarıda çoktan belirlenmiş olur.
             case:2 ise "2 kişilik " yazdırın.2 kişi için bilet fiyatını hesaplayın.
              todo  Son olarak yolculugunuzu check edin;
        konsolda örn:   Frankfurt  - 2 Kişilik    yazsın.
        a.Bakiyemi belirtin.
        b.Toplam Tutarı belirtin.
        c.double paraUstu oluşturun ve hesaplayın.
        d.Double para üstünü yazdırın.
    Soru-14:Kullanıcıdan üç adet sayı alarak bu sayıların bir dik üçgenin kenar uzunlukları olup olmadığını hesaplatan bir kod yazınız
            (İpucu: Bir üçgenin dik olduğunu anlamak için a2+b2=c2 pisagor bağlantısından yararlanabilirsiniz)
            Örnek Ekran Çıktısı
            birinci kenarı giriniz: 2
            ikinci kenarı giriniz 15
            üçüncü kenarı giriniz: 7
            Bu bir dik üçgen değildir/Bu bir dik üçgendir
    Soru-15:Katsayıları verilen 2 bilinmeyenli denklemin kökleriniz bulunuz.
            ax^2 + bx + c;
            Çözüm adımları-->kullanıcıdan a,b,c yi okutun.
            Delta = bb - 4ac
            Delta > 0 => 2 tane kök vardır x1=(-b + kök(d)) / (2a)  , x2= (-b - kök(d)) / (2*a)
            Delta = 0 => 1 tane kök vardır x = -b/2a
            Delta < 0 ise kök yoktur.
    Soru-16:Kullanıcının girdiği yılın artık yıl olup olmadığını kontrol eden code create ediniz.
    Soru-17:Kullanicidan bir sayi aliniz
            Sayi 0 dan buyuk esit ise 10 dan kucuk olup olmadigini kontrol ediniz.
            10 dan kucuk ise ekrana "Rakam" yazdiriniz degilse "Pozitif Sayi" yazdiriniz.
            Sayi o dan kucuk ise ekrana "Negatif Sayi" yazdiriniz.
    Soru-18:Kullanicidan bir character girmesini isteyiniz
            Character harf ise kucuk harf olup olmadigini kontrol ediniz
            Kucuk harf ise ekrana "Kucuk Harf" yazdiriniz
            Buyuk harf ise ekrana "Buyuk Harf" yazdiriniz
            Harf degilse ekrana "Harf degil" yazdiriniz
            97:a  122:z ascii değeri
    Soru-19:Kullanıcıdan bir pozitif tamsayı girmesini isteyin, o pozitif tamsayı 3 basamaklı ise ekrana “3 Basamaklı” yazdırın.
            3 basamaklı degilse çift olup olmadigini kontrol edin. Çift ise “3 basamaklı olmayan çift sayı” yazdırın.
            Çift sayı degilse “3 basamaklı olmayan tek sayı yazdırın.
    Soru-20:Kullanıcıdan notunu alın ve aşağıdaki kurallara göre console'a A, B, C veya D yazdırın.
		    -> 0(dahil) ile 50 arasi - D
		    -> 50(dahil) ile 60 arası - C
		    -> 60(dahil) ile 80 arası - B
		    -> 80(dahil) ustu- A
		Yanlis not girilirse ekrana "Gecerli not giriniz" yazdirin

		*** IPUCU--> switch() de long kullanilmaz, float kullanilmaz, double kullanilmaz, boolean kullanilmaz.
		             switch() de int, byte, short, char, String kullanilir.

     */
}
