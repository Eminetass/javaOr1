public class kapsulleme {
    public static void main(String args[]){
        personel jprogIns = new personel();
        /* 27 değeri SetPrivBilgi() private fonksiyonunun çağırılması için kullanılır. */
        jprogIns.setBilgi("Ahmet", "Kara", 27);
        String adsoyad = jprogIns.getBilgi();
        int yas = jprogIns.getPrivBilgi();
        System.out.println(adsoyad);
        System.out.println(yas);
    }
}
