
/*
 * tj.exe
 */

import java.util.*;

public class Druga {
    public static int potZoge(int strelec, boolean[][] igralci, int smer) {
        int polovicka = igralci.length / 2;
        int maxDolzina;
        if(smer == 1){
            maxDolzina = igralci[0].length - strelec - 1;
        }else{
            maxDolzina = strelec;
        }

        for(int i = 1; i < maxDolzina; i++){
            for(int visina = 0; visina < igralci.length - polovicka && visina <= i; visina++){
                if(igralci[visina + polovicka][strelec + (i * smer)] == true || igralci[-visina + polovicka][strelec + (i * smer)] == true){
                    return i;
                }
            }
        }

        return maxDolzina;
    }

    public static void main(String[] args) {
        boolean[][] igralci = new boolean[7][12];

        System.out.println(igralci.length / 2);

    }
}
