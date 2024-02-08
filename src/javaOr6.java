import java.util.Scanner;
//VÜCUT KİTLE İNDEKSİ HESAPLAMA
//kullanıcıdan boy ve kilo değeri alıp vücut kitle indeksini hesaplayan program
public class javaOr6 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int kg;
        double m,ind;
        System.out.print("Lütfen boyunuzu giriniz: ");
        m= scan.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz: ");
        kg= scan.nextInt();
        ind=(double)(kg/(m*m));
        System.out.println("Vücut kitle indeksiniz: "+ind);
        if(ind<19){
            System.out.println("Zayıfsınız. ");
        }
        else if(ind<25){
            System.out.println("Normalsiniz.");
        }
        else {
            System.out.println("kilolusunuz. ");
        }
    }
}
