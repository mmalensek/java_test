
/*
 * tj.exe
 */

/*
 * Razli"cni objekti tipa Oseba, Cilj oz. Nocitev predstavljajo razli"cne
 * osebe, cilje oz. no"citve.
 *
 * Distinct objects of classes Oseba, Cilj, and Nocitev represent distinct
 * persons, destinations, and overnight stays.
 */

import java.util.*;

public class Tretja {

    //=========================================================================
    public static class Oseba {
        private String ip;
        private String drzava;

        public Oseba(String ip, String drzava) {
            this.ip = ip;
            this.drzava = drzava;
        }

        public String vrniDrzavo(){
            return this.drzava;
        } 
    }

    //=========================================================================
    public static class Cilj {
        private String kraj;
        private String drzava;

        public Cilj(String kraj, String drzava) {
            this.kraj = kraj;
            this.drzava = drzava;
        }
    }

    //=========================================================================
    public static class Nocitev {
        private Oseba oseba;
        private Cilj cilj;
        private int leto;

        public Nocitev(Oseba oseba, Cilj cilj, int leto) {
            this.oseba = oseba;
            this.cilj = cilj;
            this.leto = leto;
        }
    }

    //=========================================================================
    public static int notranje(Nocitev[] nocitve) {
        int stevec = 0;
        
        for(int i = 0; i < nocitve.length; i++){
            if(nocitve[i].cilj.drzava.compareTo(nocitve[i].oseba.drzava) == 0){
                stevec++;
            }
        }
        return stevec;
    }

    //=========================================================================
    public static boolean jeZvesta(Nocitev[] nocitve, Oseba oseba) {
        for(int i = 0; i + 1 < nocitve.length; i++){
            if(nocitve[i].oseba == oseba){
                for(int y = i + 1; y < nocitve.length; y++){
                    if(nocitve[y].oseba == oseba){
                        if(nocitve[i].cilj.kraj.compareTo(nocitve[y].cilj.kraj) != 0){
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    //=========================================================================
    public static int[][] obiskanost(Nocitev[] nocitve, Cilj[] cilji, int minLeto, int maxLeto) {
        int[][] VRNI = new int[cilji.length][maxLeto - minLeto + 1];

        for(int i = 0; i < nocitve.length; i++){
            if(nocitve[i].leto <= maxLeto && nocitve[i].leto >= minLeto){
                for(int y = 0; y < cilji.length; y++){
                    if(nocitve[i].cilj == cilji[y]){
                        VRNI[y][nocitve[i].leto - minLeto]++;
                    }
                }
            }
        }

        return VRNI;
    }

    //=========================================================================
    public static void main(String[] args) {
        // koda za ro"cno testiranje (po potrebi)
    }
}
