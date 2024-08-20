
/*
Samodejno testiranje:
tj.exe

Javni testni primeri:
01: primer iz besedila
02-04: ni premikov levo in navzgor
01, 05-10: splo"sni primeri
*/

import java.util.*;

public class Druga {

    public static int[] poLomljenki(boolean[][] matrika) {
        int[] VRNI = new int[4];

        int X = 1, Y = 1;

        while(X != matrika.length - 2 || Y != matrika[0].length - 2){
            int stariX = X;
            int stariY = Y;

            if(matrika[X + 1][Y] == true){
                VRNI[3]++;
                X += 1;
                matrika[stariX][stariY] = false;
            }else if(matrika[X - 1][Y] == true){
                VRNI[1]++;
                X += -1;
                matrika[stariX][stariY] = false;
            }else if(matrika[X][Y + 1] == true){
                VRNI[2]++;
                Y += 1;
                matrika[stariX][stariY] = false;
            }else if(matrika[X][Y - 1] == true){
                VRNI[0]++;
                Y += -1;
                matrika[stariX][stariY] = false;
            }
        }

        return VRNI;
    }

    // pomo"zne metode, notranji razredi (po potrebi) ...

    public static void main(String[] args) {
        // koda za ro"cno testiranje (po potrebi)
    }
}
