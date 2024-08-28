
/*
Samodejno testiranje:

tj.exe

Javni testni primeri:

01, 02: ro"cno izdelana
03--10: samodejno izdelani

01, 03--06: klici metode alternirajoceMonotono
02, 07--10: klici metode generator
*/

import java.util.*;
import java.util.function.*;

public class Cetrta {

    public static void main(String[] args) {
        // dopolnite za potrebe ro"cnega testiranja
    }

    public static <T> boolean alternirajoceMonotono(List<T> zaporedje, Comparator<T> prim) {
        for(int i = 0; i + 2 < zaporedje.size(); i += 2){
            if(prim.compare(zaporedje.get(i), zaporedje.get(i + 2)) >= 0){
                return false;
            }
        }
        for(int i = 1; i + 2 < zaporedje.size(); i += 2){
            if(prim.compare(zaporedje.get(i), zaporedje.get(i + 2)) <= 0){
                return false;
            }
        }
        return true;
    }

    public static Supplier<Integer> generator(int a, int b) {
        Supplier<Integer> VRNI = new Supplier<Integer>() {
            
            private int indeks = 0;

            public Integer get(){
                int rezultat;
                if(indeks % 2 == 0){
                    rezultat =  a + (indeks / 2) * b;
                }else{
                    rezultat = a - (indeks / 2 + 1) * b;
                }
                indeks++;
                return rezultat;
            }
        };
        return VRNI;
    }

    // pomo"zne metode, notranji razredi (po potrebi) ...
}
