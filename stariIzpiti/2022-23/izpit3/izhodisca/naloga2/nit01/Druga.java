
/*
Samodejno testiranje:

tj.exe

Javni testni primeri:
01: primer iz besedila
02--04: natanko dva elementa true
05--07: H = 1
01, 08--10: splo"sni primeri
*/

import java.util.*;

public class Druga {

    public static int razdalja(int x1, int y1, int x2, int y2){
        return Math.abs(x1-x2) + Math.abs(y1 - y2);
    }

    public static int[] manhattan(boolean[][] t) {
        int[] VRNI = new int[t.length + t[0].length - 1];

        for(int vrstica = 0; vrstica < t.length; vrstica++){
            for(int stolpec = 0; stolpec < t[0].length; stolpec++){
                if(t[vrstica][stolpec]){
                    for(int novaVrstica = 0; novaVrstica < t.length; novaVrstica++){
                        for(int noviStolpec = 0; noviStolpec < t[0].length; noviStolpec++){
                            if(t[novaVrstica][noviStolpec] && (novaVrstica != vrstica || noviStolpec != stolpec)){
                                VRNI[razdalja(novaVrstica, noviStolpec, vrstica, stolpec)]++;
                                // System.out.println("NAŠEL ["+novaVrstica+","+noviStolpec+"] in ["+vrstica+","+stolpec+"]");
                            }
                        }
                    }
                }
            }
        }

        for(int i = 0; i < VRNI.length; i++){
            VRNI[i] /= 2;
        }

        return VRNI;
    }

    // pomo"zne metode, notranji razredi (po potrebi) ...

    public static void main(String[] args) {
        // koda za ro"cno testiranje (po potrebi)
    }
}
