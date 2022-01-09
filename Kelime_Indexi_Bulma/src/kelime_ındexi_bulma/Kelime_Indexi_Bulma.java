
package kelime_ındexi_bulma;

import java.util.Scanner;


public class Kelime_Indexi_Bulma {


    public static void main(String[] args) {
        Scanner klavye=new Scanner(System.in);
        System.out.println("Cümle gir");
        String cumle=klavye.nextLine();
        System.out.println("aranan kelimeyi gir");
        String aranan= klavye.nextLine();
        String sonuc= "bulunamadı";
        String parca;
        for (int i = 0; i <= cumle.length()-aranan.length(); i++) {
          parca=cumle.substring(i,i+aranan.length());
            if (parca.equals(aranan)) {
                sonuc="bulunduğu yer: "+i;
            }
        }
        System.out.println(sonuc);
    }
    
}
