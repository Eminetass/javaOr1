import java.util.Scanner;
//GİRİLEN SAYİNİN MUKEMMEL SAYİ OLUP OLMADIĞINI BULAN PROGRAM
public class mukemmelSayiBul {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Bir Sayi Giriniz: ");
        int n= scan.nextInt();
        // 28'in kendisi hariç çarpanları 1,2,4,7,14
        // 1 den 28 e kadar olan ve 28 i kalansız bölen sayıları yazan döngü
        int total=0;
        for(int i=1;i<n;i++){
          if(n%i==0){
              total +=i;
          }
        }
        if(total==n){
            System.out.println(n+" Sayısı Bir Mükemmel Sayıdır.");
        }else{
            System.out.println(n+" Sayisi Bir Mükemmel Sayi Değildir. ");
        }

    }
}
