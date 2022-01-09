package dizi_toplama;


public class Dizi_Toplama {


    public static void main(String[] args) {
       int[] sayidizisi={13,39,97,71};
       int toplam=0;
       for (int i = 0; i < sayidizisi.length; i++) {
            toplam+=sayidizisi[i];
        }
        System.out.println(toplam);
    }
    
}
