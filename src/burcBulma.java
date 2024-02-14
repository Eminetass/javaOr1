import java.util.Scanner;

public class burcBulma {
    public static void main(String[] args) {
        int month, day;
        String burc = "";
        boolean isError = false;

        Scanner scan = new Scanner(System.in);
        System.out.print("Doğduğunuz ay: ");
        month = scan.nextInt();
        System.out.print("Doğduğunuz gün: ");
        day = scan.nextInt();

        switch (month) {
            case 1:
                if (day >= 1 && day <= 31) {
                    if (day < 22) {
                        burc = "Oğlak";
                    } else {
                        burc = "Kova";
                    }
                } else {
                    System.out.println("Geçersiz bir gün girdiniz. ");
                }
                break;
            case 2:
                if (day >= 1 && day <=28) {
                    if (day < 20) {
                        burc = "Kova";
                    } else {
                        burc = "Balık";
                    }
                } else {
                    System.out.println("geçersiz bir gün girdiniz.");
                }
                break;
            default:
                System.out.println("Geçersiz bir ay girdiniz.");


        }
    }
}
