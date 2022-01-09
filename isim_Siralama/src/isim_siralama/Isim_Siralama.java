package isim_siralama;

public class Isim_Siralama {

    public static void main(String[] args) {
        String[] isimListesi = {"Ali", "Deniz", "Buse", "Zeynep", "Cenk"};

        for (int i = 0; i < isimListesi.length - 1; i++) {
            for (int j = i + 1; j < isimListesi.length; j++) {
                if (isimListesi[i].compareTo(isimListesi[j]) > 0) {
                    String temp = isimListesi[i];
                    isimListesi[i] = isimListesi[j];
                    isimListesi[j] = temp;
                }
            }
        }

        for (int i = 0; i < isimListesi.length ; i++) {
            System.out.println(isimListesi[i]);
        }

    }

}
