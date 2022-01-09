package yildizdan_dikdörtgen;
import java.util.Scanner;

public class Yildizdan_dikdörtgen {

    
    public static void main(String[] args) {
       
        Scanner klavye= new Scanner(System.in);
        System.out.println("En giriniz: ");
        int en= klavye.nextInt();
        System.out.println("Boy giriniz: ");
        int boy= klavye.nextInt();

        for (int i = 0; i < boy; i++) {
            for (int j = 0; j < en; j++) {
                System.out.print(" *");
            }
            System.out.println();
                
        
        }
        
        
    }
    
}
