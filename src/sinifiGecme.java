import java.util.Scanner;
//NOT ORTALAMANIZA GÖRE SINIFI GEÇME
public class sinifiGecme {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int mat, fizik, kimya, turkce, muzik;
            System.out.print("matematik notunuzu giriniz: ");
            mat = scan.nextInt();
            System.out.print("fizik notunuzu giriniz: ");
            fizik = scan.nextInt();
            System.out.print("kimya notunuzu giriniz: ");
            kimya = scan.nextInt();
            System.out.print("turkce notunuzu giriniz: ");
            turkce = scan.nextInt();
            System.out.print("muzik notunuzu giriniz: ");
            muzik = scan.nextInt();

            double ortalama = ((mat + fizik + kimya + turkce + muzik) / 5);
            System.out.println("notların ortalaması: " + ortalama);

            if (ortalama > 55) {
                System.out.println("sınıfı geçti");
            } else {
                System.out.println("sınıfta kaldı");
            }

        }

}
