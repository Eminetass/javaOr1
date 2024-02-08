import java.util.Scanner;
//kullanıcıdan alınan para değerinin kdv'li fiyatını ve KDV tutarını hesaplayan program
//KDV tutarı %18 olarak alınacak.
public class javaOr1 {
        public static void main(String[] args) {
            Scanner scan=new Scanner(System.in);
            System.out.print("Para değeri giriniz: ");
            double paraDegeri= scan.nextDouble();
            System.out.println("Para değeri: "+paraDegeri);
            double kdvliFiyat = (double) (paraDegeri+((paraDegeri*18)/100));
            System.out.println("KDV'li Para Değeri : "+kdvliFiyat);
            System.out.print("Bir ücret giriniz: ");
            int ucret= scan.nextInt();
            if(ucret <=1000){
                System.out.println("girdiğiniz ücret: "+ucret);
                int kdvli = (int)(ucret+((ucret*18)/100));
                System.out.println("Ücretinizin KDV'li hali: "+kdvli);
            }
            else{
                System.out.println("girdiğiniz ücret: "+ucret);
                int kdvli = (int)(ucret+((ucret*8)/100));
                System.out.println("Ücretinizin KDV'li hali: "+kdvli);
            }
        }
}
