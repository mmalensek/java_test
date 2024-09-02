
import java.util.*;

public class Tretja {

    public static abstract class Zival {
        public abstract String oglasiSe();
    }

    public static class Pes extends Zival {
        public String oglasiSe(){
            return "hov";
        }
    }

    public static class Macka extends Zival {
        public String oglasiSe(){
            return "mijav";
        }
    }

    public static class RodovniskiPes extends Pes {
        private String pasma;
        private RodovniskiPes oce;
        private RodovniskiPes mati;

        public RodovniskiPes(String pasma, RodovniskiPes oce, RodovniskiPes mati) {
            this.pasma = pasma;
            this.oce = oce;
            this.mati = mati;
        }

        public boolean preveri() {
            if((this.oce == null && this.mati == null) || (this.oce.pasma.compareTo(this.pasma) == 0) && this.mati.pasma.compareTo(this.pasma) == 0 && this.mati.preveri() == true && this.oce.preveri() == true){
                return true;
            }
            return false;
        }

        // po potrebi dopolnite ...
    }

    public static int prestej(RodovniskiPes[] psi, String pasma) {
        int stevec = 0;

        for(int i = 0; i < psi.length; i++){
            if(psi[i].pasma.compareTo(pasma) == 0){
                stevec++;
            }
        }

        return stevec;
    }
}
