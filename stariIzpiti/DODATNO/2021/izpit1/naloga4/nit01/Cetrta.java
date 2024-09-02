
/*
 * tj.exe
 */

import java.util.*;

public class Cetrta {

    //=========================================================================
    public static class Barva {
        private int r;
        private int g;
        private int b;

        public Barva(int r, int g, int b) {
            this.r = r;
            this.g = g;
            this.b = b;
        }

        @Override
        public String toString() {
            return String.format("(%d, %d, %d)", this.r, this.g, this.b);
        }
    }

    //=========================================================================
    public static abstract class Lik {
        private Barva barva;

        protected Lik(Barva barva) {
            this.barva = barva;
        }

        public abstract String vrsta(); 
        public abstract String mere(); 

        @Override
        public String toString() {
            return String.format("%s [%s, %s]", this.vrsta(), this.barva, this.mere());
        }

        public abstract int ploscina();
    }

    //=========================================================================
    public static class Pravokotnik extends Lik {
        private int a;
        private int b;

        public Pravokotnik(Barva barva, int a, int b) {
            super(barva);
            this.a = a;
            this.b = b;
        }

        public int vrniA() {
            return this.a;
        }

        @Override
        public String vrsta() {
            return "pravokotnik";
        }

        @Override
        public String mere() {
            return String.format("a = %d, b = %d", this.a, this.b);
        }

        @Override
        public int ploscina(){
            return a * b;
        }
    }

    //=========================================================================
    public static class Kvadrat extends Pravokotnik {
        public Kvadrat(Barva barva, int a) {
            super(barva, a, a);
        }

        @Override
        public String vrsta() {
            return "kvadrat";
        }

        @Override
        public String mere() {
            return String.format("a = %d", this.vrniA());
        }
    }

    //=========================================================================
    public static class Krog extends Lik {
        private int r;

        public Krog(Barva barva, int r) {
            super(barva);
            this.r = r;
        }

        @Override
        public String vrsta() {
            return "krog";
        }

        @Override
        public String mere() {
            return String.format("r = %d", this.r);
        }

        @Override
        public int ploscina(){
            return (int) Math.round(Math.PI * r * r);
        }
    }

    //=========================================================================
    public static void urediNaravno(List<Lik> liki) {
        Comparator<Lik> VRNI = new Comparator<>() {
            public int compare(Lik ena, Lik dva){
                if(ena.ploscina() < dva.ploscina()){
                    return -1;
                }
                if(ena.ploscina() == dva.ploscina()){
                    return 0;
                }else{
                    return 1;
                }
            }
        };

        liki.sort(VRNI);
    }

    //=========================================================================
    public static Collection<Lik> poTipuInBarvi(Collection<Lik> liki) {
        List<Lik> VRNI = new LinkedList<>(liki);

        Comparator<Lik> komparator = new Comparator<>() {
            public int compare(Lik ena, Lik dva){
                if(ena.getClass() == dva.getClass()){
                    if(ena.barva.r == dva.barva.r){
                        if(ena.barva.g == dva.barva.g){
                            return ena.barva.b - dva.barva.b;
                        }
                        return ena.barva.g - dva.barva.g;
                    }
                    return ena.barva.r - dva.barva.r;
                }
                if(ena instanceof Pravokotnik && !(ena instanceof Kvadrat)){
                    return -1;
                }if(ena instanceof Krog){
                    return 1;
                }else if(dva instanceof Krog){
                    return -1;
                }else{
                    return 1;
                }
            }
        };

        VRNI.sort(komparator);

        return VRNI;
    }

    //=========================================================================
    public static void main(String[] args) {
        // koda za ro"cno testiranje (po potrebi)
    }
}
