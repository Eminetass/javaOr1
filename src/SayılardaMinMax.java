import java.util.Scanner;
//KALVYEDEN GİRİLEN N TANE SAYMA SAYISINIDAN MİN MAX'I BULAN PROGRAM
public class SayılardaMinMax {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Kaç Adet Sayı Gireceksiniz: ");
        int n= scan.nextInt();
        int min=0;
        int max=0;
        int number;
        if(n>0) {
            for (int i = 1; i <= n; i++) {
                System.out.print(i + ". sayıyı giriniz: ");
                number = scan.nextInt();
                if (number < min || min == 0) {
                    min = number;
                }
                if (number > max) {
                    max = number;
                }
            }
            System.out.println("En Büyük Sayı: " + max);
            System.out.println("En Küçük Sayı: " + min);
        }else{
            System.out.println("geçerli pozitif bir sayi giriniz...");
        }
    }
}
