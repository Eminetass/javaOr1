import java.util.Scanner;
//TEK SAYILARIN TOPLAMINI BULAN PROGRAM
//negatif deger girilene kadar girilen sayılardan tek olanları toplayıp ekrana yazan program
public class sayilarinToplaminiBulma {
    public static void main(String[] args){
        int n,k;
        int total=0;
        Scanner scan=new Scanner(System.in);

        System.out.println("Negatif sayı girene kadar girdiğiniz tek sayıları toplaya program");
        do{
            System.out.print("Sayı Giriniz: ");
            n= scan.nextInt();
            if(n%2==1){
                total +=n;
            }
        }while(n>=0);
        System.out.println("Toplam: "+total);
        System.out.println("Tek sayi girilene kadar girdiğiniz sayıların çeif te 4'ün katı olanları toplayan program");
        do{
            System.out.print("Sayı Giriniz: ");
            k= scan.nextInt();
            if(k%2==0 && k%4==0){
                total +=k;
            }
        }while(k%2==0);
        System.out.println("Toplam: "+total);




    }
}
