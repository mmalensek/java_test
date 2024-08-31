
/*
 * tj.exe
 */

import java.util.*;

public class Cetrta {

    public static void main(String[] args) {
        // koda za ro"cno testiranje (po potrebi)
    }

    public static <T> List<T> razmnozi(List<T> seznam, int n) {
        LinkedList<T> VRNI = new LinkedList<>();

        for(int i = 1; i <= n; i++){
            for(int y = 0; y < i; y++){
                VRNI.add(seznam.get(i - 1));
            }
        }
        for(int i = n; i <= seznam.size(); i++){
            for(int y = n; y < i; y++){
                VRNI.add(seznam.get(i - 1));
            }
        }
        return VRNI;
    }

    public static <T> Iterator<T> razmnozevalnik(List<T> seznam, int n) {
        // popravite / dopolnite ...
        return null;
    }
}
