import java.util.Scanner;
//DİK ÜÇGENDE HİPOTENÜSÜ BULAN PROGRAM
//kullanıcıdan dik kenarlarının uzunluğunu alan ve hipotenüsü hesaplayan
//üçgenin kenar uzunluğunu al ve alanını hesapla
public class javaOr2 {
      public static void main(String[] args){
            int a,b;
            double c;
            Scanner girdi=new Scanner(System.in);
            System.out.print("1. kenarı giriniz: ");
            a= girdi.nextInt();
            System.out.print("2.kenarı giriniz: ");
            b= girdi.nextInt();
            c=Math.sqrt((a*a)+(b*b));
            System.out.println("Hipotenüs: "+c);

            System.out.println("---------------------------------------");
            int d,e,f;
            double g,u;
            System.out.print("üçgnein 1.kenarının uzunluğunu giriniz:  ");
            d= girdi.nextInt();
            System.out.print("üçgnein 2.kenarının uzunluğunu giriniz:  ");
            e= girdi.nextInt();
            System.out.print("üçgnein 3.kenarının uzunluğunu giriniz:  ");
            f= girdi.nextInt();
            u=(d+e+f)/2;
            g=Math.sqrt(u*(u-d)*(u-e)*(u-c));
            System.out.println("Kenarlarını girdiğiniz üçgenin alanı: "+g);


      }
}
