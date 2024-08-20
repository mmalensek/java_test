
/*
 * tj.exe
 */

import java.util.*;

public class Cetrta {

    public static class Tocka {
        private int x;
        private int y;

        public Tocka(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return String.format("(%d, %d)", this.x, this.y);
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Tocka)) {
                return false;
            }
            Tocka druga = (Tocka) obj;
            return this.x == druga.x && this.y == druga.y;
        }

        @Override
        public int hashCode() {
            return 17 * this.x + 31 * this.y;
        }

        public Map<Boolean, List<Tocka>> razdeli(Collection<Tocka> tocke) {
            Map<Boolean, List<Tocka>> VRNI = new HashMap<Boolean,List<Tocka>>();
            
            Iterator<Tocka> iterator = tocke.iterator();
            ArrayList<Tocka> DA = new ArrayList<>();
            ArrayList<Tocka> NE = new ArrayList<>();
            
            while(iterator.hasNext()){
                Tocka trenutna = iterator.next();
                if (trenutna.x > this.x) {
                    DA.add(trenutna);
                }else{
                    NE.add(trenutna);
                }
            }

            VRNI.put(true, DA);
            VRNI.put(false, NE);
            
            return VRNI;
        }

        public static Comparator<Tocka> polarno() {
            
            return new Comparator<Tocka>() {
                @Override
                public int compare(Tocka tocka1, Tocka tocka2) {
                    // Kvadrat razdalje do izhodišča
                    int razdaljaKvadrat1 = tocka1.x * tocka1.x + tocka1.y * tocka1.y;
                    int razdaljaKvadrat2 = tocka2.x * tocka2.x + tocka2.y * tocka2.y;

                    if (razdaljaKvadrat1 != razdaljaKvadrat2) {
                        return Integer.compare(razdaljaKvadrat1, razdaljaKvadrat2);
                    }

                    // Polarni kot
                    double kot1 = Math.atan2(tocka1.y, tocka1.x);
                    double kot2 = Math.atan2(tocka2.y, tocka2.x);

                    return Double.compare(kot1, kot2);
                }
            };

        }
    }

    public static void main(String[] args) {
        // koda za ro"cno testiranje (po potrebi)
    }
}
