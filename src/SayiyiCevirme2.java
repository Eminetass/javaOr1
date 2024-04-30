import java.util.Scanner;
public class SayiyiCevirme2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir tam sayı girin: ");
        int sayi = input.nextInt();
        int tersi = 0;
        for (; sayi != 0; sayi /= 10) {
            int basamak = sayi % 10;
            tersi = tersi * 10 + basamak;
        }
        System.out.println("Girilen sayının tersi: " + tersi);
        input.close();
    }
}
