
/*
Samodejno testiranje:

tj.exe

Javni testni primeri:

01--05: klici metode zamenjaj
06--10: preverjanje implementacije vmesnika Iterable<T>
01--03, 06--08: ro"cno izdelani
*/

import java.util.*;

public class Cetrta {

    public static class Miks<T> implements Iterable<T>{
        private List<T> seznam;
        private Set<T> mnozica;

        public Miks(List<T> seznam, Set<T> mnozica) {
            this.seznam = seznam;
            this.mnozica = mnozica;
        }

        @Override
        public String toString() {
            return String.format("%s | %s", this.seznam, this.mnozica);
        }
        @Override
        public Iterator<T> iterator() {
            Iterator<T> seznamIterator = seznam.iterator();
            Iterator<T> mnozicaIterator = mnozica.iterator();
            Iterator<T> VRNI = new Iterator<T>() {
                public boolean hasNext(){
                    if(seznamIterator.hasNext()){
                        return true;
                    }else{
                        return mnozicaIterator.hasNext();
                    }
                }
                public T next(){
                    if(seznamIterator.hasNext()){
                        return seznamIterator.next();
                    }else{
                        return mnozicaIterator.next();
                    }
                }
            };

            return VRNI;
        }

        public List<T> vrniSeznam() {
            return this.seznam;
        }

        public Set<T> vrniMnozico() {
            return this.mnozica;
        }

        public void zamenjaj() {
            ArrayList<T> temp = new ArrayList<>();
            for(T element : seznam) {
                temp.add(element);
            }
            seznam.clear();
            for(T element : mnozica){
                seznam.add(element);
            }
            mnozica.clear();
            mnozica.addAll(temp);
        }
    }

    //=========================================================================

    public static void main(String[] args) {
        // koda za ro"cno testiranje (po potrebi) ...
    }
}
