import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;
//FAKÖRİYEL HESAPLAYAN PROGRAM
public class faktoriyelBulma {
    public static void main(String[] args){

        Scanner scan=new Scanner(System.in);
        System.out.print("Faköriyel sayısı: ");
        int n= scan.nextInt();
        int total=1;

        for(int i=1;i<=n;i++){
            total=total*i;
        }
        System.out.println(n+" Faktöriyel: "+total);

    }
}
