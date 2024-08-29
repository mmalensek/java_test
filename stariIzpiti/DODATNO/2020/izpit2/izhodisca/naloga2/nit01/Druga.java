
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

    //=========================================================================
    // V vseh testnih primerih velja:
    // 1 <= "stevilo vrstic tabele <= 100
    // 1 <= "stevilo stolpcev tabele <= 100
    //=========================================================================

    public static int zadnjaVrsticaZLocilom(char[][] krizanka) {
        int zadnjaVeljavna = -1;

        for(int i = 0; i < krizanka.length; i++){
            for(int y = 0; y < krizanka[i].length; y++){
                if(krizanka[i][y] == '-'){
                    zadnjaVeljavna = i;
                    break;
                }
            }
        }

        return zadnjaVeljavna;
    }

    //=========================================================================
    // V vseh testnih primerih velja:
    // 1 <= "stevilo vrstic tabele <= 100
    // 1 <= "stevilo stolpcev tabele <= 100
    // 0 <= stolpec < "stevilo stolpcev
    //=========================================================================

    public static char[] ktaBeseda(char[][] krizanka, int stolpec, int k) {
        
        int dolzinaBesede = 0, trenutnaBeseda = 1;
        
        char[] temp = new char[krizanka.length];

        for(int i = 0; i < krizanka.length; i++){
            if(krizanka[i][stolpec] == '-'){
                trenutnaBeseda++;
            }else if(trenutnaBeseda == k){
                temp[dolzinaBesede] = krizanka[i][stolpec];
                dolzinaBesede++;
            }
        }

        if(trenutnaBeseda < k){
            return null;
        }

        char[] VRNI = new char[dolzinaBesede];

        for(int i = 0; i < dolzinaBesede; i++){
            VRNI[i] = temp[i];
        }
 
        return VRNI;
    }
}
