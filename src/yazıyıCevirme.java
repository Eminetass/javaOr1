import java.util.Scanner;
public class yazıyıCevirme {
    public static void main(String[] args) {

        // Klavyeden okuma yapmak için Scanner nesnesini oluştur.
        Scanner reader = new Scanner(System.in);
        System.out.print("Bir Sayı Girin: ");

        String yazi = reader.nextLine();
        String cevrilen = cevir(yazi);
        System.out.println("Çevrilen Yazı: " + cevrilen);
    }

    public static String cevir(String yazi)
    {
        if (yazi.isEmpty())
            return yazi;

        return cevir(yazi.substring(1)) + yazi.charAt(0);
    }
}
