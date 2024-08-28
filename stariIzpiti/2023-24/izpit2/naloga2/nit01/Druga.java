
/*
Samodejno testiranje:

tj.exe

Javni testni primeri:

01: primer iz besedila
02: vse smeri so 1 ali 2, ostalo enako kot v besedilu
02--06: vse smeri so 1 ali 2
01, 07--10: splo"sni primeri

V vseh testnih primerih (javnih in skritih) so elementi tabele <rel>
"stevila z intervala [-1000, 1000].
*/

import java.util.*;

public class Druga {

    public static void main(String[] args) {
        // dopolnite za potrebe ro"cnega testiranja
    }

    public static boolean celaTrue(boolean[][] tabela){
        for(int i = 0; i < tabela.length; i++){
            for(int y = 0; y < tabela[0].length; y++){
                if(tabela[i][y] == false){
                    return false;
                }
            }
        }
        return true;
    }

    public static int[][] visine(int[][] rel, int[][] smer) {
        int stVrstic = rel.length;
        int stStolpcev = rel[0].length;
        int[][] VRNI = new int[stVrstic][stStolpcev];
        boolean[][] jeZiher = new boolean[stVrstic][stStolpcev];
        jeZiher[0][0] = true;
        int stevec = 0;
        while(celaTrue(jeZiher) == false){
            stevec++;
            for(int i = 0; i < stVrstic; i++){
                for(int y = 0; y < stStolpcev; y++){
                    if(jeZiher[i][y] == false){
                        if(smer[i][y] == 1){
                            if(jeZiher[i][y - 1]){
                                VRNI[i][y] = VRNI[i][y - 1] + rel[i][y];
                                jeZiher[i][y] = true;
                            }
                        }
                        if(smer[i][y] == 2){
                            if(jeZiher[i - 1][y]){
                                VRNI[i][y] = VRNI[i - 1][y] + rel[i][y];
                                jeZiher[i][y] = true;
                            }
                        }
                        if(smer[i][y] == 3){
                            if(jeZiher[i][y + 1]){
                                VRNI[i][y] = VRNI[i][y + 1] + rel[i][y];
                                jeZiher[i][y] = true;
                            }
                        }
                        if(smer[i][y] == 4){
                            if(jeZiher[i + 1][y]){
                                VRNI[i][y] = VRNI[i + 1][y] + rel[i][y];
                                jeZiher[i][y] = true;
                            }
                        }
                    }
                }
            }
        }
        System.out.println(stevec);
        return VRNI;
    }
}
