import java.util.Scanner;
//DONGULERLE 0'DAN GİRDİĞİMİZ SAYIYA KADAR 3 VE 4'DE TAM BÖLÜNENLERİN ORTALAMASINI BULAN PROGRAM
public class sayibulma {
    public static void main(String []args){
        int k,t=0;
        Scanner scan=new Scanner(System.in);
        System.out.print("Sayı Giriniz: ");
        k= scan.nextInt();

        for(int i=1; i<=k ; i++) {
            if (i % 3 == 0 && i%4==0) {
                System.out.println(i);
                t += i;
            }
        }
        System.out.println("Toplamları "+t);

    }
}
