
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

    public static int najCas(int[][] t, int krog) {
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < t.length; i++){
            if(t[i][krog] < min){
                min = t[i][krog];
            }
        }

        return min;
    }

    public static int[][] kumulativa(int[][] t) {
        int[][] VRNI = new int[t.length][t[0].length];

        for(int i = 0; i < t.length; i++){
            int vsota = 0;
            for(int y = 0; y < t[0].length; y++){
                vsota += t[i][y];
                VRNI[i][y] = vsota;
            }
        }

        return VRNI;
    }
}
