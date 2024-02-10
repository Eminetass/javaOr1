
import java.util.Scanner;
// HAVA DURUMUNA GÖRE ETKİNLİK ÖNEREN PROGRAM
public class etkinlikOnerme {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Derece: ");
        int sicaklik = scan.nextInt();
        String event = "";

        if (sicaklik < 5) {
            event = "Kayak ";
        } else if (sicaklik < 15) {
            event = "Tiyatro";
        } else if (sicaklik < 25) {
            event = "Mangal";
        } else {
            event = "Yüzme";
        }

        System.out.println("Önerilen Etkinlik: " + event);
    }

}