import java.util.Scanner;
//MANAV KASA PROGRAMI
//Kullanıcıların manavdan almış oldukları ürünlerin toplam tutuarlarını hesaplayan program.
public class javaOr7 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int armut,elma,domates,muz,patl;
        double tutar;
        System.out.print("Armut kaç kilo?:");
        armut= scan.nextInt();
        System.out.print("Elma kaç kilo? :");
        elma= scan.nextInt();
        System.out.print("Domates kaç kilo? :");
        domates= scan.nextInt();
        System.out.print("Muz kaç kilo? :");
        muz= scan.nextInt();
        System.out.print("Patlıcan kaç kilo? :");
        patl= scan.nextInt();

        tutar=(double)((armut*2.14)+(elma*3.67)+(domates*1.11)+(muz*0.95)+(patl*5.0));
        System.out.println("Toplam tutar: "+tutar);

    }
}
