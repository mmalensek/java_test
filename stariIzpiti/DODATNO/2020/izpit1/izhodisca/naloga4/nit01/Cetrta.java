
/*
 * Testiranje:
 *
 * tj.exe
 */

import java.util.*;

public class Cetrta {

    public static void main(String[] args) {
        // koda za ro"cno testiranje (po "zelji)
    }

    public static class Celica implements Comparable<Celica>{
        private int vrstica;
        private int stolpec;

        public Celica(int vrstica, int stolpec) {
            this.vrstica = vrstica;
            this.stolpec = stolpec;
        }

        @Override
        public String toString() {
            return String.format("(%d, %d)", this.vrstica, this.stolpec);
        }

        /*public interface Comparable {
            public int compareTo(Celica drugi);
        }*/

        public int compareTo(Celica druga){
            if(this.vrstica < druga.vrstica){
                return -1;
            }if(this.vrstica > druga.vrstica){
                return 1;
            }if(this.stolpec < druga.stolpec){
                return -1;
            }if(this.stolpec > druga.stolpec){
                return 1;
            }return 0;
        }
        
        // dopolnite po potrebi ...
    }

    public static class Ovojnik implements Iterable<Celica>{
        private boolean[][] tabela;

        public Ovojnik(boolean[][] tabela) {
            this.tabela = tabela;
        }

        @Override
        public Iterator<Cetrta.Celica> iterator() {
            return enice().iterator();            
        }

        public Comparator<Celica> getManhattanComparator() {
            return new Comparator<Celica>() {
                @Override
                public int compare(Celica ena, Celica druga) {
                    int a = Math.abs(ena.stolpec - tabela[0].length / 2) + Math.abs(ena.vrstica - tabela.length / 2);
                    int b = Math.abs(druga.stolpec - tabela[0].length / 2) + Math.abs(druga.vrstica - tabela.length / 2);
    
                    if (a < b) {
                        return -1;
                    }
                    if (a > b) {
                        return 1;
                    }
                    return ena.compareTo(druga); // If distances are equal, use natural order
                }
            };
        }

        public NavigableSet<Celica> enice() {
            NavigableSet<Celica> VRNI = new TreeSet<>(getManhattanComparator());
            for(int i = 0; i < tabela.length; i++){
                for(int y = 0; y < tabela[0].length; y++){
                    if(tabela[i][y]){
                        VRNI.add(new Celica(i, y));
                    }
                }
            }
            return VRNI;
        }

        // dopolnite po potrebi ...
    }
}
