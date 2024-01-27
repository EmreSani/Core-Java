package d11loops;

public class WhileLoops01 {
    public static void main(String[] args) {

/*        for(baslangic degeri; loop calisma kurali; artirma/azaltma){
            //calisacak kodlar
        }*/

        /*baslangic degeri
        while (loop calisma kurali){
            //calisacak kodlar
            artirma/azaltma
        }*/

        //Ornek 1: 3'den 6'ya kadar tamsayilari console'a yazdiriniz (3 ve 6 dahil)
        //1.yol: for loop

        for (int i = 3; i < 7; i++) {
            System.out.println(i);
        }

        System.out.println("------------");

        //2.yol: while loop
        int i = 3;

        while ( i < 7){

            System.out.println(i);

            i++;
        }
        //Odev: //Ornek 2: 23'den 12'ye kadar cift tamsayilari console'a yazdiriniz(12 dahil)

    }
}
