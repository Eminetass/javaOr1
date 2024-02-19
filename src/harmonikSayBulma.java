import java.util.Scanner;
//JAVA İLE GİRİLEN SAYININ HERMONİK SERİSİNİ BULAN PROGRAM
public class harmonikSayBulma {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("N  sayısını giriniz: ");
        int n= scan.nextInt();
        double result=0.0;
        for(double i=1;i<=n;i++){
            result +=(1/i);
        }
        System.out.println(n+"sayısının hermonik sayısı: "+result);
    }
}
