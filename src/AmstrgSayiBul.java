import java.util.Scanner;
//DÖNGÜLER İLE SAYININ AMSTRONG SAYI OLUP OLMADIĞINI BULAN PROGRAM
public class AmstrgSayiBul {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Sayi Giriniz: ");
        int number= scan.nextInt();
        int basNumber=0;
        int tempNumber=number;
        int basValue, result=0;
        int basPow;

        while (tempNumber!=0){
            tempNumber/=10;
            basNumber++;
        }

        tempNumber=number;
        while (tempNumber!=0){
            basValue=tempNumber%10;
            basPow=1;
            for (int i=1;i<=basNumber;i++){
                basPow*=basValue;
            }
            result*=basPow;
            tempNumber/=10;
        }

        if (result==number){
            System.out.println(number+" sayisi bir Amstrong sayidir.");
        }else{
            System.out.println(number+" sayisi bir Amstrong sayisi değildir.");
        }

       /* int a=2451,basamakSayisi=0,numberCounter=0;
        //basamak sayısı bulma işlemi
        //2451/10=245
        //245/10=24
        //24/10=2
        //2/10=0
        //0/10=0
        while (a != 0) {
            a /= 10;
            numberCounter++;
        }

        // Bir sayının son basamağını bulma
        // 2451 % 10 = 1
        int b = 2451;
        int c = b % 10;

        int sub = 2, sup = 3;
        int result = 1;
        for (int i = 1; i <= sup; i++ ){
            result *= sub;
        }
        System.out.println(result);

        */

    }
}
