
/*
 * tj.exe
 */

import java.util.*;

public class Tretja {

    //=========================================================================
    public static class Opravilo {
        private String naziv;
        private int zahtevnost;

        public Opravilo(String naziv, int zahtevnost) {
            this.naziv = naziv;
            this.zahtevnost = zahtevnost;
        }
    }

    //=========================================================================
    public static class Projekt {
        private String naziv;
        private Opravilo[] opravila;

        public Projekt(String naziv, Opravilo[] opravila) {
            this.naziv = naziv;
            this.opravila = opravila;
        }

        public int zahtevnost() {
            int maxZahtevnost = 0;

            for(int i = 0; i < this.opravila.length; i++){
                if(opravila[i].zahtevnost > maxZahtevnost){
                    maxZahtevnost = opravila[i].zahtevnost;
                }
            }

            return maxZahtevnost;
        }

        public boolean jePermutacijaOd(Object drugi) {
            if(drugi.getClass() == this.getClass()){
                Projekt temp = (Projekt) drugi;

                if(temp.opravila.length != this.opravila.length){
                    return false;
                }

                int stevec = 0;
                for(int i = 0; i < temp.opravila.length; i++){
                    boolean najden = false;
                    for(int y = 0; y < this.opravila.length; y++){
                        if(this.opravila[y] == temp.opravila[i]){
                            najden = true;
                            break;
                        }
                    }
                    if(najden){
                        stevec++;
                    }
                }
                if(stevec == temp.opravila.length){
                    return true;
                }
            }
            return false;
        }
    }

    //=========================================================================
    public static class Delavec {
        private String ip;
        private int usposobljenost;

        public Delavec(String ip, int usposobljenost) {
            this.ip = ip;
            this.usposobljenost = usposobljenost;
        }
    }

    //=========================================================================
    public static class Delavnica {
        private Delavec[] delavci;

        public Delavnica(Delavec[] delavci) {
            this.delavci = delavci;
        }

        public int univerzalci(Projekt[] projekti) {
            int stevecUniverzalcov = 0;

            for(int i = 0; i < delavci.length; i++){
                boolean jeUniverzalec = true;
                for(int y = 0; y < projekti.length; y++){
                    if(delavci[i].usposobljenost < projekti[y].zahtevnost()){
                        jeUniverzalec = false;
                        break;
                    }
                }
                if(jeUniverzalec){
                    stevecUniverzalcov++;
                }
            }

            return stevecUniverzalcov;
        }
    }

    //=========================================================================
    public static void main(String[] args) {
        // koda za ro"cno testiranje (po potrebi)
    }

}
