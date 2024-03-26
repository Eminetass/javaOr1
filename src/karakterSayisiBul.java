//BİR KARAKTERİN BİR YAZIDA KAÇ TANE OLDUĞUNU BULAN PROGRAM.
//KELİME İÇİNDEKİ HARFLERİN TEKRAR SAYISINI BULMA
import java.util.Scanner;
import java.util.HashMap;
public class karakterSayisiBul {
    public static void main(String[] args){
        String metin = "Merhaba dünya bu java örnekleri";
        char karakter = 'e';
        int tane = 0;

        for(int i = 0; i < metin.length(); i++) {
            if(karakter == metin.charAt(i)) {
                ++tane;
            }
        }
        System.out.println( karakter + " yazı içinde  " + tane +" tanedir");


        String test="Merhaba Dünya yazısıdır 1231";
        HashMap<Object, Object> hmap = new HashMap<Object, Object>();

        for (int i = 0; i < test.length(); i++) {
            if(!hmap.containsKey(test.charAt(i)))
            {
                hmap.put(test.charAt(i),1);
            }
            else
            {
                int count= (int)hmap.get(test.charAt(i));
                hmap.put(test.charAt(i),count+1);
            }
        }
        System.out.println(test);
        System.out.println(hmap);

    }
}
