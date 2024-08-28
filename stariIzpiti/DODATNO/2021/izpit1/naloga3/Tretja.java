
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
            // popravite / dopolnite ...
            return 0;
        }

        public boolean jePermutacijaOd(Object drugi) {
            // popravite / dopolnite ...
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
            // popravite / dopolnite ...
            return 0;
        }
    }

    //=========================================================================
    public static void main(String[] args) {
        // koda za ro"cno testiranje (po potrebi)
    }

}
