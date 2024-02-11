import java.util.Scanner;
//MESAFE VE ŞARTLARA GÖRE UÇAK BİLETİ FİYATI HESAPLAYAN PROGRAM
//
public class biletFiyatiHesaplama {
    public static void main(String[] args){
        int yas,km,tip;
        double tutar,indTutar,topTutar;

        Scanner scan=new Scanner(System.in);

        System.out.print("Mesafeyi km türünden giriniz: ");
        km=scan.nextInt();
        if (km > 0) {
            System.out.print("Yaşınızı giriniz: ");
            yas= scan.nextInt();
            if(yas>0){
                System.out.print("Yolculuk tipini giriniz:  (1=>tek yön,2=> Gidiş Dönüş)");
                tip= scan.nextInt();
                if(tip==1 || tip==2) {
                    tutar = (double) km * 0.1;
                    System.out.println("Normal tutar: " + tutar);
                    if (yas < 12) {
                        indTutar = tutar / 2;
                        System.out.println("Yaş İndirimli Tutar: " + indTutar);
                        if (tip == 1) {
                            System.out.println("Ödemeniz gereken ücret: " + indTutar);
                        } else {
                            topTutar = (indTutar - (indTutar * 0.2));
                            System.out.println("Ödemeniz gereken ücret: " + topTutar);
                        }
                    } else if (yas < 24) {
                        indTutar = (tutar - (tutar * 0.1));
                        System.out.println("Yaş İndirimli Tutar: " + indTutar);
                        if (tip == 1) {
                            System.out.println("Ödemeniz gereken ücret: " + indTutar);
                        } else {
                            topTutar = (indTutar - (indTutar * 0.2));
                            System.out.println("Ödemeniz gereken ücret: " + topTutar);
                        }
                    } else if (yas > 65) {
                        indTutar = (tutar - (tutar * 0.3));
                        System.out.println("Yaş indirimli Tutar: " + indTutar);
                        if (tip == 1) {
                            System.out.println("Ödemeniz gereken ücret: " + indTutar);
                        } else {
                            topTutar = (indTutar - (indTutar * 0.2));
                            System.out.println("Ödemeniz gereken ücret: " + topTutar);
                        }
                    } else {
                        System.out.println("indirim uygulanamaz !");
                        if (tip == 1) {
                            System.out.println("Ödemeniz gereken ücret: " + tutar);
                        } else {
                            topTutar = (tutar - (tutar * 0.2));
                            System.out.println("Ödemeniz gereken ücret: " + topTutar);
                        }
                    }
                }else{
                    System.out.println("Hatalı veri girdiniz!");
                }

            }else{
                System.out.println("Hatalı veri girdiniz!");
            }

        }else{
            System.out.println("Hatalı veri girdiniz !");
        }


    }
}
