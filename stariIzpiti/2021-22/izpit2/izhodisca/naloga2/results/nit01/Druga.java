
/*
 * tj.exe
 */

import java.util.*;

public class Druga {

    public static int stolpecZNajvecPrevladujoceZelenimi(int[][][] slika) {
        int indeks = 0, max = 0, stolpec;

        for(int i = 0; i < slika[0].length; i++){
            stolpec = 0;
            for(int y = 0; y < slika.length; y++){
                if(slika[y][i][0] < slika[y][i][1] && slika[y][i][2] < slika[y][i][1]){
                    stolpec++;
                }
            }

            if(stolpec > max){
                indeks = i;
                max = stolpec;
            }
        }

        return indeks;
    }

    public static void main(String[] args) {
        // koda za ro"cno testiranje (po potrebi)
    }
}
