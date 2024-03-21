import java.util.ArrayList;
public class Diziler2 {
    public static void main(String arg[]) {

        ArrayList<String> isimler = new ArrayList<String>(); ///ArrayList oluşturma

        //ArrayList'e değer ekleme
        isimler.add("Ahmet");
        isimler.add("Hayri");
        isimler.add("Ufuk");
        isimler.add("Hüseyin");
        isimler.add("Recep");

        String aranan ="Ufuk";
        Boolean durum = isimler.contains(aranan);

        if(durum){
            System.out.println(aranan + " ismi listede var.");
        }else{
            System.out.println(aranan +" isim listede yok.");
        }
        System.out.println("\n");
        if(durum){
            int sira = isimler.indexOf(aranan);
            System.out.println(aranan + " ismi listenin "+sira+ " sırasında var.");
        }else{
            System.out.println(aranan +" isim listede yok.");
        }
        System.out.println("\n");
        if(durum){
            isimler.remove(aranan);
        }else{
            System.out.println(aranan +" isim listede yok.");
        }
        System.out.println(isimler);
        System.out.println("\n");
        if(durum){
            int sira = isimler.indexOf(aranan);
            isimler.remove(sira);
        }else{
            System.out.println(aranan +" isim listede yok.");
        }
        System.out.println(isimler);



    }
}
