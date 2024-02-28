package Day7;

import java.util.HashMap;
import java.util.Map;

/*
İki farklı Arrayde aynı indekste barındırılan ad ve soyadları örnekteki gibi
yazdıran bir kod yazınız.
    input: ,{"John","Mark",""Ali} {"Steinbeck","Down","Can"};
    output: {John=Steinbeck, Mark=down, Ali=Can}
 */
public class C04_Map {
    public static void main(String[] args) {

        String[] isimler={"John","Mark","Ali"};
        String[] soyisimler={"Steinbeck","Down","Can"};

        Map<String,String> isimSoyisim=new HashMap<>();
        for (int i=0;i<isimler.length;i++){
            isimSoyisim.put(isimler[i],soyisimler[i]);
        }

        System.out.println(isimSoyisim);


    }
}
