import java.util.Scanner;
public class basamakSayisiBul {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Bir tam sayı girin: ");
            int sayi = input.nextInt();
            int basamakSayisi = 0;
            for (int i = 1; i <= sayi; i *= 10) {
                basamakSayisi++;
            }
            System.out.println(sayi + " sayısının " + basamakSayisi + " basamağı vardır.");

        }
}
