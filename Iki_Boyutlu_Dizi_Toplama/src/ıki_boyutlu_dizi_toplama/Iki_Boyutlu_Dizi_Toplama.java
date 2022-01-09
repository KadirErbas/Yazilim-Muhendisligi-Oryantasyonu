package ıki_boyutlu_dizi_toplama;

public class Iki_Boyutlu_Dizi_Toplama {

    public static void main(String[] args) {
        int[][] dizim = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}};
        int[][] dizim2 = {{12, 11, 10}, {9, 8, 7}, {6, 5, 4}, {3, 2, 1}};
        int toplam = 0;
        for (int i = 0; i < dizim.length; i++) {
            for (int j = 0; j < dizim[0].length; j++) {
                toplam += dizim[i][j] + dizim2[i][j];
            }
        }
        System.out.println(toplam);
    }

}
