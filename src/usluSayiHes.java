import java.util.Scanner;
//GİRİLEN DEĞERLER İLE ÜSLÜ SAYI HESAPLAYAN PROGRAM
public class usluSayiHes {
    public static void main(String[] args){
        int n,k;
        Scanner scan=new Scanner(System.in);

        System.out.print("Üssü alınacak sayı: ");
        n= scan.nextInt();
        System.out.print("Üs olacak sayı: ");
        k= scan.nextInt();
        int total=1;

        int i=1;
        while(i<=k){
            total*=n;
            i++;
        }
        System.out.println("Cevap: "+total);



    }
}
