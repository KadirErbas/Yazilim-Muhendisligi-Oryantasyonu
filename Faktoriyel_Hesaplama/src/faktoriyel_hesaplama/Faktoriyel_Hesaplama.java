package faktoriyel_hesaplama;
import java.util.Scanner;
        
public class Faktoriyel_Hesaplama {

      
    public static void main(String[] args) {
        
        Scanner Klavye= new Scanner (System.in);

        System.out.println("Sayı girin: ");
        int sayi=Klavye.nextInt();
        int sonuc;
        sonuc=1;
       
        for (int i = 1; i <= sayi; i++) {
            sonuc=sonuc*i;           
        }      
        
        System.out.println(sonuc);
             
           
    }
    
}
