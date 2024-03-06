import java.util.Scanner;

public class EbobEkokBul {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("n1 Sayısını giriniz: ");
        int n1= scan.nextInt();

        System.out.print("n2 Sayısını giriniz: ");
        int n2= scan.nextInt();

        for(int i=1; i<=(n1*n2); i++){
            if(i%n1 == 0 && i%n2 == 0){
                System.out.println("Girdiğiniz Sayıların Ekok'u: "+i);
                break;
            }
        }

        int ebob=1;
        for(int k=n1;k>=1;k--){
            if (n1%k == 0 && n2%k == 0){
                ebob=k;
                System.out.println("Girdiğiniz Sayıların Ebob'u: "+ebob);
                break;
            }
        }




    }
}
