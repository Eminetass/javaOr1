import java.util.Scanner;
// matematik,fizik,kimya,türkçe,tarih,müzik derslerinin sınav punalarını al ve ort hesapla
public class javaOr3 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int mat,fizik,kimya,turkce,tarih,muzik;
        System.out.print("matematik notunuzu giriniz: ");
        mat= scan.nextInt();
        System.out.print("fizik notunuzu giriniz: ");
        fizik= scan.nextInt();
        System.out.print("kimya notunuzu giriniz: ");
        kimya= scan.nextInt();
        System.out.print("turkce notunuzu giriniz: ");
        turkce= scan.nextInt();
        System.out.print("tarih notunuzu giriniz: ");
        tarih= scan.nextInt();
        System.out.print("muzik notunuzu giriniz: ");
        muzik= scan.nextInt();

        double  ortalama=((mat+fizik+kimya+turkce+tarih+muzik)/6);
        System.out.println("notların ortalaması: "+ortalama);

        if(ortalama>60){
            System.out.println("sınıfı geçti");
        }
        else{
            System.out.println("sınıfta kaldı");
        }

    }

}
