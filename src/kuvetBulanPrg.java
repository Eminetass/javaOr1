import java.util.Scanner;
//GİRİLEN SAYIDAN KÜÇÜK 2'NİN KUVVETLERİNİ BULAN PROGRAM
public class kuvetBulanPrg {
    public static void main(String[] args){

        int n;
        Scanner scan=new Scanner(System.in);
        System.out.print("Sınır Sayısını Giriniz: ");
        n= scan.nextInt();

        for(int i=1; i<=n; i*=2){
            System.out.println(i);
        }

        for(int i=1;i<=n;i*=20){
            System.out.println(i);
        }
    }

}
