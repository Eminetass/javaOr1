import java.util.Scanner;
public class AlphabetCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir karakter girin: ");
        char ch = scanner.next().charAt(0);

        if (Character.isAlphabetic(ch)) {
            System.out.println(ch + " bir harftir.");
        } else {
            System.out.println(ch + " bir harf değildir.");
        }

    }
}
