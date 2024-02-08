import java.util.Scanner;
//TAKSİMETRE PROGRAMI
//KM başına 2.20TL ,minimum tutar 20,taksimetre açılış ucreti 10TL
public class javaOr4 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int km;
        double perKm=2.20,total,startPrice=10;
        System.out.print("Mesafeyi KM cinsinden giriniz: ");
        km=scan.nextInt();
        total=(km*perKm);
        total +=startPrice;
        total=(total<20)?20:total;
        System.out.println("Toplam tutar: "+total);

    }
}
