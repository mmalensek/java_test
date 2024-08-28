
/*
Samodejno testiranje:

tj.exe

Javni testni primeri:

01: primer iz besedila
02--03: prva skupina
04--05: druga skupina
06--07: tretja skupina
08--11: "cetrta skupina

POZOR: uporabljate lahko samo primitivne tipe, tipni parameter T in tip
Iterator<T>.
*/

import java.util.*;

public class Cetrta {

    public static void main(String[] args) {
        // dopolnite za potrebe ro"cnega testiranja
    }

    public static <T extends Comparable<T>> Iterator<T> zlitje(Iterator<T> a, Iterator<T> b) {
        Iterator<T> VRNI = new Iterator<>() {
            

            @Override
            public boolean hasNext(){
                if(a.hasNext() || b.hasNext()){
                    return true;
                }
                return false;
            }

            T nextA = a.next();
            T nextB = b.next();
            // private T nextA = a.hasNext() ? a.next() : null;
            // private T nextB = b.hasNext() ? b.next() : null;
            @Override
            public T next(){

                T result;

                if(nextA == null && nextB == null){
                    return null;
                }
                

                if (nextA.compareTo(nextB) <= 0) {
                    result = nextA;
                    nextA = a.hasNext() ? a.next() : null;
                } else {
                    result = nextB;
                    nextB = b.hasNext() ? b.next() : null;
                }

                return result;
            }
        };
        return VRNI;
    }

    // pomo"zne metode (po potrebi) ...
}
