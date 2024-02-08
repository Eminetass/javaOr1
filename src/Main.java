import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Derece: ");
        int sicaklik=scan.nextInt();
        String event="";

        if(sicaklik<5){
            event="Kayak ";
        }else if(sicaklik<15){
            event="Tiyatro";
        } else if(sicaklik<25){
            event="Mangal";
        } else{
            event="Yüzme";
        }

        System.out.println("Önerilen Etkinlik: "+event);
        System.out.println("\n----------------------------------------------------------------------\n");

        Scanner scanner=new Scanner(System.in);
        int n1= scanner.nextInt(),n2=scanner.nextInt(),n3 =scanner.nextInt();

        if(n1>= n2 && n1>=n3 ){
            System.out.println(n1 +" en büyük sayıdır ");
        }else if(n2 >=n1 && n2>=n3){
            System.out.println(n2 +"en büyük sayıdır ");
        }else{
            System.out.println(n3 +" en büyük sayidir");
        }


    }
}