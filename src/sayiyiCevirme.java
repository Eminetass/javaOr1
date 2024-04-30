import java.util.Scanner;
public class sayiyiCevirme {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir tam sayı girin: ");
        int sayi = input.nextInt();
        int tersi = 0;
        do {
            tersi = tersi * 10 + sayi % 10;
            sayi /= 10;
        } while (sayi > 0);
        System.out.println("Girilen sayının tersi: " + tersi);

    }
}
