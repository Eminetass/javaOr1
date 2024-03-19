import java.util.ArrayList;
public class Diziler1 {
    public static void main(String arg[]) {

        ArrayList<Integer> ogrenciNotlari = new ArrayList<Integer>(); ///ArrayList oluşturma

        //ArrayList'e değer ekleme
        ogrenciNotlari.add(75);
        ogrenciNotlari.add(35);
        ogrenciNotlari.add(40);
        ogrenciNotlari.add(100);
        ogrenciNotlari.add(68);

        //ArrayListi yazdırma
        System.out.println(ogrenciNotlari);
        System.out.println("\n");
        int elemanSayisi = ogrenciNotlari.size();
        System.out.println("Toplam Öğe Sayısı: "+ elemanSayisi);
        System.out.println("\n");
        System.out.println(ogrenciNotlari.get(2));
        System.out.println("\n");
        for(int i=0; i<ogrenciNotlari.size();i++){
            System.out.println( ogrenciNotlari.get(i) );
        }
        System.out.println("\n");
        for(int not:ogrenciNotlari){
            System.out.println( not );
        }
        
    }
}