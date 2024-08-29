
/*
 * Testiranje:
 *
 * tj.exe
 */

import java.util.*;

public class Tretja {

    public static void main(String[] args) {
        // koda za ro"cno testiranje (po "zelji)
    }

    //=========================================================================
    public static abstract class Ukaz {

        public static int bilanca(Ukaz[] ukazi) {
            int razlika = 0;

            for(int i = 0; i < ukazi.length; i++){
                if(ukazi[i] instanceof Postavi){
                    razlika++;
                }else{
                    razlika--;
                }
            }

            return razlika;
        }

        @Override
        public abstract String toString();

        public abstract void izvedi(int[] stolpi);

        public Ukaz zaporedje(Ukaz drugi) {
            return new ZaporedniUkaz(this, drugi);
        }

        private static class ZaporedniUkaz extends Ukaz{
            Ukaz prvi;
            Ukaz drugi;

            public ZaporedniUkaz(Ukaz prvi, Ukaz drugi){
                this.prvi = prvi;
                this.drugi = drugi;
            }

            public String toString(){
                return "["+prvi.toString()+", "+drugi.toString()+"]";
            }
            public void izvedi(int[] stolpi){
                prvi.izvedi(stolpi);
                drugi.izvedi(stolpi);
            }
        }
    }

    //=========================================================================
    public static class Postavi extends Ukaz {
        private int kam;

        // V vseh testnih primerih velja:
        // kam >= 0

        @Override
        public String toString(){
            String VRNI = "+";
            return VRNI + kam;
        }

        @Override
        public void izvedi(int[] stolpi){
            if(kam > stolpi.length){
                
            }
            else{
                stolpi[kam]++;
            }
        }

        public Postavi(int kam) {
            this.kam = kam;
        }

        // po potrebi dopolnite ...
    }

    //=========================================================================
    public static class Odvzemi extends Ukaz {
        private int odkod;

        // V vseh testnih primerih velja:
        // odkod >= 0

        @Override
        public String toString(){
            String VRNI = "-";
            return VRNI + odkod;
        }

        @Override
        public void izvedi(int[] stolpi){
            if(odkod > stolpi.length || stolpi[odkod] == 0){
                
            }
            else {
                stolpi[odkod]--;
            }
        }

        public Odvzemi(int odkod) {
            this.odkod = odkod;
        }

        // po potrebi dopolnite ...
    }

    //=========================================================================
    // po potrebi dopolnite ...
}
