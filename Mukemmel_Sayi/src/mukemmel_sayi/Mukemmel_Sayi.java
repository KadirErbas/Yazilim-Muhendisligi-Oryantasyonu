package mukemmel_sayi;

import java.util.Scanner;

public class Mukemmel_Sayi {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int toplam = 0;

        System.out.print("Bir sayi giriniz: ");
        int sayi = scan.nextInt();

        for (int i = 1; i < sayi; i++) {
            if (sayi % i == 0) {
                toplam = toplam + i;
            }
        }
        if (sayi == toplam) {
            System.out.println(sayi + " Mükemmel bir sayidir");
        } else {
            System.out.println(sayi + " Mükemmel bir sayi degildir.");
        }
    }

}
