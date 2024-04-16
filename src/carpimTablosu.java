import java.util.Scanner;

public class carpimTablosu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int n = input.nextInt();

        int i = 1;

        do {
            int j = 1;

            do {
                System.out.print(i * j + "\t");
                j++;
            } while (j <= n);

            System.out.println();
            i++;
        } while (i <= n);

        input.close();
    }
}
