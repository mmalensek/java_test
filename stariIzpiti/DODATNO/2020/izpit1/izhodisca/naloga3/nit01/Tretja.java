
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

    public static class Zaposleni {
        private String ip;
        private int placa;
        private Vodja nadrejeni;

        public Zaposleni(String ip, int placa, Vodja nadrejeni) {
            this.ip = ip;
            this.placa = placa;
            this.nadrejeni = nadrejeni;
        }

        public int placa(){
            return this.placa;
        }

        public Zaposleni visji(){
            return this.nadrejeni;
        }

        @Override
        public String toString() {
            return this.ip;
        }

        public int placaNadrejenega() {
            if(this.nadrejeni != null){
                return this.nadrejeni.placa();
            }
            return -1;
        }

        public static int steviloAnomalij(Zaposleni[] zaposleni) {
            int stevec = 0;
            for(int i = 0; i < zaposleni.length; i++){
                if(zaposleni[i] instanceof Delavec){
                    for(int y = 0; y < zaposleni.length; y++){
                        if(zaposleni[y] instanceof Vodja && zaposleni[y].placa() < zaposleni[i].placa()){
                            stevec++;
                        }
                    }
                }
            }
            return stevec;
        }
    }

    public static class Delavec extends Zaposleni {
        public Delavec(String ip, int placa, Vodja nadrejeni) {
            super(ip, placa, nadrejeni);
        }
    }

    public static class Vodja extends Zaposleni {
        public Vodja(String ip, int placa, Vodja nadrejeni) {
            super(ip, placa, nadrejeni);
        }

        public Vodja vrhovni() {
            Vodja VRNI = this;
            Vodja temp = (Vodja) this.visji();
            while(temp != null){
                VRNI = temp;
                temp = (Vodja) temp.visji();
            }

            return VRNI;
        }
    }
}
