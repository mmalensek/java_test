
/*
Samodejno testiranje:
tj.exe

Testni primeri:

01..03: toString
04..06: equals
07..10: hashCode

01, 04, 07: ročno izdelani; isti podatki v vseh treh razredih
*/

import java.util.*;

public class Tretja {

    public static class Tablica {
        private char[] kraj;
        private int stevilo;
        private boolean zacasna;

        public Tablica(char[] kraj, int stevilo, boolean zacasna) {
            this.kraj = new char[]{kraj[0], kraj[1]};
            this.stevilo = stevilo;
            this.zacasna = zacasna;
        }

        @Override
        public String toString(){
            String VRNI = "";

            VRNI += Character.toString(this.kraj[0]) + Character.toString(this.kraj[1]);
            VRNI += " ";
            VRNI += Integer.toString(this.stevilo / 100) + "-" + Integer.toString(this.stevilo % 100);

            return VRNI;
        }

        @Override
        public boolean equals(Object nekaT){
            if(nekaT instanceof Tablica){
                Tablica neka = (Tablica) nekaT;
                if(this.zacasna == neka.zacasna && this.kraj[0] == neka.kraj[0] && this.kraj[1] == neka.kraj[1] && this.stevilo == neka.stevilo){
                    return true;
            }
            }
            return false;
            
        }

        @Override
        public int hashCode(){
            int VRNI = 0;
            VRNI += stevilo;
            if(zacasna){
                VRNI+=33333;
            }else{
                VRNI+=111;
            }
            VRNI += kraj[0];
            VRNI += kraj[1] * 10;
            return VRNI;
        }

    }
}