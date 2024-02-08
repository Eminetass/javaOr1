import java.util.Scanner;
//DAİRENİN ALANINI VE ÇEVRESİNİ HESAPLAYAN PROGRAM
//yarı çapını kullanıcıdan aldığımız dairenin alanını ve çevresini hesaplayan program
public class javaOr5 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int r,a;
        double alan,cevre,pi=3.14;

        System.out.print("Dairenin yarı çapını giriniz: ");
        r= scan.nextInt();
        alan=(double)(pi*r*r);
        cevre=(double)(2*pi*r);
        System.out.println(" Dairenin alanı: "+alan);
        System.out.println("Dairenin çevresi: "+cevre);
        System.out.print("Merkez açı ölçüsü giriniz: ");
        a= scan.nextInt();
        double A=(pi*(r*r)*a)/360;
        System.out.println("Daire diliminin alanı: "+A);

    }
}
