import java.util.Scanner;
public class karakteriAlfabedeBul {
    public static void main(String[] args){
        Scanner scanCheck=new Scanner(System.in);

        System.out.println("Bir karakter dizisi girin: ");
        char ch = scanCheck.next().charAt(0);

        if(( ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')){
            System.out.println(ch + " bir harftir.");
        }else{
            System.out.println(ch + " bir haef değildir.");
        }
    }
}
