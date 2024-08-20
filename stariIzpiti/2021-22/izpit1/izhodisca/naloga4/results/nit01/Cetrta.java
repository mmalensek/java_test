
/*
 * tj.exe
 */

import java.util.*;

public class Cetrta {

    public static <T> List<T> odsek(Iterator<T> it, int p, int q) {
        
        List<T> VRNI = new ArrayList<>();
        
        for(int i = 0; i <= q; i++){
            if(i >= p && i <= q){
                VRNI.add(it.next());
            }else{
                it.next();
            }
        }

        return VRNI;
    }

    public static Iterator<Integer> manjkajoci(Iterator<Integer> it, int zacetek) {
        
        Iterator<Integer> iterator = new Iterator<>() {
            int trenutno = zacetek;
            int razlika = 0, naslednji = 0, indeks = 0;
            
            @Override
            public boolean hasNext() {
                return true;
            }
            
            @Override
            public Integer next() {
                while(it.hasNext()){
                    indeks++;
                    if(razlika == 0){
                        naslednji = it.next();
                        razlika = naslednji - trenutno;
                    }

                    if(razlika > 0){
                        razlika--;
                        trenutno++;
                        if(razlika == 0){
                            trenutno++;
                        }
                        if(indeks == 1){
                            return trenutno - 2;
                        }
                        return trenutno; 
                    }
                }
                return null;
            }
            
        };

        return iterator;
    }

    public static void main(String[] args) {
        // koda za ro"cno testiranje (po potrebi)
    }
}
