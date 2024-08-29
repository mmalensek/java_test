
/*
 * Testiranje:
 *
 * tj.exe
 */

public class Tretja {

    public static abstract class Drevo {
        private int x;
        private int y;

        protected Drevo(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public abstract String vrsta();

        @Override
        public String toString() {
            return String.format("%s(%d, %d)", this.vrsta(), this.x, this.y);
        }

        public int d2(Drevo drevo) {
            return (drevo.x - this.x) * (drevo.x - this.x) + (drevo.y - this.y) * (drevo.y - this.y);
        }

        // po potrebi dopolnite ...
    }

    public static abstract class Listavec extends Drevo {
        protected Listavec(int x, int y) {
            super(x, y);
        }
        // po potrebi dopolnite ...
    }

    public static abstract class Iglavec extends Drevo {
        protected Iglavec(int x, int y) {
            super(x, y);
        }
        // po potrebi dopolnite ...
    }

    public static class Hrast extends Listavec {
        public Hrast(int x, int y) {
            super(x, y);
        }

        @Override
        public String vrsta() {
            return "Hrast";
        }

        // po potrebi dopolnite ...
    }

    public static class Bukev extends Listavec {
        public Bukev(int x, int y) {
            super(x, y);
        }

        @Override
        public String vrsta() {
            return "Bukev";
        }

        // po potrebi dopolnite ...
    }

    public static class Breza extends Listavec {
        public Breza(int x, int y) {
            super(x, y);
        }

        @Override
        public String vrsta() {
            return "Breza";
        }

        // po potrebi dopolnite ...
    }

    public static class Smreka extends Iglavec {
        public Smreka(int x, int y) {
            super(x, y);
        }

        @Override
        public String vrsta() {
            return "Smreka";
        }

        // po potrebi dopolnite ...
    }

    public static class Jelka extends Iglavec {
        public Jelka(int x, int y) {
            super(x, y);
        }

        @Override
        public String vrsta() {
            return "Jelka";
        }

        // po potrebi dopolnite ...
    }

    public static class Bor extends Iglavec {
        public Bor(int x, int y) {
            super(x, y);
        }

        @Override
        public String vrsta() {
            return "Bor";
        }

        // po potrebi dopolnite ...
    }

    public static class Gozd {
        private Drevo[] drevesa;

        public Gozd(Drevo[] drevesa) {
            this.drevesa = drevesa;
        }

        public boolean jeListnat() {
            for(int i = 0; i < drevesa.length; i++){
                if(drevesa[i] instanceof Iglavec){
                    return false;
                }
            }
            return true;
        }

        public Drevo najblizjeIstovrstno(Drevo drevo) {
            Drevo VRNI = null;
            int minRazdalja = Integer.MAX_VALUE;

            for(int i = 0; i < drevesa.length; i++){
                if(drevesa[i].getClass() == drevo.getClass() && !drevo.equals(drevesa[i])){
                    if(drevo.d2(drevesa[i]) < minRazdalja){
                        minRazdalja = drevo.d2(drevesa[i]);
                        VRNI = drevesa[i];
                    }
                }
            }

            return VRNI;
        }

        // po potrebi dopolnite ...
    }

    public static void main(String[] args) {
        // koda za ro"cno testiranje (po "zelji)
    }

}
