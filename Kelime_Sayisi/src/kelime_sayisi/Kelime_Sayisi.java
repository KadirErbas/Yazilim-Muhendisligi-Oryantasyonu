package kelime_sayisi;

import java.util.Scanner;


public class Kelime_Sayisi {


    public static void main(String[] args) {
        
        Scanner klavye= new Scanner(System.in);
        System.out.println("Cümle yazınız: ");
        String cumle=klavye.nextLine();
        int kelimeSayisi=1;
        
        for (int i = 0; i < cumle.length(); i++) {
                      
            if (cumle.charAt(i)==' ') {
                kelimeSayisi+=1;                                       
            }        
        }
         
        System.out.println("kelime sayısı= "+kelimeSayisi);
    }
    
}
