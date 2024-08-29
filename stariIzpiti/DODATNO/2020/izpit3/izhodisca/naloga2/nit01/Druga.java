
/*
 * Testiranje:
 *
 * tj.exe
 */

import java.util.*;

public class Druga {

    public static void main(String[] args) {
        // koda za ro"cno testiranje (po "zelji)
    }

    public static int stPresezkov(int[][] r, int meja) {
        int stevec = 0;

        for(int i = 0; i < r.length; i++){
            for(int y = 0; y < r[i].length; y++){
                if(r[i][y] > meja){
                    stevec++;
                }
            }
        }

        return stevec;
    }

    public static int nedeljskoPovprecje(int[][] r) {
        int povprecje = 0;

        int stevec = 0;
        int nedelje = 0;
        for(int i = 0; i < r.length; i++){
            for(int y = 0; y < r[i].length; y++){
                stevec++;
                if(stevec % 7 == 0){
                    povprecje += r[i][y];
                    nedelje++;
                }
            }
        }

        povprecje /= nedelje;

        return povprecje;
    }
}
