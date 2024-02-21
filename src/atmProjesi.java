import java.util.Scanner;
//DONGULER İLE KULLLANICININ BANKA HESABINI YÖNETEBİLDİĞİ ATM PROJESİ
public class atmProjesi {
    public static void main(String[] args){
        String userName,passWord;
        Scanner scan=new Scanner(System.in);
        int right=3;
        int balance=1500;
        int select;
        while (right>0){
            System.out.print("Kullanıcı Adınız: ");
            userName=scan.nextLine();
            System.out.print("Parolanız: ");
            passWord= scan.nextLine();

            if(userName.equals("Emine")&&passWord.equals("emn123")) {
                System.out.println("Merhaba,Bankamıza hoş geldiniz.");

                do {
                    System.out.println("1-Para Yatırma\n2-Para Çekme\n3-Bakiye Sorgula\n4_Çıkış Yap");
                    System.out.print("Lütfen Yapmak İstediğiniz işlemi seçiniz: ");
                    select = scan.nextInt();
                    if (select == 1) {
                        System.out.print("Para Miktarı: ");
                        int price = scan.nextInt();
                        balance += price;
                    } else if (select == 2) {
                        System.out.print("Para Miktarı: ");
                        int price = scan.nextInt();
                        if (price > balance) {
                            System.out.println("bakiye Yetersiz");
                        } else {
                            balance -= price;
                        }
                    } else if (select == 3) {
                        System.out.println("Bakiyeniz: " + balance);
                    }
                } while (select != 4);
                System.out.println("Tekrar görüşmek üzere.");
                break;
            }else{
                right--;
                System.out.println("Hatalı kullanıcı adı veya şifre girdiniz.Tekrar deneyiniz.");
                if(right==0){
                    System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime giriniz");
                }else{
                    System.out.println("Kalan Hakkınız: "+right);
                }

            }
        }
    }
}
