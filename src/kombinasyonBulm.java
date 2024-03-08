import java.util.Scanner;
//KOMBİNASYON BULMA  FORMÜL=C(n,r)=n!/(r!*(n-r)!)
public class kombinasyonBulm {
    public static void main(String[] args) {
        int n,r,a;
        int totaln=1,totalr=1,totala=1,totals;
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç elemanlı kümede işlem yapıyorsunuz: ");
        n= scan.nextInt();
        System.out.print("oluşturacağınız gruplar kaç elemanlı: ");
        r= scan.nextInt();

        for(int i=1;i<=n;i++){
            totaln=totaln*i;
        }
        for(int i=1;i<=r;i++){
            totalr=totalr*i;
        }

        a=n-r;
        for(int i=1;i<=a;i++){
            totala=totala*i;
        }
        totals=totaln/(totalr*totala);
        System.out.println("Oluşabilecek kombinasyon sayısı C(n,r): "+totals);



    }
}