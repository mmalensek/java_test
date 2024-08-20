
/*
Samodejno testiranje:
tj.exe

Javni testni primeri:
01-05: najMnozica
06-10: pogostost
01, 06: ro"cno izdelana
*/

import java.util.*;

public class Cetrta {

    public static Set<String> najMnozica(Map<String, Set<String>> sopomenke) {
        Set<String> VRNI = new HashSet<>();

        int maxBesed = 0;
        for (Map.Entry<String, Set<String>>  besede : sopomenke.entrySet()) {
            Set<String> trenutno = besede.getValue();
            if(trenutno.size() > maxBesed){
                maxBesed = trenutno.size();
                VRNI = trenutno;
            }
        }

        return VRNI;
    }

    public static Map<Set<String>, Integer> pogostost(String besedilo, Map<String, Set<String>> sopomenke) {
        Map<Set<String>, Integer> VRNI = new HashMap<>();

        String[] anex = besedilo.split(" ");

        for(int i = 0; i < anex.length; i++){
            for (Map.Entry<String, Set<String>> entry : sopomenke.entrySet()) {
                Set<String> synonyms = entry.getValue();

                // If the word belongs to the current set of synonyms
                if (synonyms.contains(anex[i])) {
                    // Update the frequency map
                    if(VRNI.containsKey(synonyms)){
                    int stevilo = VRNI.get(synonyms);
                    VRNI.put(synonyms, stevilo + 1);
                    }else{
                        VRNI.put(synonyms, 1);
                    }

                    break;  // Once found, no need to check other synonym sets
                }
            }
        }

        return VRNI;
    }

    // pomo"zne metode, notranji razredi (po potrebi) ...

    public static void main(String[] args) {
        // koda za ro"cno testiranje (po potrebi) ...
    }
}
