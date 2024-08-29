
/*
 * Testiranje:
 *
 * tj.exe
 */

import java.util.*;

public class Cetrta {

    public static interface Generator {
        public int naslednji();
    }

    public static int stKlicev(Generator gen, int k) {
        boolean jeK = false;
        int stevec = 0;

        HashMap<Integer, Integer> tabela = new HashMap<>();

        while(!jeK){
            stevec++;
            int stevilo = gen.naslednji();
            tabela.put(stevilo, tabela.getOrDefault(stevilo, 0) + 1);
            if(tabela.containsValue(k)){
                for(Map.Entry<Integer, Integer> clen : tabela.entrySet()){
                    if(clen.getValue() == k){
                        return stevec;
                    }
                }
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        // koda za ro"cno testiranje (po "zelji)
    }
}
