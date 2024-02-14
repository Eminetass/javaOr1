import java.util.Scanner;
//KULLANICININ GİRDİĞİ SAYIYA KADAR ÇİFT OLAN SAYILARI BULAN PROGRAM
public class ciftSayiBulma {
    public static void main(String[] args){
        int k;
        Scanner scan=new Scanner(System.in);
        System.out.print("Sayı Giriniz: ");
        k= scan.nextInt();

        for(int i=1; i<=k ; i++){
            if(i%2==0){
                System.out.println(i);
            }
        }

    }

}
