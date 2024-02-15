import java.util.Scanner;
 //KULLANICI BİLGİLERİNİN GİRİŞİ
    public class kullaniciGirisi {
        public static void main(String[] args){
            String userName,password;
            Scanner scan=new Scanner(System.in);
            System.out.print("Kullancı Adınız: ");
            userName=scan.nextLine();
            System.out.print("Şifreniz: ");
            password=scan.nextLine();

            if(userName.equals("EmineTass")&&password.equals("java123")){
                System.out.println("Giriş Yaptınız !");
            }else{
                System.out.println("Bilgileriniz Yanlış !");
                int deger;
                String password2;
                System.out.println("Şifrenizi sıfırlamak ister misiniz ? \n1-Evet\n2-Hayır");
                deger= scan.nextInt();
                if(deger==1){
                    Scanner sif=new Scanner(System.in);
                    System.out.print("Yeni şifre giriniz: ");
                    password2=sif.nextLine();
                    if(password2.equals("java123")){
                        System.out.println("Şifre oluşturulamadı,lütfen başka şifre giriniz.");
                    }else{
                        System.out.println("Şifre oluşturuldu. ");
                    }
                }else{
                    System.out.println("Şifrenizi tekrar deneyin.");
                }
            }







        }
    }