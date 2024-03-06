import java.util.Scanner;
// ASAL SAYILARI BULAN PROGRAM
public class AsalSayBul {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Bir Sayi Giriniz: ");
        int number= scan.nextInt();
        boolean isPrime = true;
        for(int i=2; i<number; i++){
            if(number%i ==0){
                isPrime=false;
                break;
            }
        }

        if(isPrime){
            System.out.println(number+" sayısı ASALDIR. ");
        }else{
            System.out.println(number+" sayısı ASAL değildir. ");
        }






    }
}
