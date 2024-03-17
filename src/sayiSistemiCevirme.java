
public class sayiSistemiCevirme {
    public static void main(String[] args){
        int onluk =82;
        int sekizlik =onlukSekizlikDonustur(onluk);
        System.out.printf("%d(onluk) = %d(sekizlik)",onluk,sekizlik);
        System.out.println("\n");
        int sekizlik2=416;
        int onluk2=sekizlikOnlukDonustur(sekizlik2);
        System.out.printf("%d(sekizlik2) =%d(onluk2)",sekizlik2,onluk2);

    }
    public static int onlukSekizlikDonustur(int onluk){
        int sekizlikSayi =0,i=1;
        while(onluk !=0){
            sekizlikSayi +=(onluk %8)*i;
            onluk /=8;
            i *=10;
        }
        return sekizlikSayi;
    }
    public static int sekizlikOnlukDonustur(int sekizlik2){
        int onluk2 =0, i=0;
        while(sekizlik2 !=0){
            onluk2 += (sekizlik2 %10) * Math.pow(8,i);
            ++i;
            sekizlik2/=10;
        }
        return onluk2;
    }
}
