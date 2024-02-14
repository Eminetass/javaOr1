import java.util.Scanner;
//KULLANICININ GİRDİĞİ YILIN ARTIK OLUP OLMADIĞINI BULAN PROGRAM
public class artikYilHesaplama {
    public static void main(String[] args){
        int yil;
        Scanner scan=new Scanner(System.in);
        System.out.print("Yıl Giriniz: ");
        yil= scan.nextInt();
        if(yil%4==0){
            if(yil%100==0){
                if(yil%400==0){
                    System.out.println(yil+" bir artık yıldır. ");
                }else{
                    System.out.println(yil+" bir artık yıl değildir.");
                }
            }else{
                System.out.println(yil+" bir artık yıldır.");
            }
        }else{
            System.out.println(yil+" bir artık yıl değildir.");
        }

    }
}
